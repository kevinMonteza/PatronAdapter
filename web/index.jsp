<%-- 
    Document   : index
    Created on : 30-may-2018, 18:16:38
    Author     : LABO08
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Biblioteca</title>
    </head>
    <body>
        <h1>Biblioteca</h1>
    </body>
    <form action="Control" method="post">
    <select name="selector">
        <option disabled="false">Ingrese opcion</option>
        <option>Manual</option>
        <option>Monografia</option>
        <option value="Archivo">Archivo ayuda</option>
    </select>
    <input type="hidden" value="a" name="a"/>
        <input type="submit" value="Buscar"/>
    </form>
   
</html>
