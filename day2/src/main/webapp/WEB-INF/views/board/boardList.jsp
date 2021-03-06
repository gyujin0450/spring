<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/bootStrap.jsp"></c:import>
</head>
<body>
<c:import url="../template/nav.jsp"></c:import>

<div class="container">
	<h1>Board List Page...</h1>
	<table class="table table-hover">
		<tr>
			<th>Num</th>
			<th>Title</th>
			<th>Write</th>
			<th>Date</th>
			<th>Hit</th>
		</tr>
	    <c:forEach items="${list}" var="vo">
	    <tr>
	    	<td>${vo.num}</td>
	    	<td><a href="./boardSelect?num=${vo.num}">
	    	<c:catch>
	    	<c:forEach begin="1" end="${vo.depth }">└</c:forEach>
	    	</c:catch>
	    	${vo.title}</a></td>
	    	<td>${vo.writer}</td>
	    	<td>${vo.reg_date}</td>
	    	<td>${vo.hit}</td>
	    </tr>
	    </c:forEach>
	</table>
	
	<a href="./boardList?curPage=${pager.startNum-1}">[이전]</a>
	
	<c:forEach begin="${pager.startNum}" end="${pager.lastNum}" var="i">
		<a href="./boardList?curPage=${i}">${i}</a>
	</c:forEach>
	
	<a href="./boardList?curPage=${pager.lastNum+1}">[다음]</a>
		
	<a href="./boardWrite" class="btn btn-danger">글쓰기</a>
	
</div>
</body>
</html>