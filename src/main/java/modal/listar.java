package modal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Agenda_Bean;
import bean.Cliente_Bean;
import common_things.DB_Connection;

public class listar {
	 public List listarClientes(){
		 DB_Connection obj_DB_Connection=new DB_Connection();
		  Connection connection=obj_DB_Connection.getConnection();
		  PreparedStatement ps=null;
		  ResultSet rs=null;
		  ArrayList<Cliente_Bean> lista=new ArrayList<Cliente_Bean>();
		  try {
		   String qurey="SELECT d.rut, d.nombre, d.apellido, d.direccion, d.correo, d.telefono, d.nombreMascota, m.idMascota, m.tipoMascota, m.edad FROM clinica.dueno as d INNER JOIN clinica.mascota as m ON d.rut = m.rut";
		   ps=connection.prepareStatement(qurey);
		   System.out.println(ps);
		   rs=ps.executeQuery();
		   while (rs.next()) {
			   Cliente_Bean cliente= new Cliente_Bean();
			   cliente.setRut(rs.getString("rut"));
			   cliente.setNombre(rs.getString("nombre"));
			   cliente.setApellido(rs.getString("apellido"));
			   cliente.setDireccion(rs.getString("direccion"));
			   cliente.setCorreo(rs.getString("correo"));
			   cliente.setTelefono(rs.getInt("telefono"));
			   cliente.setIdMascota(rs.getInt("idMascota"));
			   cliente.setNombreMascota(rs.getString("nombreMascota"));
			   cliente.setTipoMascota(rs.getString("tipoMascota"));
			   cliente.setEdad(rs.getInt("edad"));
			   lista.add(cliente); 
			   }
		  } catch (Exception e) {
			  // TODO: handle exception
		 }
		 return lista;
		 }
	 public List listarAgenda(){
		 DB_Connection obj_DB_Connection=new DB_Connection();
		  Connection connection=obj_DB_Connection.getConnection();
		  PreparedStatement ps=null;
		  ResultSet rs=null;
		  ArrayList<Agenda_Bean> lista=new ArrayList<Agenda_Bean>();
		  try {
		   String qurey="SELECT idMascota, nombreMascota, rut, fecha, hora FROM clinica.agenda";
		   ps=connection.prepareStatement(qurey);
		   System.out.println(ps);
		   rs=ps.executeQuery();
		   while (rs.next()) {
			   Agenda_Bean agenda= new Agenda_Bean();
			   agenda.setIdMascota(rs.getInt("idMascota"));
			   agenda.setNombreMascota(rs.getString("nombreMascota"));
			   agenda.setRut(rs.getString("rut"));
			   agenda.setFecha(rs.getString("fecha"));
			   agenda.setHora(rs.getString("hora"));
			   lista.add(agenda); 
			   }
		  } catch (Exception e) {
			  // TODO: handle exception
		 }
		 return lista;
		 }
}
