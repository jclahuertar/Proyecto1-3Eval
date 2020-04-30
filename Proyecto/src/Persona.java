
public class Persona {
	
	private String nombre;     // [2]
	private String apellidoUno;// [3]
	private String apellidoDos;// [4]
	private String tipoId;     // [5]
	private String dni_nie;    // [6]
	

	public Persona(String nombre, String apellidoUno, String apellidoDos, String tipoId, String dni_nie) {
		this.nombre = nombre;
		this.apellidoUno = apellidoUno;
		this.apellidoDos = apellidoDos;
		this.tipoId = tipoId;
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

	public String getTipoId() {
		return tipoId;
	}

	public void setTipoId(String tipoId) {
		this.tipoId = tipoId;
	}

	public String getDni_nie() {
		return dni_nie;
	}

	public void setDni_nie(String dni_nie) {
		this.dni_nie = dni_nie;
	}

	@Override
	public String toString() {
		return nombre + " " + apellidoUno + " " + apellidoDos + ", con " + tipoId + " " + dni_nie + ", ";
	}
	
	
	
}// Persona