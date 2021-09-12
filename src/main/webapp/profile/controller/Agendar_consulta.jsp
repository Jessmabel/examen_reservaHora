 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="UTF-8"%>
  <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
  <html>
  <%@page import="modal.Agenda_Modal"%>
  <%@page import="bean.Agenda_Bean"%>
  <head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Insert title here</title>
  </head>
  <body>
   <jsp:useBean id="obj_Agenda_Bean" class="bean.Agenda_Bean"></jsp:useBean>
   <jsp:setProperty property="*" name="obj_Agenda_Bean"/>
   <%
	System.out.println(obj_Agenda_Bean.getIdMascota());
   	System.out.println(obj_Agenda_Bean.getRut());
   	System.out.println(obj_Agenda_Bean.getNombreMascota());
   	System.out.println(obj_Agenda_Bean.getHora());
   	System.out.println(obj_Agenda_Bean.getFecha());
   	Agenda_Modal obj_Agenda_Modal=new Agenda_Modal();
    boolean flag=obj_Agenda_Modal.ingresar_Agenda(obj_Agenda_Bean);
    if(flag){
    %>
    <script type="text/javascript">
    window.location.href="http://localhost:8070/ReservaHora/profile/view/agendar.jsp";
   </script>
  	<%
  	session.setAttribute("agenda_message", "Hora agendada");
}else{
  	%>
  	<script type="text/javascript">
    window.location.href="http://localhost:8070/ReservaHora/profile/view/agendar.jsp";
   </script>
  	<%
  	session.setAttribute("agenda_message", "Error al agendar hora");
 }
 %>
 </body>
 </html>