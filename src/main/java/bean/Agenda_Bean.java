package bean;

public class Agenda_Bean {
	private int idMascota;
	private String rut;
	private String nombreMascota;
	private String hora;
	private String fecha;
	
	public Agenda_Bean() {
		super();
	}
	

	public Agenda_Bean(int idMascota, String rut, String nombreMascota, String hora, String fecha) {
		super();
		this.idMascota = idMascota;
		this.rut = rut;
		this.nombreMascota = nombreMascota;
		this.hora = hora;
		this.fecha = fecha;
	}


	public int getIdMascota() {
		return idMascota;
	}

	public void setIdMascota(int idMascota) {
		this.idMascota = idMascota;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombreMascota() {
		return nombreMascota;
	}

	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
}
