<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="containe    clearfix">
	<ul class="navbar-nav fl">
		<li><a <c:if test="${isVisible==1}"> class="active"</c:if> href="${webRoot}/">首页</a></li>
		<li><a <c:if test="${isVisible==2}"> class="active"</c:if> href="${webRoot}/instalment">分期学车</a></li>
		<li><a <c:if test="${isVisible==3}"> class="active"</c:if> href="${webRoot}/lesson">全款学车</a></li>
		<li><a <c:if test="${isVisible==4}"> class="active"</c:if> href="${webRoot}/escort">学时陪练</a></li>
		<li><a <c:if test="${isVisible==5}"> class="active"</c:if> href="${webRoot}/about">关于我们</a></li>
	</ul>
	<ul class=" navbar-right">
		<li><a href="#">在线客服</a></li>
	</ul>
</div>