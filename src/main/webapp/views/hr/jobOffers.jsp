<%--
  Created by IntelliJ IDEA.
  User: MD
  Date: 10/16/2024
  Time: 11:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Job Offers</title>
    <link rel="stylesheet" href="/static/css/hr/offer.css">
</head>
<body>
<nav class="navbar">
    <ul>
        <li><a href="/user?action=get&role=hr">Home</a></li>
        <li><a href="/hr">HR</a></li>
        <li><a href="/offer?action=getAll&id=${user.id}">Job Offers</a></li>
    </ul>
</nav>
<div class="job-offers-container">
    <c:forEach var="offer" items="${offers}">
        <div class="job-card">
            <h2>${offer.title}</h2>
            <p><strong>Description:</strong> ${offer.description}</p>
            <p><strong>Requirements:</strong> ${offer.requirements}</p>
            <p><strong>Salary:</strong> ${offer.salary} MAD</p>
            <p><strong>Date Posted:</strong> ${offer.datePosted}</p>
            <p><strong>Status:</strong> ${offer.status}</p>

            <div class="button-group">
                <a href="/updateJobOffer?id=${offer.id}" class="btn btn-update">Update</a>
                <a href="/deleteJobOffer?id=${offer.id}" class="btn btn-delete">Delete</a>
                <a href="/showCandidates?id=${offer.id}" class="btn btn-candidates">Show Candidates</a>
            </div>
        </div>
    </c:forEach>
</div>
</body>
</html>

