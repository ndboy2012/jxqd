<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=${ak}"></script>
<%@include file="/context/mytags.jsp"%>
     <div class="top">
     <div class="containe  clearfix">
        <div class="top_left">
           <ul>
             <li><span id="locationCity"></span>[切换城市]</li>
             <li class="icons_stly icons_stly_sina"></li>
               <li class="icons_stly  icons_stly_weixin  weixin_tips" >
                  <div class="weixin_prompt"> 扫码关注驾校钱袋微信
                  <div class="attention"></div>
                  <span class="icon_personal"></span>
                 </div>
             </li>
             <li class="icons_stly  icons_stly_sc"></li>
           </ul>
        </div>
         <div class="top_right">
          <ul>
             <li>
                <c:if test="${userinfo==null}">
                   	<a href="${webRoot}/login" style="border-left:0">驾校钱袋欢迎您，<span>请登录</span></a>
                </c:if>
                <c:if test="${userinfo!=null}">
                   <a href="${webRoot}/myinfo" style="border-left:0">驾校钱袋欢迎您，<span>${userinfo.loginId}</span></a>
                </c:if>
             </li>
             <li><a href="${webRoot}/register">注册</a></li>
             <li class="menu_level">
                <a href="#" >我是驾校</a>   <em class="statusArrow  statusArrowDown"></em>
                <ul class="statusArrow_box">
                  <li><a href="ds_reg_a1 .html"style="border-left:0">入驻平台</a></li>
                  <li><a href="#"  style="border-left:0">登录后台</a></li>
               </ul>
             </li>
             <li  class="menu_level">
                  <a  href="#"  style="margin-left:0">我是加盟商</a> <em class="statusArrow statusArrowDown"></em>
                  <ul class="statusArrow_box">
                  <li><a  href="jms_reg_a1.html" style="border-left:0">入驻平台</a></li>
                  <li><a href="#"  style="border-left:0">登录后台</a></li>
               </ul>
             </li>
             <li><a href="${webRoot}/helpCenter">帮助中心</a></li>
          </ul>
        </div>
     </div>
     </div>
     <div class="logo">
       <div class="containe" style="background:url(${webRoot}/plugin/images/home/logo.png); background-repeat:no-repeat;">
       </div>
       <div id="allmap"></div>
     </div>
     
  <script type="text/javascript">
	var map = new BMap.Map("allmap");
	var geolocation = new BMap.Geolocation();
	var geoc = new BMap.Geocoder(); 
	geolocation.getCurrentPosition(function(r){
		if(this.getStatus() == BMAP_STATUS_SUCCESS){
			var point = new BMap.Point(r.point.lng,r.point.lat);
			geoc.getLocation(point, function(rs){
				var addComp = rs.addressComponents;
				$("#locationCity").html(addComp.city);
			});  
		}
		else {
			alert('failed'+this.getStatus());
		}        
	},{enableHighAccuracy: true});
</script>

