<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>가입된 고객정보</title>
<style>
	@import url('https://fonts.googleapis.com/css2?family=Source+Sans+Pro:wght@400;600;700&display=swap');
	
	body {
		margin: 0;
		font-family: 'Source Sans Pro', sans-serif;
	}
	
	.main__do {
    		display: flex;
        	margin: 20px;
        	justify-content: center;
    }
</style>
</head>
<body>
	<h1>고객님의 로그인 정보입니다!</h1>
	<div class="login">
		<ul>
			<li class="login__ID">${memberDTO.userID}</li>
			<li class="login__PWD">${memberDTO.userPassword}</li>
		</ul>
	</div>
	<div class="main__do">
		<a href="/mvc/resources/html/index.html" style="text-decoration: none; color: black">처음으로 돌아가기 -></a>
	</div>
</body>
</html>