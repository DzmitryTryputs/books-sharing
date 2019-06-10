<template>
  <nav class="navbar navbar-light">
    <div class="container">
      <ul class="nav navbar-nav pull-xs-right">
        <li class="nav-item">
          <router-link
            class="nav-link"
            active-class="active"
            exact
            :to="{ name: 'genres' }" >
            Genres
          </router-link>
        </li>
        <li class="nav-item">
          <router-link
            class="nav-link"
            active-class="active"
            exact
            :to="{ name: 'authors' }" >
            Authors
          </router-link>
        </li>
        <li class="nav-item">
          <router-link
                  class="nav-link"
                  active-class="active"
                  exact
                  :to="{ name: 'books' }" >
            Books
          </router-link>
        </li>
      </ul>
    </div>
  </nav>
</template>

<script>

export default {
  name: "Header"
};
</script>
