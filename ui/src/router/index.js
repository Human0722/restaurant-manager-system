import Vue from 'vue'
import VueRouter from 'vue-router'
Vue.use(VueRouter)

const routes = [
    {
        path: '/',
        name: 'home',
        // component: () => import('@/views/Home/index')
        component: () => import('@/views/Layout/FrameworkComponent')
    }
];


const router = new VueRouter({
    mode: 'history',
    base: process.env.BASE_URL,
    routes: routes
});

export default router;
