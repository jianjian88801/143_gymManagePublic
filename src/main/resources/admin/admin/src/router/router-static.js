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
    import news from '@/views/modules/news/list'
    import jianshenkecheng from '@/views/modules/jianshenkecheng/list'
    import huiyuanxuka from '@/views/modules/huiyuanxuka/list'
    import jiaolian from '@/views/modules/jiaolian/list'
    import huiyuan from '@/views/modules/huiyuan/list'
    import goumaishangpin from '@/views/modules/goumaishangpin/list'
    import yuechongzhi from '@/views/modules/yuechongzhi/list'
    import baomingkecheng from '@/views/modules/baomingkecheng/list'
    import daoqitixing from '@/views/modules/daoqitixing/list'
    import systemintro from '@/views/modules/systemintro/list'
    import huiyuanbanka from '@/views/modules/huiyuanbanka/list'
    import config from '@/views/modules/config/list'
    import huiyuanleixing from '@/views/modules/huiyuanleixing/list'
    import jianshenshangpin from '@/views/modules/jianshenshangpin/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
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
    }
      ,{
	path: '/news',
        name: '公告信息',
        component: news
      }
      ,{
	path: '/jianshenkecheng',
        name: '健身课程',
        component: jianshenkecheng
      }
      ,{
	path: '/huiyuanxuka',
        name: '会员续卡',
        component: huiyuanxuka
      }
      ,{
	path: '/jiaolian',
        name: '教练',
        component: jiaolian
      }
      ,{
	path: '/huiyuan',
        name: '会员',
        component: huiyuan
      }
      ,{
	path: '/goumaishangpin',
        name: '购买商品',
        component: goumaishangpin
      }
      ,{
	path: '/yuechongzhi',
        name: '余额充值',
        component: yuechongzhi
      }
      ,{
	path: '/baomingkecheng',
        name: '报名课程',
        component: baomingkecheng
      }
      ,{
	path: '/daoqitixing',
        name: '到期提醒',
        component: daoqitixing
      }
      ,{
	path: '/systemintro',
        name: '系统简介',
        component: systemintro
      }
      ,{
	path: '/huiyuanbanka',
        name: '会员办卡',
        component: huiyuanbanka
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/huiyuanleixing',
        name: '会员类型',
        component: huiyuanleixing
      }
      ,{
	path: '/jianshenshangpin',
        name: '健身商品',
        component: jianshenshangpin
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
    name: '系统首页',
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
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
