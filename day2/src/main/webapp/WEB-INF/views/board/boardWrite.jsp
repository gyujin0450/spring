<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/bootStrap.jsp"></c:import>
<!-- https://summernote.org/getting-started/#simple-example -->
<c:import url="../template/summernote.jsp"></c:import>
</head>
<body>
<c:import url="../template/nav.jsp"></c:import>
	<!-- https://www.w3schools.com/bootstrap/tryit.asp?filename=trybs_form_basic&stacked=h -->
	<!-- name 속성이 주요함 -->
	<div class="container">
	  <h1>Board Write Page...</h1>
	  <!-- 파일 첨부 : method, enctype 설정 -->
	  <form action="./boardWrite" method="post" enctype="multipart/form-data">
	    <div class="form-group">
	      <label for="title">Tile:</label>
	      <input type="text" class="form-control" id="title" placeholder="Enter title" name="title">
	    </div>
	    <div class="form-group">
	      <label for="writer">Writer:</label>
	      <input type="text" class="form-control" id="writer" placeholder="Enter writer" name="writer">
	    </div>
	    <div class="form-group">
	      <label for="contents">Contents:</label>
	      <textarea rows="20" cols="" id="contents" class="form-control" name="contents"></textarea>
	    </div>
	    <!-- 파일 후 commons-fileupload  -->
	    <div class="form-group">
	      <label for="files">Files:</label>
	      <input type="file" name="files" class="form-control">
	    </div>
	    
	    <button type="submit" class="btn btn-default">Submit</button>
	  </form>
	</div>
	<!-- summernote 사용시, 부모가 있는 경우 부모VO로 받아야 함  -->
	<!-- Image upload 시, https://summernote.org/deep-dive/#onimageupload 참고 -->	
	<script>
		$(document).ready(function(){
		// $('#contents').summernote();
		});
	</script>
	<!-- 네이버 스마트노트 http://naver.github.io/smarteditor2/demo/ -->
	
</body>
</html>