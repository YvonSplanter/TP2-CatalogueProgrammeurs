
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
        
        <h1>Liste des programmeurs</h1>
        <ul>
            <c:forEach items="${requestScope.programmeur}" var="p">
                <li><a href="?id=${p.courriel}"><c:out value="${p.nom}" /></a></li>
            </c:forEach>
        </ul>
    </body>
</html>
