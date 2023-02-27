<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="C" uri="http://www.springframework.org/tags" %>
<%@page session="false" %>

<!DOCTYPE html>
<html>
<body>

<h2>All Employees</h2>

<br>

<h3>
<table>
    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>Department</th>
        <th>Salary</th>
        <th>Operations</th>
    </tr>

    <c:forEach var="emp" items="${allEmps}">

        <tr>
            <td>${emp.name}</td>
            <td>${emp.surname}</td>
            <td>${emp.department}</td>
            <td>${emp.salary}</td>

        </tr>
    </c:forEach>

</table>

    <br>

    <input type="button" value="add"
    onclick="window.location.href='addNewEmployee'"
    />



</h3>

</body>
</html>