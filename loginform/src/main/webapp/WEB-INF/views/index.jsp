<%--
  Created by IntelliJ IDEA.
  User: Ufuk
  Date: 11-07-15
  Time: 4:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@page session="false" %>
<html>
<body>
<h1>Title : ${title}</h1>

<h1>Message : ${message}</h1>
<table>
    <tr>
        <td><a href="login">Login Page</a></td>
        <td><a href="dba">DBA Page</a></td>
        <td><a href="admin">Admin Page</a></td>
    </tr>
</table>
</body>
</html>
