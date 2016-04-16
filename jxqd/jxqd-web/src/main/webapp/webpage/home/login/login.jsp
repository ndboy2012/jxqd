<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE HTML>
<head>
<meta charset="utf-8">
<title>登录</title>
<link rel="stylesheet" type="text/css" href="${webRoot}/plugin/home/css/common.css">
<link rel="stylesheet" type="text/css" href="${webRoot}/plugin/home/css/reset.css">
<link rel="stylesheet" type="text/css" href="${webRoot}/plugin/home/css/other.css">
<script type="text/javascript" src="${webRoot}/plugin/jquery/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="${webRoot}/plugin/jquery/jquery.min.js"></script>
<script type="text/javascript" src="${webRoot}/plugin/home/script/carousel.js"></script>
<script type="text/javascript" src="${webRoot}/plugin/home/script/menu_level.js"></script>
<script type="text/javascript" src="${webRoot}/plugin/layer/layer.js"></script>
<script type="text/javascript">
	$(function() {
		$(".top  .weixin_prompt").hide();
		$(".top .weixin_tips").mouseover(function() {
			$(".top  .weixin_prompt").show();

		}).mouseout(function() {
			$(".top .weixin_prompt").hide();
		});

	});
</script>
</head>
<body>
	<div class="main">
		<!--头部-->
		<div class="header">
			<jsp:include page="../common/header.jsp"></jsp:include>
		</div>
		<!--导航-->
		<div class="navbar">
			<jsp:include page="../common/navigation.jsp"></jsp:include>
		</div>
		<!--简介-->
		<div class="account-page">
			<div class="project clearfix">
				<jsp:include page="loginBox.jsp"></jsp:include>
			</div>
		</div>
		<!--简介结束-->
		<!--底部开始-->
		<div class="footbox">
			<jsp:include page="../common/footer.jsp"></jsp:include>
		</div>
		<!--底部结束-->
	</div>
</body>



