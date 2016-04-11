$(document).ready(function(){
	$("#content").load("inc/mytab1.html");	//首次打开页面时加载页面
	$("#tag_title li").each(function(index){
		$(this).click(function(){
			$("#tag_title li.tabin").removeClass("tabin");
			$(this).addClass("tabin");
			
			if(index==0){
				$("#content").load("inc/mytab1.html");
			}
			else if(index==1){
				$("#content").load("inc/mytab2.html");
			}
			else if(index==2){
				$("#content").load("inc/mytab3.html");
			}
		})
	})
	$.ajaxSetup({
		cache: false //关闭AJAX相应的缓存
	});
});
