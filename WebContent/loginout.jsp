<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원인증</title>
	</head>
	<body>
		<form action="logProc" method="POST">
			ID : <input type="text" name="id"> <br>
			PW : <input type="password" name="pw"> <br>
			<input type="submit" value="로그인">
		</form>
		
		<a href="logProc">로그아웃</a>
	</body>
</html>