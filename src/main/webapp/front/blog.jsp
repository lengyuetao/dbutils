<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head lang="en">
  <meta charset="UTF-8">
  <title>秀美人间</title>
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport"
        content="width=device-width, initial-scale=1">
  <meta name="format-detection" content="telephone=no">
  <meta name="renderer" content="webkit">
  <meta http-equiv="Cache-Control" content="no-siteapp"/>
  <link rel="alternate icon" type="image/png" href="">
  <link rel="stylesheet" href="${contextPath}/resources/assets/css/amazeui.min.css"/>
  <style>
    @media only screen and (min-width: 1200px) {
      .blog-g-fixed {
        max-width: 1200px;
      }
    }

    @media only screen and (min-width: 641px) {
      .blog-sidebar {
        font-size: 1.4rem;
      }
    }

    .blog-main {
      padding: 20px 0;
    }

    .blog-title {
      margin: 10px 0 20px 0;
    }

    .blog-meta {
      font-size: 14px;
      margin: 10px 0 20px 0;
      color: #222;
    }

    .blog-meta a {
      color: #27ae60;
    }

    .blog-pagination a {
      font-size: 1.4rem;
    }

    .blog-team li {
      padding: 4px;
    }

    .blog-team img {
      margin-bottom: 0;
    }

    .blog-content img,
    .blog-team img {
      max-width: 100%;
      height: auto;
    }

    .blog-footer {
      padding: 10px 0;
      text-align: center;
    }
  </style>
</head>
<body>
<header class="am-topbar">
  <h1 class="am-topbar-brand">
    <a href="#"></a>
  </h1>

  <button class="am-topbar-btn am-topbar-toggle am-btn am-btn-sm am-btn-success am-show-sm-only"
          data-am-collapse="{target: '#doc-topbar-collapse'}"><span class="am-sr-only">导航切换</span> <span
      class="am-icon-bars"></span></button>

  <div class="am-collapse am-topbar-collapse" id="doc-topbar-collapse">
    <ul class="am-nav am-nav-pills am-topbar-nav">
      <li class="am-active"><a href="#">趣味生活</a></li>
      <li><a href="#">奇妙旅行</a></li>
      <li><a href="#">百味美食</a></li>
    </ul>
  </div>
</header>

<div class="am-g am-g-fixed blog-g-fixed">
  <div class="am-u-md-8">
    <article class="blog-main">
      <h3 class="am-article-title blog-title">
        <a href="#">趣味旅行</a>
      </h3>
      <h4 class="am-article-meta blog-meta"> <a href=""> </a>  <a href="#"> </a></h4>

      <div class="am-g blog-content">
        <div class="am-u-lg-7">
          <p><p><img src="${contextPath }/resources/image/log.jpg"></p></p>

          <p>准备一个旅行吧，解放一下你的心田，去追逐一个梦想。牵手梦中人，走一路，游一方。醉一宿，解千愁。</p>

          <p></p>
        </div>
        <div class="am-u-lg-5">
          
        </div>
      </div>
      <div class="am-g">
        <div class="am-u-sm-12">
          <p></p>
        </div>
      </div>
    </article>

    <!-- <hr class="am-article-divider blog-hr"> -->
    <ul class="am-pagination blog-pagination">
      <li class="am-pagination-prev"><a href="">&laquo; 上一页</a></li>
      <li class="am-pagination-next"><a href="">下一页 &raquo;</a></li>
    </ul>
  </div>

  <div class="am-u-md-4 blog-sidebar">
    <div class="am-panel-group">
      <section class="am-panel am-panel-default">
        <div class="am-panel-hd">关于我</div>
        <div class="am-panel-bd">
          <p></p>
          <a class="am-btn am-btn-success am-btn-sm" href="#">查看更多 →</a>
        </div>
      </section>
      <section class="am-panel am-panel-default">
        <div class="am-panel-hd">文章目录</div>
        <ul class="am-list blog-list">
          <li><a href="#">江南行</a></li>
          <li><a href="#">品湘川</a></li>
        </ul>
      </section>

      <section class="am-panel am-panel-default">
        <div class="am-panel-hd"></div>
        <div class="am-panel-bd">
            	时不追兮，境过迁。言欲止兮，何其扰。登而呼兮，翦其乱。情不归兮，亦何往。
        </div>
      </section>
    </div>
  </div>

</div>

<footer class="blog-footer">
  <p><br/>
    <small>粤ICP备15088588号-1</small>
  </p>
</footer>
<%@ include file="../common/footjs.jsp"%>
</body>
</html>
