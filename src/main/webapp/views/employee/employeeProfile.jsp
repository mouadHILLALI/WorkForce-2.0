<%--
  Created by IntelliJ IDEA.
  User: MD
  Date: 10/17/2024
  Time: 9:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>employeeProfile</title>
    <link rel="stylesheet" type="text/css" href="/static/css/employee/profile.css">
</head>
<body>
<nav class="navbar">
    <div class="navbar-brand">
        <h1>Welcome, ${user.userName}</h1>
    </div>
    <ul class="navbar-links">
        <li><a href="#">Dashboard</a></li>
        <li><a href="/employee?action=profile">Profile</a></li>
        <li><a href="#">Leave requests</a></li>
        <li><a href="/user?action=logout">Logout</a></li>
    </ul>
</nav>
<h1>${allocation}DH</h1>
</body>
</html>
