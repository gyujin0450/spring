<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/bootStrap.jsp" />
</head>
<body>
<c:import url="../template/nav.jsp" />
	
<div class="container">
  <h1>Board Update Page</h1>
  <form action="./boardReply" method="post">
  	<input type="hidden" name="num" value="${vo.num}">
    <div class="form-group">
      <label for="Title">Title:</label>
      <input type="text" class="form-control" id="title" placeholder="Enter Title" name="title">
    </div>
    
    <div class="form-group">
      <label for="Writer">Writer:</label>
      <input type="text"  class="form-control" id="writer" placeholder="Enter Writer" name="writer">
    </div>
    
    <div class="form-group">
      <label for="Contents">Contents:</label>
      <textarea rows="20" cols="" class="form-control" name="contents"></textarea>
      
    </div>
    
    <button type="submit" class="btn btn-default">Submit</button>
  </form>
</div>
	
</body>
</html>