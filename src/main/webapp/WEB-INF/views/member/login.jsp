<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>

<link rel="stylesheet" href="/touhou/css/w3.css" />

<script type="text/javascript" src="/touhou/js/jquery-3.5.0.min.js"></script>
<script type="text/javascript" >
 	$(document).ready(function(){
 		$('#login').click(function(){
 			var id = $('#id').val();
 			var pw = $('#pw').val();
 			$('#frm').submit();
 		});
 	});
</script>

</head>
<body>
	<div class="w3-col m7 w3-center" >
		<div class="w3-border w3-orange w3-margin-top w3-margin-bottom" style="margin-left: 300px;">
			<span style="font-size: 70px;" >login</span>
		</div>
		<div style="margin-left: 300px;">
			<form method="POST" action="/touhou/member/loginProc.touhou" id="frm" name="frm">			
			ID : <input type="text" id="id" name="id"><br>
			PW : <input type="text" id="pw" name="pw">
				<button class="w3-button w3-blue" id="login">Login</button> 			
			</form>
		</div>
	</div>
</body>
</html>