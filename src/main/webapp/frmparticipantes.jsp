
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" rel="stylesheet">

      
        <title>JSP Page</title>
    </head>
    <body>
       <div class="container" >
            
            <h1>Formulario de Partcipantes</h1>
            <jsp:include page="META-INF/menu.jsp">
                <jsp:param name="opcion" value="participantes"/>
            </jsp:include>
            <br>
            <form action="ParticipantesControlador" method="post" >
                <input type="hidden" name="id" value="${participantes.id}" >
                <div class="mb-3">
                    <label for="apellidos" class="form-label">Apellidos</label>
                    <input type="text"  name="nombre" value="${participantes.apellidos}" class="form-control" id="apellidos" >                    
                </div>
                <div class="mb-3">
                    <label for="nombres" class="form-label">Nombres</label>
                    <input type="email" name="correo" value="${participantes.nombres}" class="form-control" id="nombres" >
                </div>
                <div class="mb-3">
                    <label for="id_seminario" class="form-label">Id seminario</label>
                    <input type="text" name="celular" value="${participantes.id_seminario}" class="form-control" id="id_seminario" >
                </div>
                <div class="mb-3">
                    <label for="confirmado" class="form-label">confirmado</label>
                    <input type="text" name="celular" value="${participantes.confirmado}" class="form-control" id="confirmado" >
                </div>
                <button type="submit" class="btn btn-primary">Procesar</button>
            </form>
                
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
   
    </body>
</html>
