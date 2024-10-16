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
        <li><a href="/home.jsp">Home</a></li>
        <li><a href="/jobOffers.jsp">Job Offers</a></li>
        <li><a href="/user?action=logout">Logout</a></li>
    </ul>
</nav>
<div class="container">
    <h1>HR - Add Job Offer</h1>
    <form action="/offer" method="post">
        <label for="Title">Job Title:</label>
        <input type="text" id="Title" name="Title" required>
        <input type="text" id="id" name="id" style="display: none" required>
        <input type="text" id="" name="action" value="create" style="display: none" required>
        <label for="Description">Job Description:</label>
        <textarea type="text" row="4" id="Description" name="Description" required></textarea>
        <label for="Requirements">Job Requirements:</label>
        <textarea id="Requirements" name="Requirements" required></textarea>
        <label for="salary">Salary:</label>
        <input type="number" id="salary" name="salary" required>
        <label for="validityDate">Validity Date:</label>
        <input type="date" id="validityDate" name="validityDate" required>
        <button type="submit">Submit</button>
    </form>
</div>
</body>
</html>
