<%--
  Created by IntelliJ IDEA.
  User: Ufuk
  Date: 10-07-15
  Time: 11:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Registration Confirmation Page</title>
</head>
<body>
message : ${success}
<br/>
<br/>
Go back to <a href="<c:url value='/list' />">List of All Employees</a>

</body>

</html>
