<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
<h2>Home Page</h2>
<hr>
<p>
    ***\Luxury Leaders Page/***
</p>
<hr>
<p>
    <a href="${pageContext.request.contextPath}/employees">Back</a>
<br>
    <form:form action="${pageContext.request.contextPath}/logout" method="post">
        <input type="submit" value="Logout">
    </form:form>
</p>
</body>
</html>