
public class Prematricula {

	// todos los atributos de clase son de tipo string, pero los separamos en su declaración por bloques homogéneos

	private String marcaTemporal;
	private String email;

	private AlumnoF alumno;
	private CentroF centro;
	private FamiliarF familiar1;
	private FamiliarF familiar2;
	private DestinatarioF destinatario;
	private ItinerarioF itinerario;

	public Prematricula(String marcaTemporal, String email, AlumnoF alumno, CentroF centro, FamiliarF familiar1,
			FamiliarF familiar2, DestinatarioF destinatario, ItinerarioF itinerario) {
		this.marcaTemporal = marcaTemporal;
		this.email = email;
		this.alumno = alumno;
		this.centro = centro;
		this.familiar1 = familiar1;
		this.familiar2 = familiar2;
		this.destinatario = destinatario;
		this.itinerario = itinerario;
	}

	public String getMarcaTemporal() {
		return marcaTemporal;
	}

	public void setMarcaTemporal(String marcaTemporal) {
		this.marcaTemporal = marcaTemporal;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public AlumnoF getAlumno() {
		return alumno;
	}

	public void setAlumno(AlumnoF alumno) {
		this.alumno = alumno;
	}

	public CentroF getCentro() {
		return centro;
	}

	public void setCentro(CentroF centro) {
		this.centro = centro;
	}

	public FamiliarF getFamiliar1() {
		return familiar1;
	}

	public void setFamiliar1(FamiliarF familiar1) {
		this.familiar1 = familiar1;
	}

	public FamiliarF getFamiliar2() {
		return familiar2;
	}

	public void setFamiliar2(FamiliarF familiar2) {
		this.familiar2 = familiar2;
	}

	public DestinatarioF getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(DestinatarioF destinatario) {
		this.destinatario = destinatario;
	}

	public ItinerarioF getItinerario() {
		return itinerario;
	}

	public void setItinerario(ItinerarioF itinerario) {
		this.itinerario = itinerario;
	}

	@Override
	public String toString() {
		return 	  "*************************************************************************************"
				+ "\nFecha registro: " + marcaTemporal + "           email registrante: " + email
				+ "\nDatos alumno: " + alumno
				+ "\n--------------------------------------------"
				+ "\nDatos centro: " + centro
				+ "\n--------------------------------------------"
				+ "\nDatos 1º familiar: " + familiar1
				+ "\n--------------------------------------------"
				+ "\nDatos 2º familiar: " + familiar2
				+ "\n--------------------------------------------"
				+ "\nDatos destinatario: " + destinatario
				+ "\n--------------------------------------------"
				+ "\nItinerario: " + itinerario
				+ "\n***********************************************************************************";
	}

}// class

