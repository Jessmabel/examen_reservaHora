<%@page import="bean.Login_Bean"%>
<%@page import="bean.Cliente_Bean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
<title>Agendar</title>
</head>
<body style="background-color: #EEC8EE;">
 <%
 Login_Bean obj_Login_Bean=(Login_Bean)session.getAttribute("user_session");
 Cliente_Bean obj_Cliente_Bean=(Cliente_Bean)session.getAttribute("cliente");
 if(obj_Login_Bean==null){
 session.setAttribute("login_message", "Por favor, iniciar sesión");
 %>
 <script type="text/javascript">
 window.location.href="http://localhost:8070/clinica/index.jsp";
 </script>
 <% 
 }else{
%>
<nav class="navbar navbar-expand-sm navbar-info bg-light" aria-label="Third navbar example">
    <div class="container-fluid">
      <a class="navbar-brand text-cian" href="Home.jsp">Pet Smile</a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarsExample03" aria-controls="navbarsExample03" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>

      <div class="collapse navbar-collapse" id="navbarsExample03">
        <ul class="navbar-nav me-auto mb-2 mb-sm-0">
          <li class="nav-item">
          <a class="nav-link text-cian" href="ingresarCliente.jsp" >Registrar Cliente</a>
          </li>
          <li class="nav-item">
          <a class="nav-link text-cian" href="listarHoras.jsp" >Horas Agendadas</a>
          </li>
        </ul>
        <form>
          <a href="http://localhost:8070/ReservaHora/profile/controller/Signoutcontroller.jsp" id="salir" class="btn btn-outline-info">
            Salir
          </a>
        </form>
      </div>
    </div>
  </nav>
<div class="mt-5 row d-flex justify-content-center">          
	<div class="card border-secondary col-12 col-md-8 col-lg-6 col-xl-5">  
		  <div class="card-header  text-center">Agendar horas de consulta</div>
		  <div class="card-body ">
			  <form action="http://localhost:8070/ReservaHora/profile/controller/Agendar_consulta.jsp" method="POST" class="needs-validation">
				  <div class="mb-3">
					<label for="idMascota" class="form-label">Id mascota</label>
					<input type="text" class="form-control" id="idMascota" name="idMascota" value="<%=request.getParameter("idm")%>" tabindex="1"  readonly>                        
				  </div>
				  <div class="mb-3">
					<label for="nombreMascota" class="form-label">Nombre de la Mascota</label>
					<input type="text" class="form-control" id="nombreMascota" name="nombreMascota" tabindex="1" value="<%=request.getParameter("nom")%>" readonly>                        
				  </div>   
				  <div class="mb-3">
					<label for="rut" class="form-label">Rut Dueño</label>
					<input type="text" class="form-control" id="rut" name="rut" tabindex="1" value="<%=request.getParameter("ru")%>" readonly>                        
				  </div> 
				   <div class="mb-3">
					<label for="hora" class="direccion">Hora</label>
					<input type="time" class="form-control" id="hora" name="hora" tabindex="1"  required>                        
				  </div>    
				   <div class="mb-3">
					<label for="fecha" class="form-label">Fecha</label>
					<input type="date" class="form-control" placeholder="yyyy-mm-dd" min="1997-01-01" max="2030-12-31"  id="fecha" name="fecha" tabindex="1"  required>                        
				  </div>                                                          
				  <button type="submit" class="btn btn-info" id="btnGuardar" tabindex="5">Guardar</button>
				  <a href="http://localhost:8070/ReservaHora/profile/view/Home.jsp" class="btn btn-secondary">Cancelar</a>
			  </form>
			<%
			String message=(String)session.getAttribute("agenda_message");
			if(message!=null){
			out.println(message);
			session.removeAttribute("agenda_message");
			}
			%>      
		  </div>
	  </div>     
</div>
<%
 }
%>

<script src="js/validaciones.js"></script>
</body>
</html>