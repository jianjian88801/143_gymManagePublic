import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Storeup from '../pages/storeup/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import huiyuanList from '../pages/huiyuan/list'
import huiyuanDetail from '../pages/huiyuan/detail'
import huiyuanAdd from '../pages/huiyuan/add'
import jiaolianList from '../pages/jiaolian/list'
import jiaolianDetail from '../pages/jiaolian/detail'
import jiaolianAdd from '../pages/jiaolian/add'
import yuechongzhiList from '../pages/yuechongzhi/list'
import yuechongzhiDetail from '../pages/yuechongzhi/detail'
import yuechongzhiAdd from '../pages/yuechongzhi/add'
import huiyuanleixingList from '../pages/huiyuanleixing/list'
import huiyuanleixingDetail from '../pages/huiyuanleixing/detail'
import huiyuanleixingAdd from '../pages/huiyuanleixing/add'
import huiyuanbankaList from '../pages/huiyuanbanka/list'
import huiyuanbankaDetail from '../pages/huiyuanbanka/detail'
import huiyuanbankaAdd from '../pages/huiyuanbanka/add'
import daoqitixingList from '../pages/daoqitixing/list'
import daoqitixingDetail from '../pages/daoqitixing/detail'
import daoqitixingAdd from '../pages/daoqitixing/add'
import huiyuanxukaList from '../pages/huiyuanxuka/list'
import huiyuanxukaDetail from '../pages/huiyuanxuka/detail'
import huiyuanxukaAdd from '../pages/huiyuanxuka/add'
import jianshenkechengList from '../pages/jianshenkecheng/list'
import jianshenkechengDetail from '../pages/jianshenkecheng/detail'
import jianshenkechengAdd from '../pages/jianshenkecheng/add'
import baomingkechengList from '../pages/baomingkecheng/list'
import baomingkechengDetail from '../pages/baomingkecheng/detail'
import baomingkechengAdd from '../pages/baomingkecheng/add'
import jianshenshangpinList from '../pages/jianshenshangpin/list'
import jianshenshangpinDetail from '../pages/jianshenshangpin/detail'
import jianshenshangpinAdd from '../pages/jianshenshangpin/add'
import goumaishangpinList from '../pages/goumaishangpin/list'
import goumaishangpinDetail from '../pages/goumaishangpin/detail'
import goumaishangpinAdd from '../pages/goumaishangpin/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'storeup',
					component: Storeup
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'huiyuan',
					component: huiyuanList
				},
				{
					path: 'huiyuanDetail',
					component: huiyuanDetail
				},
				{
					path: 'huiyuanAdd',
					component: huiyuanAdd
				},
				{
					path: 'jiaolian',
					component: jiaolianList
				},
				{
					path: 'jiaolianDetail',
					component: jiaolianDetail
				},
				{
					path: 'jiaolianAdd',
					component: jiaolianAdd
				},
				{
					path: 'yuechongzhi',
					component: yuechongzhiList
				},
				{
					path: 'yuechongzhiDetail',
					component: yuechongzhiDetail
				},
				{
					path: 'yuechongzhiAdd',
					component: yuechongzhiAdd
				},
				{
					path: 'huiyuanleixing',
					component: huiyuanleixingList
				},
				{
					path: 'huiyuanleixingDetail',
					component: huiyuanleixingDetail
				},
				{
					path: 'huiyuanleixingAdd',
					component: huiyuanleixingAdd
				},
				{
					path: 'huiyuanbanka',
					component: huiyuanbankaList
				},
				{
					path: 'huiyuanbankaDetail',
					component: huiyuanbankaDetail
				},
				{
					path: 'huiyuanbankaAdd',
					component: huiyuanbankaAdd
				},
				{
					path: 'daoqitixing',
					component: daoqitixingList
				},
				{
					path: 'daoqitixingDetail',
					component: daoqitixingDetail
				},
				{
					path: 'daoqitixingAdd',
					component: daoqitixingAdd
				},
				{
					path: 'huiyuanxuka',
					component: huiyuanxukaList
				},
				{
					path: 'huiyuanxukaDetail',
					component: huiyuanxukaDetail
				},
				{
					path: 'huiyuanxukaAdd',
					component: huiyuanxukaAdd
				},
				{
					path: 'jianshenkecheng',
					component: jianshenkechengList
				},
				{
					path: 'jianshenkechengDetail',
					component: jianshenkechengDetail
				},
				{
					path: 'jianshenkechengAdd',
					component: jianshenkechengAdd
				},
				{
					path: 'baomingkecheng',
					component: baomingkechengList
				},
				{
					path: 'baomingkechengDetail',
					component: baomingkechengDetail
				},
				{
					path: 'baomingkechengAdd',
					component: baomingkechengAdd
				},
				{
					path: 'jianshenshangpin',
					component: jianshenshangpinList
				},
				{
					path: 'jianshenshangpinDetail',
					component: jianshenshangpinDetail
				},
				{
					path: 'jianshenshangpinAdd',
					component: jianshenshangpinAdd
				},
				{
					path: 'goumaishangpin',
					component: goumaishangpinList
				},
				{
					path: 'goumaishangpinDetail',
					component: goumaishangpinDetail
				},
				{
					path: 'goumaishangpinAdd',
					component: goumaishangpinAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
