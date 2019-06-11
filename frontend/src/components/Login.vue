<template>
    <div class="auth-page">
        <div class="container page">
            <div class="row">
                <div class="col-md-6 offset-md-3 col-xs-12">
                    <h1 class="text-xs-center">Sign in</h1>
                    <p class="text-xs-center">
                        <router-link :to="{ name: 'register' }">
                            Need an account?
                        </router-link>
                    </p>
                    <form v-on:submit.prevent="onSubmit(email, password)">
                        <fieldset class="form-group">
                            <input
                                    class="form-control form-control-lg"
                                    type="text"
                                    v-model="email"
                                    placeholder="Email"
                            />
                        </fieldset>
                        <fieldset class="form-group">
                            <input
                                    class="form-control form-control-lg"
                                    type="password"
                                    v-model="password"
                                    placeholder="Password"
                            />
                        </fieldset>
                        <button class="btn btn-lg btn-primary pull-xs-right">
                            Sign in
                        </button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
    import axios from 'axios';
    import VueCookies from 'vue-cookies';

    export default {
        name: "Login",
        data() {
            return {
                email: null,
                password: null
            };
        },
        methods: {
            onSubmit(email, password) {
                let credentials = {
                    email: email,
                    password: password
                };

                function addAuthorization(response) {
                    let authorization = response.headers.authorization;

                    VueCookies.config('7d');
                    VueCookies.set('authorization', authorization);
                }

                axios.post('/backend/login', credentials)
                    .then(response => { addAuthorization(response);

                    })
                    .then(() => this.$router.push({name: "genres"}))
            }
        }
    }

</script>

