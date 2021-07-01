<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>

<h1>Hello!</h1><br />
<c:forEach var="user" items="${requestScope.FileLine}">
    <ul>
        <li>Строка: <c:out value="${user}"/></li>
    </ul>
    <hr />
</c:forEach>

<form method="post" action="/servlet_tutorial_war">
        <input type="submit" size="50" value="Enter"> <br>
</form>

</body>
</html>
