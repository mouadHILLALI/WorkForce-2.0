<%--
  Created by IntelliJ IDEA.
  User: MD
  Date: 10/15/2024
  Time: 2:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HR - Add Job Offer</title>
    <link rel="stylesheet" href="/static/css/hr/hr.css">
</head>
<body>
<nav class="navbar">
    <ul>
        <li><a href="/views/hr/hr.jsp">Home</a></li>
        <li><a href="/offer?action=getAll&id=${user.id}">Job Offers</a></li>
        <li><a href="/user?action=logout">Logout</a></li>
    </ul>
</nav>
<h1>${message}</h1>
<div class="container">
    <h1>HR - Add Job Offer</h1>
    <form action="/offer" method="post">
        <label >Job Title:</label>
        <input type="text"  name="Title" required>
        <input type="text" value="${user.id}" name="id" style="display: none" required>
        <input type="text" name="action" value="create" style="display: none" required>
        <label >Job Description:</label>
        <textarea type="text" row="4"  name="Description" required></textarea>
        <label >Job Requirements:</label>
        <textarea  name="Requirements" required></textarea>
        <label >Salary:</label>
        <input type="number"  name="salary" required>
        <label >Validity Date:</label>
        <input type="date"  name="validityDate" required>
        <button>add</button>
    </form>
</div>
</body>
</html>
