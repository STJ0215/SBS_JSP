<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
	<head>
    	<title>회원가입 화면</title>
    	
    	<link href="join.css" rel="stylesheet" type="text/css">
	</head>
	
	<body>
    	<div class="wrap">
        	<br>
        	<br>
        	<br>
        	<h1>회원 가입</h1>
        	<br>
        	<br>
        	<br>
        
        	<form>
            	<table>
                	<tr>
                    	<td class="title">아이디</td>
                    	<td class="essential">*</td>
                    	<td>
                    		<input type="text" name="id" maxlength="15" size="20">
                    		<input type="button" value="중복 확인">
                    		<br>
                    		<span>사용할 아이디를 입력해 주세요.</span>
                    	</td>
                	</tr>
                	
                	<tr>
                    	<td class="title">비밀번호</td>
                    	<td class="essential">*</td>
                    	<td>
                        	<input type="password" name="password" maxlength="15" size="20">
                        	<br>
                        	<span>사용할 비밀번호를 입력해 주세요.</span>
                    	</td>
                	</tr>
                	
                	<tr>
                    	<td class="title">비밀번호 확인</td>
                    	<td class="essential">*</td>
                    	<td>
                        	<input type="password" name="password" maxlength="10" size="20">
                        	<br>
                        	<span>비밀번호를 다시 입력해 주세요.</span>
                    	</td>
                	</tr>
                    
                	<tr>
                    	<td class="title">이름</td>
                    	<td class="essential">*</td>
                    	<td>
                        	<input type="text" name="name" maxlength="10" size="10">
                    	</td>
                	</tr>
                    
                	<tr>
                    	<td class="title">성별</td>
                    	<td class="essential">*</td>
                    	<td>
                        	<input type="radio" name="gender" value="남" checked>남
                        	<input type="radio" name="gender" value="여" checked>여
                    	</td>
                	</tr>
                    
                	<tr>
                    	<td class="title">생년월일</td>
                    	<td class="essential">*</td>
                    	<td>
                        	<input type="text" name="birth_yy" maxlength="4" size="4" placeholder="년">
                        	/
                        	<input type="text" name="birth_mm" maxlength="2" size="4" placeholder="월">
                        	/
                        	<input type="text" name="birth_dd" maxlength="2" size="4" placeholder="일">
                    	</td>
                	</tr>
                    
                	<tr>
                    	<td class="title">이메일</td>
                    	<td class="essential">*</td>
                    	<td>
                        	<input type="text" name="email_1" maxlength="15" size="20">
                        	@
                        	<select name="email_2">
                            	<option>naver.com</option>
                            	<option>gmail.com</option>                    
                        	</select>
                    	</td>
                	</tr>
                    
                	<tr>
                    	<td class="title">연락처</td>
                    	<td class="essential"></td>
                    	<td>
                    		<select name="phone_1">
                            	<option value="010" >010</option>
                            	<option value="011" >011</option>
                        	</select>
                        	-
                        	<input type="text" name="phone_2" maxlength="4" size="4">
                        	-
                        	<input type="text" name="phone_3" maxlength="4" size="4">
                    	</td>
                	</tr>
                	
                	<tr>
                		<td class="title">우편번호</td>
                		<td class="essential">*</td>
                		<td>
                			<input type="text" name="address_num1" maxlength="4" size="4">
                			-
                			<input type="text" name="address_num2" maxlength="4" size="4">
                    		<input type="button" value="검색">
                		</td>
                	</tr>
                	
                	<tr>
                    	<td class="title">주소</td>
                    	<td class="essential">*</td>
                    	<td>
                        	<input type="text" maxlength="100" size="50" name="address">
                    	</td>
                	</tr>
                	
                	<tr>
                		<td class="title">취미</td>
                		<td></td>
                		<td>
                        	<input type="radio" name="gender" value="독서" checked>독서
                        	<input type="radio" name="gender" value="운동" checked>운동
                        	<input type="radio" name="gender" value="게임" checked>게임
                        	<input type="radio" name="gender" value="TV시청" checked>TV시청
                    	</td>                		
                	</tr>
            	</table>
            	
            	<br>
            	
            	<input type="submit" value="완료">
            	<input type="button" value="취소">
        	</form>
    	</div>
	</body>
</html>
