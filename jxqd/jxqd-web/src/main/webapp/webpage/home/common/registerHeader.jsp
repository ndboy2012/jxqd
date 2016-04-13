<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="/context/mytags.jsp"%>
 <div class="top">
     <div class="containe  clearfix">
        <div class="top_left">
           <ul>
             <li><span>合肥</span> [切换城市]</li>
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
             <li> <a href="${webRoot}/login" style="border-left:0">登录</a></li>
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
     <div class="reg_top">
        <div class="containe">
         <div class="img-box"><img src="${webRoot}/plugin/images/home/heade.png" height="80px"> </div>
          <div class="tel_fr">
        <p>全国服务热线</p>
        <i>0554-6688158</i></div>
        </div>
     </div>