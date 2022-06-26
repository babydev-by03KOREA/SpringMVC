<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>resume</title>
	<style>
		a {
			text-decoration: none;
			color: gray;
		}
	</style>
</head>
<body>
<h1>
	Developer Parameter  
</h1>

<h5>if you click gray text, move for more info.</h5>

<h3>
	Hello! Developer <a target="_blank" href="https://github.com/babydev-by03KOREA">${Developer}!</a><br/>
	Using Language by <a target="_blank" href="https://www.oracle.com/kr/java/">${Language} </a><br/>
	Using FrameWork by <a target="_blank" href="https://www.spring.io">${FrameWork}</a>
</h3>

</body>
</html>
