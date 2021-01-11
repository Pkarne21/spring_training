<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<h2>Login Form</h2>
<form action="login" action="post">
<input type="hidden" name="requestAction" value="Login" />

 

 <label for="userName"><b>Username</b></label>
    <input type="text"  name="userName" required>

 

    <label for="password"><b>Password</b></label>
    <input type="password" name="password" required>
        
    <button type="submit">Login</button>

 

</form>

    


</body>
</html>