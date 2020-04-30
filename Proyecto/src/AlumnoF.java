import java.util.ArrayList;

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
	
//	public AlumnoF(String nombre, String apellidoUno, String apellidoDos, String tipoId, String dni_nie,
//			String fechaNac, String paisNac, String nacionalidad, String sexo, String email,
//			String telefono, String repite) {
//		super(nombre, apellidoUno, apellidoDos, tipoId, dni_nie);
//		this.fechaNac = fechaNac;
//		this.paisNac = paisNac;
//		this.nacionalidad = nacionalidad;
//		this.sexo = sexo;
//		this.email = email;
//		this.telefono = telefono;
//		this.repite = repite;
//	}

	public AlumnoF(ArrayList<String> a) {
		//    nombre    apellUno  apellDos  tipoId    dni_nie
		super(a.get(0), a.get(1), a.get(2), a.get(3), a.get(4));
		this.fechaNac = a.get(5);
		this.paisNac = a.get(6);
		this.nacionalidad = a.get(7);
		this.sexo = a.get(8);
		this.email = a.get(9);
		this.telefono = a.get(10);
		this.repite = a.get(11);
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

	@Override
	public String toString() {
		return super.toString() + "\nFecha de nacimiento " + fechaNac + ", sexo "+ sexo
				+ ", nacido en " + paisNac + ", nacionalidad " + nacionalidad + "\n"
				+ "email " + email + ", y telefono " + telefono
				+ ", ¿Es repetidor? " + repite;
	}

	
	
}// AlumnoF
