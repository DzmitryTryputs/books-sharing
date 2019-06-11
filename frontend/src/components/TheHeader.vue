<template>
  <nav class="navbar navbar-light">
    <div>{{currentUser}}</div>
    <div>
      <router-link class="btn btn-lg btn-primary" to="/login" tag="button">Login</router-link>
      <button class="btn btn-lg btn-primary" v-on:click="logout()">Logout</button>
    </div>
    <div>
      <router-link class="btn btn-lg btn-primary" to="/genres" tag="button">Genres</router-link>
      <router-link class="btn btn-lg btn-primary" to="/authors" tag="button">Authors</router-link>
      <router-link class="btn btn-lg btn-primary" to="/books" tag="button">Books</router-link>
    </div>
  </nav>
</template>

<script>

import {mapGetters, mapState} from "vuex";
import axios from "axios";

export default {
  name: "Header",

  computed: {
    ...mapGetters(["currentUserId", "isAuthenticated"]),
    ...mapState({ ate: state => state.dictionary.authorizationToken,})
  },
  methods: {
    currentUser() {
      return this.currentUserId;
    },
    logout() {
        axios.post('/backend/logout', VueCookies.get('authorization'))
                .then(response => {
                  if (response.status === 200) {
                    removeAuthorization(response);
                  }
                })
                .then(() => this.$router.push({name: "genres"}))

    }
  }
};
</script>


computed: {
...mapGetters(["currentUser", "profile", "isAuthenticated"])
},
methods: {
isCurrentUser() {
if (this.currentUser.username && this.profile.username) {
return this.currentUser.username === this.profile.username;
}
return false;
},