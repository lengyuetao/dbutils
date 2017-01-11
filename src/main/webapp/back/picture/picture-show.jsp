<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../common/header.jsp"%>
<title>图片展示</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 图片管理 <span class="c-gray en">&gt;</span> 图片展示 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
	<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"> <a href="javascript:;" onclick="edit()" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe6df;</i> 编辑</a> <a href="javascript:;" onclick="datadel()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a> </span> <span class="r">共有数据：<strong>54</strong> 条</span> </div>
	<div class="portfolio-content">
		<ul class="cl portfolio-area">
			<li class="item">
				<div class="portfoliobox">
					<input class="checkbox" name="" type="checkbox" value="">
					<div class="picbox"><a href="temp/big/keting.jpg" data-lightbox="gallery" data-title="客厅1"><img src="${contextPath}/resources/h-ui/temp/Thumb/keting.jpg"></a></div>
					<div class="textbox">客厅 </div>
				</div>
			</li>
			<li class="item">
				<div class="portfoliobox">
					<input class="checkbox" name="" type="checkbox" value="">
					<div class="picbox "><a href="temp/big/keting2.jpg" data-lightbox="gallery" data-title="客厅2"><img src="${contextPath}/resources/h-ui/temp/Thumb/keting2.jpg"></a></div>
					<div class="textbox">客厅 </div>
				</div>
			</li>
			<li class="item">
				<div class="portfoliobox">
					<input class="checkbox" name="" type="checkbox" value="">
					<div class="picbox"><a href="temp/big/keting3.jpg" data-lightbox="gallery" data-title="客厅3"><img src="${contextPath}/resources/h-ui/temp/Thumb/keting3.jpg"></a></div>
					<div class="textbox">客厅 </div>
				</div>
			</li>
			<li class="item">
				<div class="portfoliobox">
					<input class="checkbox" name="" type="checkbox" value="">
					<div class="picbox"><a href="temp/big/keting4.jpg" data-lightbox="gallery" data-title="客厅4"><img src="${contextPath}/resources/h-ui/temp/Thumb/keting4.jpg"></a></div>
					<div class="textbox">客厅 </div>
				</div>
			</li>
			<li class="item">
				<div class="portfoliobox">
					<input class="checkbox" name="" type="checkbox" value="">
					<div class="picbox"><a href="temp/big/chufang.jpg" data-lightbox="gallery" data-title="厨房"><img src="${contextPath}/resources/h-ui/temp/Thumb/chufang.jpg"></a></div>
					<div class="textbox">厨房 </div>
				</div>
			</li>
			<li class="item">
				<div class="portfoliobox">
					<input class="checkbox" name="" type="checkbox" value="">
					<div class="picbox"><a href="temp/big/shufang.jpg" data-lightbox="gallery" data-title="书房"><img src="${contextPath}/resources/h-ui/temp/Thumb/shufang.jpg"></a></div>
					<div class="textbox">书房 </div>
				</div>
			</li>
			<li class="item">
				<div class="portfoliobox">
					<input class="checkbox" name="" type="checkbox" value="">
					<div class="picbox"><a href="temp/big/woshi.jpg" data-lightbox="gallery" data-title="卧室"><img src="${contextPath}/resources/h-ui/temp/Thumb/woshi.jpg"></a></div>
					<div class="textbox">卧室 </div>
				</div>
			</li>
			<li class="item">
				<div class="portfoliobox">
					<input class="checkbox" name="" type="checkbox" value="">
					<div class="picbox"><a href="temp/big/weishengjian.jpg" data-lightbox="gallery" data-title="卫生间1"><img src="${contextPath}/resources/h-ui/temp/Thumb/weishengjian.jpg"></a></div>
					<div class="textbox">卫生间1 </div>
				</div>
			</li>
			<li class="item">
				<div class="portfoliobox">
					<input class="checkbox" name="" type="checkbox" value="">
					<div class="picbox"><a href="temp/big/weishengjian2.jpg" data-lightbox="gallery" data-title="卫生间2"><img src="${contextPath}/resources/h-ui/temp/Thumb/weishengjian2.jpg"></a></div>
					<div class="textbox">卫生间2 </div>
				</div>
			</li>
		</ul>
	</div>
</div>
<%@ include file="../common/footer.jsp"%>
<script type="text/javascript">
$(function(){
	$.Huihover(".portfolio-area li");
});
</script>
</body>
</html>