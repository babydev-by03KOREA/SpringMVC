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
	<!-- View에서도 CMD객체를 사용 할수 있다! -->
	<h1>고객님의 회원가입 정보입니다!</h1>
	<div class="info">
		<ul>
		<!-- JSTL 앞에 member.만 작성한다! -->
			<li class="info__ID">${memberDTO.userID}</li>
			<li class="info__PWD">${memberDTO.userPassword}</li>
			<li class="info__Name">${memberDTO.userName}</li>
			<li class="info__Gender">${memberDTO.userGender}</li>
			<li class="info__Email">${memberDTO.userEmail}</li>
			<li class="info__Agree">${memberDTO.userAgreement}</li>
		</ul>
	</div><br />
	<div class="main__do">
		<a href="/mvc/resources/html/index.html" style="text-decoration: none; color: black">처음으로 돌아가기 -></a>
	</div>
</body>
</html>