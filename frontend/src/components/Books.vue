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
            <tr v-for="(book, index) in booksData" :key="index">
                <td>{{book.id}}</td>
                <td>{{book.title}}</td>

            </tr>
            </tbody>
        </table>
    </div>
</template>

<script>
    import axios from 'axios';

    export default {
        name: "Books",
        data() {
            return {
                booksData: []
            }
        },

        created() {
            axios.get(`/backend/api/books/list`)
                .then(response => {
                    this.booksData = response.data;
                });
        }
    }
</script>

<style scoped>

</style>