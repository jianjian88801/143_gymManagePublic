<template>
	<div>
		<div class="container" :style='{"minHeight":"100vh","backgroundAttachment":"fixed","alignItems":"center","background":"url(http://codegen.caihongy.cn/20220730/f76d1bdbe6e54705a516e663d5d1114c.png)","display":"flex","width":"100%","backgroundSize":"cover","backgroundPosition":"center center","backgroundRepeat":"no-repeat","justifyContent":"center"}'>
			<el-form v-if="pageFlag=='register'" :style='{"padding":"80px 0","boxShadow":"0px 4px 10px 0px rgba(0,0,0,0.3020)","margin":"0","borderRadius":"50px","background":"#fff","width":"800px","height":"auto"}' ref="rgsForm" class="rgs-form" :model="rgsForm">
				<div v-if="true" :style='{"margin":"0 0 10px 0","color":"#000","textAlign":"center","width":"100%","lineHeight":"70px","fontSize":"26px","fontWeight":"bold"}' class="title">健身房管理系统注册</div>
				<el-form-item :style='{"width":"70%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='huiyuan'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">账号</div>
					<el-input  v-model="ruleForm.zhanghao"  autocomplete="off" placeholder="账号"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"70%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='huiyuan'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">密码</div>
					<el-input  v-model="ruleForm.mima"  autocomplete="off" placeholder="密码"  type="password"  />
				</el-form-item>
				<el-form-item :style='{"width":"70%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='huiyuan'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">确认密码</div>
					<el-input  v-model="ruleForm.mima2" autocomplete="off" placeholder="确认密码" type="password" />
				</el-form-item>
				<el-form-item :style='{"width":"70%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='huiyuan'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">姓名</div>
					<el-input  v-model="ruleForm.xingming"  autocomplete="off" placeholder="姓名"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"70%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='huiyuan'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">年龄</div>
					<el-input  v-model="ruleForm.nianling"  autocomplete="off" placeholder="年龄"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"70%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='huiyuan'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">性别</div>
                    <el-select v-model="ruleForm.xingbie" placeholder="请选择性别" >
                        <el-option
                            v-for="(item,index) in huiyuanxingbieOptions"
                            v-bind:key="index"
                            :label="item"
                            :value="item">
                        </el-option>
                    </el-select>
				</el-form-item>
				<el-form-item :style='{"width":"70%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='huiyuan'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">手机</div>
					<el-input  v-model="ruleForm.shouji"  autocomplete="off" placeholder="手机"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"70%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='huiyuan'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">头像</div>
                    <file-upload
                        tip="点击上传头像"
                        action="file/upload"
                        :limit="3"
                        :multiple="true"
                        :fileUrls="ruleForm.touxiang?ruleForm.touxiang:''"
                        @change="huiyuantouxiangUploadChange"
                    ></file-upload>
				</el-form-item>
				<el-form-item :style='{"width":"70%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='jiaolian'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">教练账号</div>
					<el-input  v-model="ruleForm.jiaolianzhanghao"  autocomplete="off" placeholder="教练账号"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"70%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='jiaolian'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">密码</div>
					<el-input  v-model="ruleForm.mima"  autocomplete="off" placeholder="密码"  type="password"  />
				</el-form-item>
				<el-form-item :style='{"width":"70%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='jiaolian'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">确认密码</div>
					<el-input  v-model="ruleForm.mima2" autocomplete="off" placeholder="确认密码" type="password" />
				</el-form-item>
				<el-form-item :style='{"width":"70%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='jiaolian'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">教练姓名</div>
					<el-input  v-model="ruleForm.jiaolianxingming"  autocomplete="off" placeholder="教练姓名"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"70%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='jiaolian'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">年龄</div>
					<el-input  v-model="ruleForm.nianling"  autocomplete="off" placeholder="年龄"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"70%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='jiaolian'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">教龄</div>
					<el-input  v-model="ruleForm.jiaoling"  autocomplete="off" placeholder="教龄"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"70%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='jiaolian'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">性别</div>
                    <el-select v-model="ruleForm.xingbie" placeholder="请选择性别" >
                        <el-option
                            v-for="(item,index) in jiaolianxingbieOptions"
                            v-bind:key="index"
                            :label="item"
                            :value="item">
                        </el-option>
                    </el-select>
				</el-form-item>
				<el-form-item :style='{"width":"70%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='jiaolian'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">联系电话</div>
					<el-input  v-model="ruleForm.lianxidianhua"  autocomplete="off" placeholder="联系电话"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"70%","padding":"0","margin":"0 auto 15px","height":"auto"}' class="list-item" v-if="tableName=='jiaolian'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">头像</div>
                    <file-upload
                        tip="点击上传头像"
                        action="file/upload"
                        :limit="3"
                        :multiple="true"
                        :fileUrls="ruleForm.touxiang?ruleForm.touxiang:''"
                        @change="jiaoliantouxiangUploadChange"
                    ></file-upload>
				</el-form-item>
				<button :style='{"border":"0","cursor":"pointer","padding":"0 10px","boxShadow":"0 0 0px rgba(64, 158, 255, .5)","margin":"20px auto 5px","color":"#fff","display":"block","outline":"none","borderRadius":"0","background":"#4662A1","width":"60%","fontSize":"18px","height":"70px"}' type="button" class="r-btn" @click="login()">注册</button>
				<div :style='{"cursor":"pointer","padding":"0 10%","color":"rgba(159, 159, 159, 1)","textAlign":"center","display":"inline-block","width":"100%","fontSize":"12px","textDecoration":"underline"}' class="r-login" @click="close()">已有账号，直接登录</div>
			</el-form>

		</div>
	</div>
</template>

<script>

export default {
	data() {
		return {
			ruleForm: {
                xingbie: '',
                jine: '0',
                youxiaotianshu: '',
                xingbie: '',
			},

            pageFlag : '',
			tableName:"",
			rules: {},
            huiyuanxingbieOptions: [],
            huiyuanhuiyuankaleixingOptions: [],
            jiaolianxingbieOptions: [],
		};
	},
	mounted(){
        this.pageFlag = this.$storage.get("pageFlag");
		let table = this.$storage.get("loginTable");
		this.tableName = table;
        this.huiyuanxingbieOptions = "男,女".split(',')
        this.$http({
            url: `option/huiyuanleixing/huiyuankaleixing`,
            method: "get"
        }).then(({ data }) => {
            if (data && data.code === 0) {
                this.huiyuanhuiyuankaleixingOptions = data.data;
            } else {
                this.$message.error(data.msg);
            }
        });
        this.jiaolianxingbieOptions = "男,女".split(',')
	},
	created() {

	},
	destroyed() {
		  	},
	methods: {
		// 获取uuid
		getUUID () {
			return new Date().getTime();
		},
		close(){
			this.$router.push({ path: "/login" });
		},
        huiyuantouxiangUploadChange(fileUrls) {
            this.ruleForm.touxiang = fileUrls;
        },
        // 下二随
        huiyuanhuiyuankaleixingChange () {
            this.$http({
                url: `follow/huiyuanleixing/huiyuankaleixing?columnValue=`+ this.ruleForm.huiyuankaleixing,
                method: "get"
            }).then(({ data }) => {
                if (data && data.code === 0) {
                    if(data.data.youxiaotianshu){
                        this.ruleForm.youxiaotianshu = data.data.youxiaotianshu
                    }
                } else {
                    this.$message.error(data.msg);
                }
            });
        },
        jiaoliantouxiangUploadChange(fileUrls) {
            this.ruleForm.touxiang = fileUrls;
        },

        // 多级联动参数


		// 注册
		login() {
			var url=this.tableName+"/register";
					if((!this.ruleForm.zhanghao) && `huiyuan` == this.tableName){
						this.$message.error(`账号不能为空`);
						return
					}










					if((!this.ruleForm.mima) && `huiyuan` == this.tableName){
						this.$message.error(`密码不能为空`);
						return
					}










					if((this.ruleForm.mima!=this.ruleForm.mima2) && `huiyuan` == this.tableName){
						this.$message.error(`两次密码输入不一致`);
						return
					}
					if((!this.ruleForm.xingming) && `huiyuan` == this.tableName){
						this.$message.error(`姓名不能为空`);
						return
					}













					if(`huiyuan` == this.tableName && this.ruleForm.nianling&&(!this.$validate.isIntNumer(this.ruleForm.nianling))){
						this.$message.error(`年龄应输入整数`);
						return
					}























					if(`huiyuan` == this.tableName && this.ruleForm.shouji&&(!this.$validate.isMobile(this.ruleForm.shouji))){
						this.$message.error(`手机应输入手机格式`);
						return
					}




            if(this.ruleForm.touxiang!=null) {
                this.ruleForm.touxiang = this.ruleForm.touxiang.replace(new RegExp(this.$base.url,"g"),"");
            }














					if(`huiyuan` == this.tableName && this.ruleForm.jine&&(!this.$validate.isNumber(this.ruleForm.jine))){
						this.$message.error(`金额应输入数字`);
						return
					}



























					if((!this.ruleForm.jiaolianzhanghao) && `jiaolian` == this.tableName){
						this.$message.error(`教练账号不能为空`);
						return
					}










					if((!this.ruleForm.mima) && `jiaolian` == this.tableName){
						this.$message.error(`密码不能为空`);
						return
					}










					if((this.ruleForm.mima!=this.ruleForm.mima2) && `jiaolian` == this.tableName){
						this.$message.error(`两次密码输入不一致`);
						return
					}













					if(`jiaolian` == this.tableName && this.ruleForm.nianling&&(!this.$validate.isIntNumer(this.ruleForm.nianling))){
						this.$message.error(`年龄应输入整数`);
						return
					}










					if(`jiaolian` == this.tableName && this.ruleForm.jiaoling&&(!this.$validate.isIntNumer(this.ruleForm.jiaoling))){
						this.$message.error(`教龄应输入整数`);
						return
					}























					if(`jiaolian` == this.tableName && this.ruleForm.lianxidianhua&&(!this.$validate.isMobile(this.ruleForm.lianxidianhua))){
						this.$message.error(`联系电话应输入手机格式`);
						return
					}




            if(this.ruleForm.touxiang!=null) {
                this.ruleForm.touxiang = this.ruleForm.touxiang.replace(new RegExp(this.$base.url,"g"),"");
            }












			this.$http({
				url: url,
				method: "post",
				data:this.ruleForm
			}).then(({ data }) => {
				if (data && data.code === 0) {
					this.$message({
						message: "注册成功",
						type: "success",
						duration: 1500,
						onClose: () => {
							this.$router.replace({ path: "/login" });
						}
					});
				} else {
					this.$message.error(data.msg);
				}
			});
		}
	}
};
</script>

<style lang="scss" scoped>
	.container {
	  position: relative;
	  background: url(http://codegen.caihongy.cn/20220730/f76d1bdbe6e54705a516e663d5d1114c.png);

		.el-date-editor.el-input {
		  width: 100%;
		}

		.rgs-form .el-input /deep/ .el-input__inner {
						border: 0;
						border-radius: 0;
						padding: 0 10px;
						box-shadow: 0px 4px 10px 0px rgba(0,0,0,0.3020);
						outline: none;
						color: #000;
						width: 100%;
						font-size: 14px;
						height: 44px;
					}

		.rgs-form .el-select /deep/ .el-input__inner {
						border: 0;
						border-radius: 0;
						padding: 0 10px;
						box-shadow: 0px 4px 10px 0px rgba(0,0,0,0.3020);
						outline: none;
						color: #000;
						width: 560px;
						font-size: 14px;
						height: 44px;
					}

		.rgs-form .el-date-editor /deep/ .el-input__inner {
						border: 0;
						border-radius: 0;
						padding: 0 10px 0 30px;
						box-shadow: 0px 4px 10px 0px rgba(0,0,0,0.3020);
						outline: none;
						color: #000;
						width: 100%;
						font-size: 14px;
						height: 44px;
					}

		.rgs-form .el-date-editor /deep/ .el-input__inner {
						border: 0;
						border-radius: 0;
						padding: 0 10px 0 30px;
						box-shadow: 0px 4px 10px 0px rgba(0,0,0,0.3020);
						outline: none;
						color: #000;
						width: 100%;
						font-size: 14px;
						height: 44px;
					}

		.rgs-form /deep/ .el-upload--picture-card {
			background: transparent;
			border: 0;
			border-radius: 0;
			width: auto;
			height: auto;
			line-height: initial;
			vertical-align: middle;
		}

		.rgs-form /deep/ .upload .upload-img {
		  		  border: 1px dashed #888;
		  		  cursor: pointer;
		  		  border-radius: 8px;
		  		  color: #888;
		  		  width: 160px;
		  		  font-size: 32px;
		  		  line-height: 160px;
		  		  text-align: center;
		  		  height: 160px;
		  		}

		.rgs-form /deep/ .el-upload-list .el-upload-list__item {
		  		  border: 1px dashed #888;
		  		  cursor: pointer;
		  		  border-radius: 8px;
		  		  color: #888;
		  		  width: 160px;
		  		  font-size: 32px;
		  		  line-height: 160px;
		  		  text-align: center;
		  		  height: 160px;
		  		}

		.rgs-form /deep/ .el-upload .el-icon-plus {
		  		  border: 1px dashed #888;
		  		  cursor: pointer;
		  		  border-radius: 8px;
		  		  color: #888;
		  		  width: 160px;
		  		  font-size: 32px;
		  		  line-height: 160px;
		  		  text-align: center;
		  		  height: 160px;
		  		}
	}
</style>
