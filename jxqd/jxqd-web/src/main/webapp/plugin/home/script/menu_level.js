$(document).ready(function(){
	$(".menu_level").hover(function(){
		$(this).children("ul").slideDown();
		
		changeIcon($(this).children("a"));
	},function(){
		$(this).children("ul").slideUp();
		changeIcon($(this).children("a"));
	});
});

/*修改主菜单的指示图标*/
function changeIcon(menu_levelNode){
	if(menu_levelNode){
		if( menu_levelNode.css("background-image").indexOf("right15px.png")>=0 ){
			menu_levelNode.css("background-image","url(images/down15px.png)");
		}
		else{
			menu_levelNode.css("background-image","url(images/right15px.png)");
		}
	}
}
