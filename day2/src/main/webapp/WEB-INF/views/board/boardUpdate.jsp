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
	<!-- https://www.w3schools.com/bootstrap/tryit.asp?filename=trybs_form_basic&stacked=h -->
	<!-- name 속성이 주요함 -->
	<div class="container">
	  <h1>Board Update Page...</h1>
	  <form action="./boardUpdate" method="post">
	  	<input type="hidden" name="num" value="${vo.num}">
	    <div class="form-group">
	      <label for="title">Tile:</label>
	      <input type="text" class="form-control" value="${vo.title}" id="title" placeholder="Enter title" name="title">
	    </div>
	    <div class="form-group">
	      <label for="writer">Writer:</label>
	      <input type="text" readonly="readOnly" value="${vo.writer}" class="form-control" id="writer" placeholder="Enter writer" name="writer">
	    </div>
	    <div class="form-group">
	      <label for="contents">Contents:</label>
	      <textarea rows="20" cols="" class="form-control" name="contents">${vo.contents}</textarea>
	    </div>
	    <button type="submit" class="btn btn-default">Submit</button>
	  </form>
	</div>
</body>
</html>