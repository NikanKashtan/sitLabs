<%--
  Created by IntelliJ IDEA.
  User: Veronika
  Date: 24.03.2015
  Time: 17:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

<form name="hello" method="POST" action ="controller">
  <input type="hidden"  name="command" value="login">
  Name:<input type="text" name="username"/><br/><br/>
  Password:<input type="password" name="userpass"/><br/><br/>
  <input type="submit" value="login"/>
</form>
</body>
</html>
