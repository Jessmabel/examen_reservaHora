 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="UTF-8"%>
  <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
  <html>
  <%@page import="modal.Cliente_Modal"%>
  <%@page import="bean.Cliente_Bean"%>
  <head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Insert title here</title>
  </head>
  <body>
   <jsp:useBean id="obj_Cliente_Bean" class="bean.Cliente_Bean"></jsp:useBean>
   <jsp:setProperty property="*" name="obj_Cliente_Bean"/>
   <%
	System.out.println(obj_Cliente_Bean.getRut());
	System.out.println(obj_Cliente_Bean.getNombre());
	System.out.println(obj_Cliente_Bean.getApellido());
	System.out.println(obj_Cliente_Bean.getDireccion());
	System.out.println(obj_Cliente_Bean.getCorreo());
	System.out.println(obj_Cliente_Bean.getTelefono());
	System.out.println(obj_Cliente_Bean.getNombreMascota());
	System.out.println(obj_Cliente_Bean.getTipoMascota());
	System.out.println(obj_Cliente_Bean.getEdad());
     Cliente_Modal obj_Cliente_Modal=new Cliente_Modal();
    boolean flag=obj_Cliente_Modal.ingresar_Cliente(obj_Cliente_Bean);
    if(flag){
    %>
    <script type="text/javascript">
    window.location.href="http://localhost:8070/ReservaHora/profile/view/ingresarCliente.jsp";
   </script>
  	<%
  	session.setAttribute("cliente_message", "registro exitoso");
}else{
  	%>
  	<script type="text/javascript">
    window.location.href="http://localhost:8070/ReservaHora/profile/view/ingresarCliente.jsp";
   </script>
  	<%
  	session.setAttribute("cliente_message", "Error al ingresar cliente");
 }
 %>
 </body>
 </html>