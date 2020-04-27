
public class Persona {
	
	private String dni_nie;
	private String nombre;     
	private String apellidoUno;
	private String apellidoDos;
	private String fechaNac;
	
	public Persona(String dni_nie, String nombre, String apellidoUno,
			String apellidoDos, String fechaNac) {
		this.dni_nie = dni_nie;
		this.nombre = nombre;
		this.apellidoUno = apellidoUno;
		this.apellidoDos = apellidoDos;
		this.fechaNac = fechaNac;
	}

	public String getDni_nie() {
		return dni_nie;
	}

	public void setDni_nie(String dni_nie) {
		this.dni_nie = dni_nie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoUno() {
		return apellidoUno;
	}

	public void setApellidoUno(String apellidoUno) {
		this.apellidoUno = apellidoUno;
	}

	public String getApellidoDos() {
		return apellidoDos;
	}

	public void setApellidoDos(String apellidoDos) {
		this.apellidoDos = apellidoDos;
	}

	public String getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}


	@Override
	public String toString() {
		return "Persona dni_nie= " + dni_nie + " nombre= " + nombre + " apellido Uno = " + apellidoUno + " apellido Dos= "
				+ apellidoDos + " fechaNac= " + fechaNac;
	}


}