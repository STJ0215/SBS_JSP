<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Form Test</title>
	</head>
	
	<body>
		<h3>회원정보 GET</h3>
		
		<form action="queryTest" method="get">
			ID : <input type="text" name="id"> <br>
			PW : <input type="password" name="pw"> <br>
			이름 : <input type="text" name="name"> <br>
			<br>
			<input type="submit" value="전송">
			<input type="reset" value="초기화">
		</form>
	</body>
</html>