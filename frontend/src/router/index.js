import Vue from "vue";
import Router from "vue-router";

Vue.use(Router);

export default new Router({
  routes: [
    {
      name: "genres",
      path: "/genres",
      component: () => import("../components/Genres")
    },
    {
      name: "books",
      path: "/books",
      component: () => import("../components/Books")
    },
    {
      name: "authors",
      path: "/authors",
      component: () => import("../components/Authors")
    },
    {
      name: "login",
      path: "/login",
      component: () => import("../components/Login")
    }
  ]
});
