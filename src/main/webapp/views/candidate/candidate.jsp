<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Job Offers</title>
    <link rel="stylesheet" type="text/css" href="/static/css/candidate/candidate.css">
</head>
<body>

<div class="navbar">
    <ul>
        <li><a href="/home">Home</a></li>
        <li><a href="/profile">Profile</a></li>
        <li><a href="/jobs">Job Offers</a></li>
        <li><a href="/user?action=logout">Logout</a></li>
    </ul>
</div>

<div class="job-listings">
    <c:forEach items="${jobs}" var="job">
        <div class="job-card">
            <h2>${job.title}</h2>
            <p><strong>Description:</strong> ${job.description}</p>
            <p><strong>Requirements:</strong> ${job.requirements}</p>
            <p><strong>Salary:</strong> ${job.salary}</p>
            <p><strong>Date Posted:</strong> ${job.datePosted}</p>
            <form action="/offer" method="post">
                <input type="hidden" name="jobId" value="${job.id}">
                <input type="hidden" name="action" value="apply">
                <input type="hidden" name="userId" value="${user.id}">
                <button type="submit" class="apply-button">Apply</button>
            </form>
        </div>
    </c:forEach>
</div>

</body>
</html>
