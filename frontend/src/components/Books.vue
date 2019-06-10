<template>
    <div>
        <table class="table">
            <thead>
            <tr>
                <th scope="col">ID</th>
                <th scope="col">Title</th>
                <th scope="col">Pages</th>
                <th scope="col">Authors</th>
                <th scope="col">Genres</th>
            </tr>
            </thead>
            <tbody>
            <tr v-for="(book, index) in books" :key="index">
                <td>{{book.id}}</td>
                <td>{{book.title}}</td>
                <td>{{book.pages}}</td>
                <td>{{joinAuthors(book.authors)}}</td>
                <td>{{joinGenres(book.genres)}}</td>

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
                books: []
            }
        },

        created() {
            axios.get(`/backend/api/books/list`)
                .then(response => {
                    this.books = response.data;
                });
        },
        methods: {
            joinGenres(genres) {
                let out = [];
                for (let i = 0; i < genres.length; i++) {
                    out.push(genres[i].name);
                }
                return out.join(", ");
            },

            joinAuthors(authors) {
                let out = [];
                for (let i = 0; i < authors.length; i++) {
                    out.push(authors[i].firstName + " " + authors[i].lastName);
                }
                return out.join(", ");
            }
        }

    }
</script>

<style scoped>

</style>