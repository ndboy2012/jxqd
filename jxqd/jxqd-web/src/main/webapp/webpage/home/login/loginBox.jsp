<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="/context/mytags.jsp"%>
<script type="text/javascript" src="${webRoot}/plugin/validate/jquery.validate.js"></script>
<script type="text/javascript" src="${webRoot}/plugin/encry/rsa/jsbn.js"></script>
<script type="text/javascript" src="${webRoot}/plugin/encry/rsa/prng4.js"></script>
<script type="text/javascript" src="${webRoot}/plugin/encry/rsa/rng.js"></script>
<script type="text/javascript" src="${webRoot}/plugin/encry/rsa/rsa.js"></script>
<script type="text/javascript" src="${webRoot}/plugin/encry/JQuery.md5.js"></script>
<script type="text/javascript">
	function refresh(obj) {
		obj.src = "${webRoot}/randCodeImage?sessionRole=${sessionRole}&"+ Math.random();
	}
	
	//加密解密
	function doRSAEncrypt(input){	
		var rsa = new RSAKey();
		rsa.setPublic("${m}", "${e}");
		var res = rsa.encrypt(input);
		if(res == null) return input;
		return res;
	}
	
	$(function(){
	   $("#sub").click(function(){
		   var userName=$("#loginId").val();
			if(userName==null||userName==""){
				layer.alert("用户名不能为空");
				return;
			}
			var password1=$("#password").val();
			if(password1==null||password1==""){
				layer.alert("密码不能为空");
				return;
			}
			
		     var loginId = $("#loginId").val();
		     $.ajax({
		    	 url:"${webRoot}/my/loginId",
		    	 type:"post",
		    	 dataType:"json",
		    	 data :{
		    		 "loginId":loginId,
		    	 },
		    	 success:function(data) {
		    		 if(data.success) {
		    			loginId = data.result;
		    			var lid=loginId;
						var password=$("#password").val();
						var pwd=loginId+password;
						pwd=doRSAEncrypt($.md5(pwd));
						var validateCode=$("#validateCode").val();
						$.ajax({
							url:"${webRoot}/my/loginIn",
							type:"POST",
							dataType:"json",
							data:{
								 "vcode":validateCode,
								 "hash":pwd,
								 "lid":lid
							},
							success:function(data){
								if(data.success){
									layer.alert(data.msg);
								}else{
									$("#refreshImg").click();
							 		$("#password").focus();
							 		layer.alert(data.msg);
								}
							},
							error:function(){	
								layer.alert("登录异常",{icon:2});
							}			
						});	
		    		 } else {
		    			 layer.alert(data.msg,{icon:2});
		    		 }
		    	 },
		    	 error:function(data) {
		    		 layer.alert("登录异常",{icon:2});
		    	 }
		     });
	   });
	});
	
</script>
<div class="login_box">
	<div class="m1000">
		<div class="left-con">
			<img src="${webRoot}/plugin/images/home/login_img.jpg">
		</div>
		<div class="right-con">
			<form  id="ff" method="post" class="ui-form" data-name="login" novalidate>
				<legend>登录</legend>
				<div class="top-msg mb10">
					<label id="allError" class="error"></label>
				</div>
				<div class="ui-form-item">
					<label class="ui-label">手机号/邮箱</label> 
					<input class="ui-input input-icon input-bg-gray" id="loginId" placeholder="请输入手机号/邮箱">
					<span class="icon input-icon-head-gray"></span>
				</div>
				<div class="ui-form-item">
					<label class="ui-label">密码</label> 
					<input class="ui-input input-icon input-bg-gray" id="password" placeholder="请输入密码" type="password" >
					<span class="icon input-icon-lock-gray"></span>
				</div>
				<div class="ui-form-item">
					<label class="ui-label">密码</label> 
					<input class="ui-input_yzm input-icon input-bg-gray" placeholder="验证码" id="validateCode">
					<img title="点击更换" id="refreshImg" onclick="javascript:refresh(this);" width="100px" height="40px;" src="${webRoot}/randCodeImage?sessionRole=${sessionRole}" />
					<span class="icon input-icon-lock-gray"></span>
				</div>
				<div class="ui-form-item">
					<span class="ui-select"><input type="checkbox" checked="checked" id="rememberme" name="rememberme"></span> 
					<label for="rememberme">记住用户名</label> 
					<a href="ResetPassword - tel.html" class="findpsw">忘记密码？</a>
				</div>
				<div class="ui-form-into text-center">
					<input type="button" value="立即登录" id="sub" class="ui-button-rrd-blue ui-button-rrd-blue-large" />
				</div>
				<div class="ui-form-item text-center">
					<p class="go-reg">
						没有账号？ <a href="reg_a.html">免费注册</a>
					</p>
				</div>
			</form>
			<div class="bottom">
				<span>您还可以使用合作账号登录</span> 
				<a href="#" class="partner" id="partner-qq">腾讯账号</a> 
				<a href="#" class="partner" id="partner-weibo">新浪微博</a>
			</div>
		</div>
	</div>
</div>