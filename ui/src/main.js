import Vue from 'vue'
import App from './App.vue'

// 配置 vue-router
import router from './router'
// 配置 vuex
import store from './store'

// 配置 ElementUI(全局引入)
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
Vue.use(ElementUI)

Vue.config.productionTip = false

new Vue({
  router,
  store,
  render: h => h(App),
}).$mount('#app')
