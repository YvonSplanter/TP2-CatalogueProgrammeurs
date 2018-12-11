<%-- 
    Document   : ajouter
    Created on : 10-Dec-2018, 4:36:46 PM
    Author     : anonyme
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ajouter</title>
    </head>
    <body>
        <form action="ajouter" method="post">
            <label>Nom: </label>
            <input type="text" name="nom" id="nom"  required=""/><br>
            <label>Courriel: </label>
            <input type="email" name="courriel" id="courriel" /><br>
            <label>Langages: </label>
            <input type="text" name="lang" id="lang" /><br>
            
            <input type="submit" value="Ajouter">
        </form>
        
        <a href="retour">Accueil</a>
        
    </body>
</html>
