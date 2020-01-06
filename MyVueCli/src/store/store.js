import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

const store = new Vuex.Store({
  state: {
    count: 789789789
  },
  mutations: {
    increment (state) {
      state.count++
    }
  }
})
export default store
