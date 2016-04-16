<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" type="text/css" href="${webRoot}/plugin/ztree/css/demo.css" >
<link rel="stylesheet" type="text/css" href="${webRoot}/plugin/ztree/css/zTreeStyle/zTreeStyle.css">
<script type="text/javascript" src="${webRoot}/plugin/ztree/js/jquery-1.4.4.min.js"></script>
<script type="text/javascript" src="${webRoot}/plugin/ztree/js/jquery.ztree.core.js"></script>
<SCRIPT type="text/javascript">
   var setting = {
		check: {
			chkStyle:"checkbox",
			chkboxType:{"Y":"ps","N":"ps"},
			enable: true
		},
	};
		var zNodes =[
			{ name:"父节点1 - 展开", open:true,
				children: [
					{ name:"父节点11 - 折叠",
						children: [
							{ name:"叶子节点111"},
							{ name:"叶子节点112"},
							{ name:"叶子节点113"},
							{ name:"叶子节点114"}
						]},
					{ name:"父节点12 - 折叠",
						children: [
							{ name:"叶子节点121"},
							{ name:"叶子节点122"},
							{ name:"叶子节点123"},
							{ name:"叶子节点124"}
						]},
					{ name:"父节点13 - 没有子节点", isParent:true}
				]},
			{ name:"父节点2 - 折叠",
				children: [
					{ name:"父节点21 - 展开", open:true,
						children: [
							{ name:"叶子节点211"},
							{ name:"叶子节点212"},
							{ name:"叶子节点213"},
							{ name:"叶子节点214"}
						]},
					{ name:"父节点22 - 折叠",
						children: [
							{ name:"叶子节点221"},
							{ name:"叶子节点222"},
							{ name:"叶子节点223"},
							{ name:"叶子节点224"}
						]},
					{ name:"父节点23 - 折叠",
						children: [
							{ name:"叶子节点231"},
							{ name:"叶子节点232"},
							{ name:"叶子节点233"},
							{ name:"叶子节点234"}
						]}
				]},
			{ name:"父节点3 - 没有子节点", isParent:true}

		];
     
		
		$(document).ready(function(){
			$.ajax({
				url:"${webRoot}/ztree/node",
				dataType:"json",
			    type:"post",
			    success:function(data) {
			    	$.fn.zTree.init($("#treeDemo"), setting, data.result);
			    }
			})
		});
	</SCRIPT>
</HEAD>

<BODY>
<div class="content_wrap">
	<div class="zTreeDemoBackground left">
		<ul id="treeDemo" class="ztree"></ul>
	</div>
</div>
</body>
</html>