package modal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.Cliente_Bean;
import common_things.DB_Connection;

public class Cliente_Modal {
	  public boolean ingresar_Cliente(Cliente_Bean obj_Cliente_Bean){
	  boolean flag=false;
	  DB_Connection obj_DB_Connection=new DB_Connection();
	  Connection connection=obj_DB_Connection.getConnection();
	  PreparedStatement ps=null;
	  int resultado;
	  try {
	   String qurey="INSERT INTO clinica.dueno (rut, nombre, apellido, direccion, correo, telefono, nombreMascota)" + 
	   		" VALUES (?, ?, ?, ?, ?, ?, ?)";
	   ps=connection.prepareStatement(qurey);
	   ps.setString(1, obj_Cliente_Bean.getRut());
	   ps.setString(2, obj_Cliente_Bean.getNombre());
	   ps.setString(3, obj_Cliente_Bean.getApellido());
	   ps.setString(4, obj_Cliente_Bean.getDireccion());
	   ps.setString(5, obj_Cliente_Bean.getCorreo());
	   ps.setInt(6, obj_Cliente_Bean.getTelefono());
	   ps.setString(7, obj_Cliente_Bean.getNombreMascota());
	   System.out.println(ps);	   
	   resultado = ps.executeUpdate();
	   System.out.println(resultado);
	   if(resultado==1){
	    flag=true;
	   }else {
		   System.out.println("Cliente ya existe");
	   }
	  } catch (Exception e) {
		  // TODO: handle exception
	  }
	  try {
		   String qurey="INSERT INTO clinica.mascota (rut, tipoMascota, edad, nombreMascota)" + 
		   		" VALUES (?, ?, ?, ?)";
		   ps=connection.prepareStatement(qurey);
		   ps.setString(1, obj_Cliente_Bean.getRut());
		   ps.setString(2, obj_Cliente_Bean.getTipoMascota());
		   ps.setInt(3, obj_Cliente_Bean.getEdad());
		   ps.setString(4, obj_Cliente_Bean.getNombreMascota());
		   System.out.println(ps);
		   resultado = ps.executeUpdate();
		   System.out.println(resultado);
		   if(resultado==1){
		    flag=true;
		   }else {
			   System.out.println("Error al guardar mascota");
		   }
		  } catch (Exception e) {
			  // TODO: handle exception
		 }finally {
		  try {
		   if(connection!=null){
		    connection.close();
		   }
		 } catch (Exception e2) {
			 // TODO: handle exception
		 }
		 }
	 return flag;
	 }
}
