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
	<h1>고객님의 회원가입 정보입니다!</h1>
	<div class="info">
		<ul>
			<li class="info__ID">${userID}</li>
			<li class="info__PWD">${userPassword}</li>
			<li class="info__Name">${userName}</li>
			<li class="info__Gender">${userGender}</li>
			<li class="info__Email">${userEmail}</li>
			<li class="info__Agree">${userAgreement}</li>
		</ul>
	</div>
	    <div class="main__do">
		<a href="/mvc/resources/html/index.html" style="text-decoration: none; color: black">처음으로 돌아가기 -></a>
	</div>
</body>
</html>