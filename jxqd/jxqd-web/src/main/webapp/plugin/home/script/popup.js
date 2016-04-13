// JavaScript Document
/*弹出层*/
/*sales_ranking_id img控件id;
strSrc1 变换的图片路径
strSrc2 变换的图片路径
*/
function sales_ranking(sales_ranking_id,strSrc1,strSrc2){	
	var obj=document.getElementById(sales_ranking_id);
	
	var length=obj.src.length;
	var str=strSrc1.replace('../../','');
	var objlh=obj.src.replace(str,"");
	if(length==objlh.length)
	{
		obj.src=strSrc1;
	}else
	{
		obj.src=strSrc2;
	}
}
/*content_id 显示隐藏的内容id  set是否启动1秒后自动隐藏 1：是 */
var contentid="";
function _Eject(content_id,set) 
 { 
  contentid=content_id;
  var cover_layer=document.getElementById("cover_layer"); 
  var content_layer=document.getElementById(content_id); 
  cover_layer.style.height=document.body.scrollHeight+"px";
  var width = content_layer.style.width.replace("px","");
  var height = content_layer.style.height.replace("px","");
  content_layer.style.left=(document.body.clientWidth-width)*0.5+"px"; 
  content_layer.style.top=(window.innerHeight-height)*0.5+"px"; 
  cover_layer.style.display="block";
  cover_layer.style.width="100%"; 
  content_layer.style.display="block"; 
  if(set==1){
  	setTimeout("_close()",1000);
	}
 } 
 
 function _close(content_id) 
 { 
 if(content_id==null)
 {
 	content_id=contentid;
	$("#"+content_id).fadeOut(1000);
 }else
 {
 	var content_layer=document.getElementById(content_id); 
	content_layer.style.display="none";
 }
  var cover_layer=document.getElementById("cover_layer"); 
  cover_layer.style.display="none";   
  content_id=null; 
 } 
 
 function _hidden(h_id,s_id)
 {
 	_close(h_id);
 	_Eject(s_id,1);
 } 
