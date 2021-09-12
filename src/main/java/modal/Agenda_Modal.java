package modal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import bean.Agenda_Bean;
import common_things.DB_Connection;
public class Agenda_Modal {
	  public boolean ingresar_Agenda(Agenda_Bean obj_Agenda_Bean){
	  boolean flag=false;
	  DB_Connection obj_DB_Connection=new DB_Connection();
	  Connection connection=obj_DB_Connection.getConnection();
	  PreparedStatement ps=null;
	  int resultado;
	  try {
	   String qurey="INSERT INTO clinica.agenda (idMascota, rut, nombreMascota, hora, fecha)" + 
	   		" VALUES (?, ?, ?, ?, ?)";
	   ps=connection.prepareStatement(qurey);
	   ps.setInt(1, obj_Agenda_Bean.getIdMascota());
	   ps.setString(2, obj_Agenda_Bean.getRut());
	   ps.setString(3, obj_Agenda_Bean.getNombreMascota());
	   ps.setString(4, obj_Agenda_Bean.getHora());
	   ps.setString(5, obj_Agenda_Bean.getFecha()); 
	   resultado = ps.executeUpdate();
	   System.out.println(resultado);
	   if(resultado==1){
	    flag=true;
	    System.out.println("guardado con exito");
	   }else {
		   System.out.println("error al agendar");
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
