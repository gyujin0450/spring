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
<div>
	<h1>Board Select Page...</h1>
	<!-- EL -->
	<h1>Num : ${vo.num}</h1>
	<h1>Title : ${vo.title}</h1>
	
	<div class="row">
		<c:forEach items={vo.files} var="file">
			<p><a href="../files/fileDown?fnum=${file.fnum}"> ${file.oname} </a></p>			
		</c:forEach>
	</div>
	
	<a href="./boardUpdate?num=${vo.num}" class="btn btn-danger">Update</a>
	<a href="./boardDelete?num=${vo.num}" class="btn btn-primary">Delete</a>
	<a href="./boardReply?num=${vo.num}" class="btn btn-primary">Replay</a>
	
</div>
		
	
</body>
</html>