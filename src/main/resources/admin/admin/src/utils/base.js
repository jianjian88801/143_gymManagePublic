const base = {
    get() {
        return {
            url : "http://localhost:8080/gym/",
            name: "gym",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/gym/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "健身房管理系统"
        } 
    }
}
export default base
