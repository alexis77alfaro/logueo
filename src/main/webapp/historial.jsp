<!DOCTYPE html>
<html lang="en">

<head>
    <title></title>
    <meta charset="UTF-8">
     <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="css/style.css" rel="stylesheet">
</head>
<script src="http://code.jquery.com/jquery-latest.js">
</script>

<Script>
    $(Document).ready(function() {
        $.post('serverletHistorial()', {
            let datos = JSON.parse(response);
            var tabladatos = document.getElementById('table1');

            for (let item of datos) {
                tabladatos.innerHtml += `
                
                	 <tr>
                    <td>${item.idUsuariop}</td>
                    <td>${item.fecha}</td>
                    <td>${item.nombre_usuario}</td>
                    
                    
                    
                    </tr>
                
                `
            }
        });

    });
</Script>

<body>

 <table class="table1" align="center" id="table1">
        <thead class="dark">
            <th>Id</th>
            <th>Nombre</th>
            <th>Fecha</th>
       
        </thead>
        <tbody>

        </tbody>

    </table>
 

</body>

</html>