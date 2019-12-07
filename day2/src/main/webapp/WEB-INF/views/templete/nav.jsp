<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:url value="/" var="root"></c:url>

<!-- https://www.w3schools.com/bootstrap/bootstrap_navbar.asp -->    
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">WebSiteName</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Page 1<span class="caret"></span></a>
      	<ul class="dropdown-menu">
			<li><a href="#">Page 1-1</a></li>
			<li><a href="#">Page 1-2</a></li>
			<li><a href="#">Page 1-3</a></li>	      	
      	</ul>
      </li>
      <!-- 다른 페이지에 포함되기 때문에 절대경로 지정해야 하고, 2가지 반업이 있음!!! -->
      <li><a href="${pageContext.request.contextPath}/notice/boardList">Notice</a></li>
      <li><a href="${root}qna/boardList">QnA</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>
</nav>