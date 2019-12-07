<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../templete/bootStrap.jsp"></c:import>
</head>
<body>
<c:import url="../templete/nav.jsp"></c:import>
	<h1>Board Select Page...</h1>
	<!-- EL -->
	<h1>Num : ${vo.num}</h1>
	<h1>Title : ${vo.title}</h1>
</body>
</html>