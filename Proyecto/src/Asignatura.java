import java.util.Vector;

public class Asignatura {

	private String codAsig;

	/**
	 * 
	 * @element-type Alumno
	 */
	public Vector  AlumnoAsignatura;

	public Asignatura() {
	}

	public String getCodAsig() {
		return codAsig;
	}

	public void setCodAsig(String codAsig) {
		this.codAsig = codAsig;
	}

	public Vector getAlumnoAsignatura() {
		return AlumnoAsignatura;
	}

	public void setAlumnoAsignatura(Vector alumnoAsignatura) {
		AlumnoAsignatura = alumnoAsignatura;
	}

	@Override
	public String toString() {
		return "Asignatura codAsig= " + codAsig + " AlumnoAsignatura= " + AlumnoAsignatura;
	}


}