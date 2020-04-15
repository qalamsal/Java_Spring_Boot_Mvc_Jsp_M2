<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Profile Page</title>
</head>
<body>
    <h2>Welcome ${title}</h2>
    <h2>This is your profile page !</h2>
    Employee Id: ${emp.id}, ${emp.name}
    <table width="700" border="1">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Email</th>
        </tr>
        <c:forEach items ="${students}" var="student">
            <tr>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.email}</td>
        </tr>
        </c:forEach>
    </table>
</body>
</html>