
public class AlumnoF extends Persona{

	//	nombre, apell1, apell2, tipoId, id, fechaNac  (att de Persona)
	//  paisNacAlum, nacionalidadAlum, sexoAlum, emailAlum, telefonoAlum, repite  (att de Alumno)

	//Alumno formulario
	private String fechaNac;
	private String paisNac;
	private String nacionalidad; 
	private String sexo;
	private String email;
	private String telefono;
	private String repite;
	
	public AlumnoF(String nombre, String apellidoUno, String apellidoDos, String tipoId, String dni_nie,
			String fechaNac, String paisNac, String nacionalidad, String sexo, String email,
			String telefono, String repite) {
		super(nombre, apellidoUno, apellidoDos, tipoId, dni_nie);
		this.fechaNac = fechaNac;
		this.paisNac = paisNac;
		this.nacionalidad = nacionalidad;
		this.sexo = sexo;
		this.email = email;
		this.telefono = telefono;
		this.repite = repite;
	}

	public AlumnoF(String[] a) {
		super(a[0], a[1], a[2], a[3], a[4]);
		this.paisNac = a[5];
		this.paisNac = a[6];
		this.nacionalidad = a[7];
		this.sexo = a[8];
		this.email = a[9];
		this.telefono = a[10];
		this.repite = a[11];
	
//	public AlumnoF(String[] campos) {
//		super(campos[2], campos[3], campos[4], campos[5], campos[6]);
//		this.paisNacAlum = campos[7];
//		this.paisNacAlum = campos[8];
//		this.nacionalidadAlum = campos[9];
//		this.sexoAlum = campos[10];
//		this.emailAlum = campos[11];
//		this.telefonoAlum = campos[12];
//		this.repite = campos[21];

	}
	
	public String getPaisNac() {
		return paisNac;
	}
	public void setPaisNac(String paisNac) {
		this.paisNac = paisNac;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getRepite() {
		return repite;
	}

	public void setRepite(String repite) {
		this.repite = repite;
	}

} // AlumnosF *******************************************************************************************
