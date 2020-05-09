<!DOCTYPE html>
<html lang="en">

<head>
    <title></title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="css/style.css" rel="stylesheet">
</head>
<% 
  
HttpSession seccion=(HttpSession)request.getSession();
String usuariovariable=(String)seccion.getAttribute("usuario");

if(usuariovariable==null){
	response.sendRedirect("index.jsp");
}

%>
    <style>
        a {
            text-decoration: none;
            text-align: center;
            color: black;
        }
        
        a:hover {
            background-color: aquamarine;
        }
    </style>

    <body>
        <a href="historial.jsp">Historial</a>
        <form action="serveletController" method="Post">
            <input type="submit" value="cerrar" name="btncerrar">
        </form>

    </body>

</html>