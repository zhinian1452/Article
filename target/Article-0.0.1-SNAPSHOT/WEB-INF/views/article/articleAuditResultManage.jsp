<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%  //获取静态资源的绝对路径
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" 
							+ request.getServerPort() + path+"/";
%>
<!DOCTYPE html>
<html lang="en" class="app">

	<head>
		<meta charset="utf-8" />
		<title>公文审核结果</title>
		<meta name="description" content="app, web app, responsive, admin dashboard, admin, flat, flat ui, ui kit, off screen nav" />
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
		<link rel="stylesheet" href="<%= basePath %>css/app.v2.css" type="text/css" />
	</head>

	<body>
		<section class="vbox">
			<section>
				<section class="hbox stretch">
					<section id="content">
						<section class="vbox">
							<section class="scrollable padder">
								<!-- 面包屑导航 -->
								<ul class="breadcrumb no-border no-radius b-b b-light pull-in">
									<li>
										<a href="<%= basePath %>toWelcome">
											<i class="fa fa-home"></i> 首页
										</a>
									</li>
									<li class="active">公文审核结果</li>
								</ul>
								
								<!-- 表格标题 -->
								<div class="m-b-md">
									<h3 class="m-b-none">公文审核结果</h3>
								</div>
								
								<!-- 增删改结果提示 -->
								<jsp:include page="/common/top.jsp"></jsp:include>
								
								<!-- 待审核通过列表 -->
								<div class="tab-pane" id="waiting">
									<section class="panel panel-default">
										<header class="panel-heading">待审核通过</header>
										
										<form action="<%= basePath %>article/toAduitResult" method="post" data-validate="parsley">
											<!-- 查询条件 -->
											<div class="row text-sm wrapper">
												<!-- 左侧条件 -->
												<div class="col-sm-10 m-b-xs">
													<div class="inline" style="margin-right:20px;">
														公文标题
														<input type="text" name="keyword" class="input-sm form-control inline" 
															style="width: 150px;" placeholder="请输入公文标题" value="${keyword}"
															data-rangelength="[2,150]">
															
														<button class="btn btn-sm btn-default">查询</button>
													</div>
												</div>
											</div>
											
											<!-- 表格主体和数据 -->
											<div class="table-responsive">
												<table class="table table-striped b-t b-light text-sm">
													<!-- 顶表头 -->
													<thead>
														<tr>
															<th style="text-align: center;">公文标题</th>
															<th style="text-align: center;">目前状态</th>
															<th style="text-align: center;">撰稿人</th>
															<th style="text-align: center;">审稿人</th>
															<th style="text-align: center;">操作</th>
														</tr>
													</thead>
													
													<!-- 数据 -->
													<tbody>
														
														<%-- 判断有无数据 --%>
														<c:choose>
															<c:when test="${!empty articles}">
																<c:forEach items="${articles}" var="article">
																
																	<tr>
																		<td style="line-height: 30px;text-align: center;">${article.title}</td>
																		<td style="line-height: 30px;text-align: center;">
																			<c:choose>
																				<c:when test="${article.articlestate == 0}">审核中</c:when>
																				<c:when test="${article.articlestate == 1}">审核通过</c:when>
																				<c:when test="${article.articlestate == 2}">审核驳回</c:when>
																				<c:when test="${article.articlestate == 3}">公文发布</c:when>
																				<c:otherwise>公文删除</c:otherwise>
																			</c:choose>
																		</td>
																		<td style="line-height: 30px;text-align: center;">${article.copywriter.usertruename}</td>
																		<td style="line-height: 30px;text-align: center;">${article.auditor.usertruename}</td>
																		<td style="line-height: 30px;text-align: center;">
																			<a href="<%= basePath %>article/findById?articleId=${article.articleid}" class="btn btn-success btn-sm">查看/预览</a>
																			<c:if test="${article.articlestate != 0}">
																				<a href="<%= basePath %>article/toModfiy?articleId=${article.articleid}&taskId=${article.task.id}" class="btn btn-warning btn-sm">修改</a>
																				<a href="<%= basePath %>article/deleteArticle?articleId=${article.articleid}&taskId=${article.task.id}" 
																					class="btn btn-danger btn-sm" onclick="return confirmDelete(this);">删除</a>
																			</c:if>
																			
																		</td>
																	</tr>
																</c:forEach>
															</c:when>
															
															<%-- 没数据 --%>
															<c:otherwise>
																<tr>
																	<td style="text-align: center;" colspan="5">
																		<div class="alert alert-success" style="font-size: 18px;">没有找到记录</div>
																	</td>
																</tr>
															</c:otherwise>
														</c:choose>

													</tbody>
													
													<!-- 底表头 -->
													<%--<thead>
														<tr>
															<th style="text-align: center;">公文标题</th>
															<th style="text-align: center;">目前状态</th>
															<th style="text-align: center;">撰稿人</th>
															<th style="text-align: center;">审稿人</th>
															<th style="text-align: center;">操作</th>
														</tr>
													</thead>--%>
												</table>
											</div>
										</form>
										
									</section>
								</div>
							</section>
						</section>
						<a href="#" class="hide nav-off-screen-block" data-toggle="class:nav-off-screen" data-target="#nav"></a>
					</section>
				</section>
			</section>
		</section>
		<script type="text/javascript" src="<%= basePath %>js/app.v2.js"></script>
		<script type="text/javascript" src="<%= basePath %>js/common/manage-common.js"></script>
		<!-- 校验 -->
	    <script type="text/javascript" src="<%= basePath %>js/parsley/parsley.min.js"></script>
	</body>

</html>