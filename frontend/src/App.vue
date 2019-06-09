<template>
  <div id="app">
    <Genres />
  </div>
</template>

<script>
import Genres from './components/Genres.vue'

export default {
  name: 'app',
  components: {
    Genres
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
