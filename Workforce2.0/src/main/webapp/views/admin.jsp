<%--
  Created by IntelliJ IDEA.
  User: MD
  Date: 10/10/2024
  Time: 8:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin Dashboard</title>
    <link rel="stylesheet" href="/static/css/admin.css">
</head>
<body>
<nav class="navbar">
    <div class="logo">Admin Dashboard</div>
    <ul class="nav-links">
        <li><a href="#">Home</a></li>
        <li><a href="#">Profile</a></li>
        <li><a href="/user?action=logout">Logout</a></li>
    </ul>
</nav>


<div class="container">
    <h1>Welcome Admin</h1>

    <section class="employee-section">
        <h2>Existing Employees</h2>
        <table class="employee-table">
            <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>Role</th>
                <th>Action</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>1</td>
                <td>John Doe</td>
                <td>john.doe@example.com</td>
                <td>Employee</td>
                <td><button>Edit</button> <button>Delete</button></td>
            </tr>
            </tbody>
        </table>
    </section>

    <section class="hr-section">
        <h2>Existing HRs</h2>
        <table class="hr-table">
            <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>Role</th>
                <th>Action</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>1</td>
                <td>Jane Smith</td>
                <td>jane.smith@example.com</td>
                <td>HR</td>
                <td><button>Edit</button> <button>Delete</button></td>
            </tr>
            </tbody>
        </table>
    </section>

    <section class="add-employee-section">
        <h2>Add New Employee</h2>
        <form action="<%=request.getContextPath()%>/addEmployee" method="POST">
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" required>

            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>

            <label for="role">Role:</label>
            <select id="role" name="role" required>
                <option value="employee">Employee</option>
                <option value="hr">HR</option>
            </select>

            <button type="submit">Add Employee</button>
        </form>
    </section>
</div>
</body>
</html>
