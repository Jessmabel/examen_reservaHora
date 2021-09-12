 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="UTF-8"%>
  <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
  <html>
  <%@page import="modal.Login_Modal"%>
  <%@page import="bean.Login_Bean"%>
  <head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Insert title here</title>
  </head>
  <body>
   <jsp:useBean id="obj_Login_Bean" class="bean.Login_Bean"></jsp:useBean>
   <jsp:setProperty property="*" name="obj_Login_Bean"/>
   <%
     System.out.println(obj_Login_Bean.getNombreUsuario());
     System.out.println(obj_Login_Bean.getPassword());
     Login_Modal obj_Login_Modal=new Login_Modal();
     boolean flag=obj_Login_Modal.check_user_name(obj_Login_Bean);
    if(flag){
     session.setAttribute("user_session", obj_Login_Bean);
    %>
    <script type="text/javascript">
       window.location.href="http://localhost:8070/ReservaHora/profile/view/Home.jsp";
    </script>
  <%
}else{
 session.setAttribute("login_message", "Inicio de sesión fallido, usuario y/o contraseña son incorrectos");
  %>
  <script type="text/javascript">
   window.location.href="http://localhost:8070/ReservaHora/index.jsp";
   </script>
  <%
 }
 %>
 </body>
 </html>