import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'

     import users from '@/views/modules/users/list'
    import buhuoshneqing from '@/views/modules/buhuoshneqing/list'
    import buhuotixing from '@/views/modules/buhuotixing/list'
    import dictionary from '@/views/modules/dictionary/list'
    import quhuoshenqing from '@/views/modules/quhuoshenqing/list'
    import yonghu from '@/views/modules/yonghu/list'
    import dictionaryBuhuoshneqingYesno from '@/views/modules/dictionaryBuhuoshneqingYesno/list'
    import dictionaryBuhuotixing from '@/views/modules/dictionaryBuhuotixing/list'
    import dictionaryBuhuotixingStauts from '@/views/modules/dictionaryBuhuotixingStauts/list'
    import dictionaryQuhuoshenqingYesno from '@/views/modules/dictionaryQuhuoshenqingYesno/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'





//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryBuhuoshneqingYesno',
        name: '审核状态',
        component: dictionaryBuhuoshneqingYesno
    }
    ,{
        path: '/dictionaryBuhuotixing',
        name: '物品类型',
        component: dictionaryBuhuotixing
    }
    ,{
        path: '/dictionaryBuhuotixingStauts',
        name: '补货状态',
        component: dictionaryBuhuotixingStauts
    }
    ,{
        path: '/dictionaryQuhuoshenqingYesno',
        name: '审核状态',
        component: dictionaryQuhuoshenqingYesno
    }
    ,{
        path: '/dictionarySex',
        name: '性别',
        component: dictionarySex
    }


    ,{
        path: '/buhuoshneqing',
        name: '补货申请',
        component: buhuoshneqing
      }
    ,{
        path: '/buhuotixing',
        name: '补货提醒',
        component: buhuotixing
      }
    ,{
        path: '/dictionary',
        name: '字典表',
        component: dictionary
      }
    ,{
        path: '/quhuoshenqing',
        name: '取货申请',
        component: quhuoshenqing
      }
    ,{
        path: '/yonghu',
        name: '员工',
        component: yonghu
      }


    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
