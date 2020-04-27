
public class Prematricula {

	// todos los atributos de clase son de tipo string, pero los separamos en su declaración por bloques homogéneos
	
	private String marcaTemporal, email;
	
	private AlumnoF alumnoF;
	private Centro centroF;
	private FamiliarF familiarF;
	private Destinatario destinatario;
	private Itinerario itinerario;
	
	
	
	
	public Prematricula(String marcaTemporal, String email, AlumnoS alum, CentroF cent, FamiliarS fami, Destinatario dest,
	Itinerario itin) {
		
		this.marcaTemporal = marcaTemporal;
		this.email = email;
		alumnoF = alum;
		centroF = cent;
		familiarF = fami;
		destinatario = dest;
		itinerario = itin;				
	}// constructor

	
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

	public AlumnoS getAlumnoF() {
		return alumnoF;
	}

	public void setAlumnoF(AlumnoS alumnoF) {
		this.alumnoF = alumnoF;
	}

	public CentroF getCentroF() {
		return centroF;
	}

	public void setCentroF(CentroF centroF) {
		this.centroF = centroF;
	}

	public FamiliarS getFamiliarF() {
		return familiarF;
	}

	public void setFamiliarF(FamiliarS familiarF) {
		this.familiarF = familiarF;
	}

	public Destinatario getDestinatarioF() {
		return destinatario;
	}

	public void setDestinatarioF(Destinatario destinatarioF) {
		this.destinatario = destinatarioF;
	}

	public Itinerario getItinerario() {
		return itinerario;
	}

	public void setItinerario(Itinerario itinerario) {
		this.itinerario = itinerario;
	}


	@Override
	public String toString() {
		return "Prematricula [marcaTemporal=" + marcaTemporal + ", email=" + email + ", alumnoF=" + alumnoF
				+ ", centroF=" + centroF + ", familiarF=" + familiarF + ", destinatarioF=" + destinatario
				+ ", itinerario=" + itinerario + "]";
	}

	
	
	
	
	
	
}// class

