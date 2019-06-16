
const state = {
    userId: "",
    login: true,
    auth: false,
    authorizationToken: ""
};

const getters = {
    currentUserId(state) {
        return state.userId;
    },
    isAuthenticated(state) {
        return state.auth;
    }
};

const mutations = {
};

export default {
    namespaced: true,
    mutations,
    getters,
    state
}
