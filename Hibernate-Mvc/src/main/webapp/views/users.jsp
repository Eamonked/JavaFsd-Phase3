<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User List</title>
</head>
<body>
    <h2>User List</h2>
    <table>
        <tr>
            <th>ID</th>
            <th>First Name</th>
            <th>Last Name</th>
        </tr>
        
        <% for (Customer user : (List<Customer>) request.getAttribute("users")) { %>
            <tr>
                <td><%= user.getId() %></td>
                <td><%= user.getFirstname() %></td>
                <td><%= user.getLastname() %></td>
            </tr>
        <% } %>
    </table>
</body>
</html>
