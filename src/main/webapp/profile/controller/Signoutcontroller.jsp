<%
session.removeAttribute("user_session");
session.setAttribute("login_message", "Sesión cerrada con éxito");
%>
<script type="text/javascript">
window.location.href="http://localhost:8070/ReservaHora/index.jsp";
</script>