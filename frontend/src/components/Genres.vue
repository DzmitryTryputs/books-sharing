<template>
    <div>
        <table class="table">
            <thead>
            <tr>
                <th scope="col">ID</th>
                <th scope="col">Name</th>
            </tr>
            </thead>
            <tbody>
            <tr v-for="(genre, index) in genres" :key="index">
                <td>{{genre.id}}</td>
                <td>{{genre.name}}</td>
            </tr>
            </tbody>
        </table>
    </div>
</template>

<script>
    import axios from 'axios';

    export default {
        data() {
            return {
                genres: []
            }
        },
        created() {

            axios.get(`/backend/api/genres/list`)
                .then(response => {
                    this.genres = response.data;
                });
        }
    }
</script>
<style scoped>

</style>
