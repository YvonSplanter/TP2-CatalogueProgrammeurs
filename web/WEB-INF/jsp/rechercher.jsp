<%-- 
    Document   : rechercher
    Created on : 10-Dec-2018, 11:04:58 PM
    Author     : anonyme
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <a href="retour">Retour a l'accueil</a>
        <br>
        <h1>Rechercher par langages</h1>
        
        <form action="rechercher" method="post">
            <label>Langages : </label>
            <input type="text" name="lgs" id="lgs">
            <br>
            <input type="submit" value="Rechercher">
        </form>
        
        <div>
            <c:if test="${not empty requestScope.listeP}">
                <ul>
                <c:forEach items="${requestScope.listeP}" var="p">
                    <li><a href="?id=${p.courriel}"><c:out value="${p.nom}" /></a></li>               
                </c:forEach>
                </ul>
            </c:if>
        </div>
    </body>
</html>
