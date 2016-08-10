<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="header.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign In</title>
</head>
<body>
<form action="" method="post">
<table>
<tr><td>Username:</td> <input type="text" name="name"></tr></br>
<tr><td>Password:</td><input type="password" name ="password"></tr><br>
<tr><td><input type="submit" value="Submit"/></td>
<td><input type="reset" value="Reset"/></td></tr>
</table>
</form>
</body>
</html>
<%@include file="footer.jsp" %>