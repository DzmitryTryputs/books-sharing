
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
    init(state, dictionaryData) {
        state.auth = true;

        let authorizationToken = VueCookies.get('authorization');
        const arrayOfStrings = authorizationToken.split(".");
        const idBase64 = arrayOfStrings[1];

        let tokenData = JSON.parse(atob(idBase64));
        const tokenSub = tokenData.sub;
        let strings = tokenSub.split(":");
        state.userId = strings[1];
        state.userRole = strings[2];
        state.login = false;
    }
};

export default {
    namespaced: true,
    mutations,
    getters,
    state
}
