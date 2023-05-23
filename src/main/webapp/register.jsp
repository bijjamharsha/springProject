<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
        body
        {
           background: black url("https://s.yimg.com/fz/api/res/1.2/LzfSL85lbgQiPbKMJF9s3A--~C/YXBwaWQ9c3JjaGRkO2ZpPWZpdDtoPTI2MDtxPTgwO3c9MzMy/https://s.yimg.com/zb/imgv1/eb26fa74-b9e5-3884-9904-6831ac063bfa/t_500x300");		
			background-size: cover;
        }
       .form-group
	{
	width: 350px;
	height: 20px;
	padding: 15px;
	text-align: center;

	}
	#reg-form
{
	background: linear-gradient(45deg,green,orange,white,green);
	padding: 20px;
	width: 350px;
	height: 350px;
	margin: 100px auto;
}

        </style>
</head>
<body>
	<form action="saveUserDetails">
	<div id="reg-form">
		<div class="form-group">
			<label for="firstName">Name</label>
			<input type="text" name="firstName">
		</div>
		<div class="form-group">
			<label for="contactNumber">contactNumber</label>
			<input type="text" name="contactNumber">
		</div>
		<div class="form-group">
			<label for="email">email</label>
			<input type="text" name="email">
		</div>
		<div class="form-group">
			<label for="password">password</label>
			<input type="text" name="password">
		</div>
		<div class="form-group">
			<label for="country">country</label>
			<input type="text" name="country">
		</div>
		<div class="form-group">
			<input type="submit" value="register">
		</div>
		</div>
	</form>
</body>
</html>