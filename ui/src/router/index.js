import Vue from 'vue'
import VueRouter from 'vue-router'
Vue.use(VueRouter)

const routes = [
    {
        path: '/',
        name: 'home',
        component: () => import('@/views/Desktop/FrameworkComponent')
    },
    {
        path: '/counter',
        name: 'counter',
        component: () => import('@/views/Counter/CounterComponent')
    },
    {
        path: '/order',
        name: 'order',
        component: ()=> import('@/views/Order/FrameworkComponent')
    }
];


const router = new VueRouter({
    mode: 'history',
    base: process.env.BASE_URL,
    routes: routes
});

export default router;
