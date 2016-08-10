<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@include file="header.jsp" %>
<html>
<head>
    <title>Register</title>
</head>
<body>

<h2>User Information</h2>
<form:form method="post" action="">
   <table>
    <tr>
        <td><form:label path="name">Name:</form:label></td>
        <td><form:input path="name" /></td>
    </tr>
     <tr>
        <td><form:label path="password">Password:</form:label></td>
        <td><form:input path="password" /></td>
    </tr>
    <tr>
        <td><form:label path="email">Email:</form:label></td>
        <td><form:input path="email" /></td>
    </tr>
     <tr>
        <td><form:label path="phone">Phone:</form:label></td>
        <td><form:input path="phone" /></td>
    </tr>
    <tr>
        <td><form:label path="location">Location:</form:label></td>
        <td><form:input path="location" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
</table>  
</form:form>
</body>
</html>
<%@include file="footer.jsp" %>