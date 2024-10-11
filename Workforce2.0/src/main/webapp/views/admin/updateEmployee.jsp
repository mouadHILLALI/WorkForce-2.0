<%--
  Created by IntelliJ IDEA.
  User: MD
  Date: 10/11/2024
  Time: 3:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="workforcemanger.workforce.dto.EmployeeDTO" %>
<%
    EmployeeDTO employeeDTO = (EmployeeDTO) request.getAttribute("employee");
%>
<html>
<head>
    <title>Update Employee</title>
    <link rel="stylesheet" href="/static/css/adminUpdatePanel.css">
</head>
<body>
<div class="form-container">
    <h2>Update Employee</h2>
    <form action="/employee" method="POST">
        <input type="text" style="display: none" name="id" value="<%= employeeDTO.getId() %>">
        <div class="form-group">
            <label for="userName">Username:</label>
            <input type="text" id="userName" name="userName" value="<%= employeeDTO.getUserName() %>" required>
            <input style="display: none" type="text" id="action" name="action" value="update" required>
        </div>
        <div class="form-group">
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" value="<%= employeeDTO.getEmail() %>" required>
        </div>
        <div class="form-group">
            <label for="address">Address:</label>
            <input type="text" id="address" name="address" value="<%= employeeDTO.getAddress() %>" required>
        </div>
        <div class="form-group">
            <label for="birthDate">Birth Date:</label>
            <input type="date" id="birthDate" name="birthDate" value="<%= employeeDTO.getDateOfBirth() %>" required>
        </div>
        <div class="form-group">
            <label for="position">Position:</label>
            <input type="text" id="position" name="position" value="<%= employeeDTO.getPosition() %>" required>
        </div>
        <div class="form-group">
            <label for="hireDate">Hire Date:</label>
            <input type="date" id="hireDate" name="hireDate" value="<%= employeeDTO.getHireDate() %>" required>
        </div>
        <div class="form-group">
            <label for="salary">Salary:</label>
            <input type="number" id="salary" name="salary" value="<%= employeeDTO.getSalary() %>" required>
        </div>
        <div class="form-group">
            <label for="childrenCount">Children Count:</label>
            <input type="number" id="childrenCount" name="childrenCount" value="<%= employeeDTO.getChildrenCount() %>" required>
        </div>
        <div class="form-group">
            <label for="socialSecurityNumber">Social Security Number:</label>
            <input type="text" id="socialSecurityNumber" name="socialSecurityNumber" value="<%= employeeDTO.getSocialSecurityNumber() %>" required>
        </div>
        <button type="submit">Update Employee</button>
    </form>
</div>
</body>
</html>
