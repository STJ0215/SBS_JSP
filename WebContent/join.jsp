<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
	<head>
    	<title>ȸ������ ȭ��</title>
    	
    	<link href="join.css" rel="stylesheet" type="text/css">
	</head>
	
	<body>
    	<div class="wrap">
        	<br>
        	<br>
        	<br>
        	<h1>ȸ�� ����</h1>
        	<br>
        	<br>
        	<br>
        
        	<form>
            	<table>
                	<tr>
                    	<td class="title">���̵�</td>
                    	<td class="essential">*</td>
                    	<td>
                    		<input type="text" name="id" maxlength="15" size="20">
                    		<input type="button" value="�ߺ� Ȯ��">
                    		<br>
                    		<span>����� ���̵� �Է��� �ּ���.</span>
                    	</td>
                	</tr>
                	
                	<tr>
                    	<td class="title">��й�ȣ</td>
                    	<td class="essential">*</td>
                    	<td>
                        	<input type="password" name="password" maxlength="15" size="20">
                        	<br>
                        	<span>����� ��й�ȣ�� �Է��� �ּ���.</span>
                    	</td>
                	</tr>
                	
                	<tr>
                    	<td class="title">��й�ȣ Ȯ��</td>
                    	<td class="essential">*</td>
                    	<td>
                        	<input type="password" name="password" maxlength="10" size="20">
                        	<br>
                        	<span>��й�ȣ�� �ٽ� �Է��� �ּ���.</span>
                    	</td>
                	</tr>
                    
                	<tr>
                    	<td class="title">�̸�</td>
                    	<td class="essential">*</td>
                    	<td>
                        	<input type="text" name="name" maxlength="10" size="10">
                    	</td>
                	</tr>
                    
                	<tr>
                    	<td class="title">����</td>
                    	<td class="essential">*</td>
                    	<td>
                        	<input type="radio" name="gender" value="��" checked>��
                        	<input type="radio" name="gender" value="��" checked>��
                    	</td>
                	</tr>
                    
                	<tr>
                    	<td class="title">�������</td>
                    	<td class="essential">*</td>
                    	<td>
                        	<input type="text" name="birth_yy" maxlength="4" size="4" placeholder="��">
                        	/
                        	<input type="text" name="birth_mm" maxlength="2" size="4" placeholder="��">
                        	/
                        	<input type="text" name="birth_dd" maxlength="2" size="4" placeholder="��">
                    	</td>
                	</tr>
                    
                	<tr>
                    	<td class="title">�̸���</td>
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
                    	<td class="title">����ó</td>
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
                		<td class="title">�����ȣ</td>
                		<td class="essential">*</td>
                		<td>
                			<input type="text" name="address_num1" maxlength="4" size="4">
                			-
                			<input type="text" name="address_num2" maxlength="4" size="4">
                    		<input type="button" value="�˻�">
                		</td>
                	</tr>
                	
                	<tr>
                    	<td class="title">�ּ�</td>
                    	<td class="essential">*</td>
                    	<td>
                        	<input type="text" maxlength="100" size="50" name="address">
                    	</td>
                	</tr>
                	
                	<tr>
                		<td class="title">���</td>
                		<td></td>
                		<td>
                        	<input type="radio" name="gender" value="����" checked>����
                        	<input type="radio" name="gender" value="�" checked>�
                        	<input type="radio" name="gender" value="����" checked>����
                        	<input type="radio" name="gender" value="TV��û" checked>TV��û
                    	</td>                		
                	</tr>
            	</table>
            	
            	<br>
            	
            	<input type="submit" value="�Ϸ�">
            	<input type="button" value="���">
        	</form>
    	</div>
	</body>
</html>
