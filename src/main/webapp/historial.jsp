<!DOCTYPE html>
<html lang="en">

<head>
    <title></title>
    <meta charset="UTF-8">
     <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
</head>
<script src="http://code.jquery.com/jquery-latest.js">
</script>

<Script>
    $(document).ready(function() {
    	var btn=$('#carga').val();
    	$.post('serverletHistorial',{
    		
    	},function(respose){
    		let datos=JSON.parse(respose);
    		
    		var tabladatos=document.getElementById('tabladatos2');
    		
    		for (let item of datos) {
                tabladatos.innerHtml += `
                
                	 <tr>
                    <td>${item.idHistorial}</td>
                    <td>${item.idUsurio}</td>

                    
                    <td>${item.fecha}</td>
                    <td>${item.nombre_usuario}</td>
                    
                    
                    
                    </tr>
                
                `
                }
    		
    	});
    });
          
</Script>

<body>

 <table  align="center" id="tabladatos2" class="table table-dark">
        <thead >
            <th>Id</th>
             <th>IdUsuario</th>
            <th>Nombre</th>
            <th>Fecha</th>
       
        </thead>
        <tbody>

        </tbody>

    </table>
 

</body>

</html>