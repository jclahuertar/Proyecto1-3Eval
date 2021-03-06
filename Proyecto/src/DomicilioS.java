import java.util.Vector;

public class DomicilioS {

	private String dni_nie;
	private String domicilio;
	private String restoDomicilio;
	private int codPostal;
	private String localidad;
	private String municipio;
	private String provincia;

	/**
	 * 
	 * @element-type Alumno
	 */
	public Vector  tiene;

	public DomicilioS() {
	}

	public String getDni_nie() {
		return dni_nie;
	}

	public void setDni_nie(String dni_nie) {
		this.dni_nie = dni_nie;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getRestoDomicilio() {
		return restoDomicilio;
	}

	public void setRestoDomicilio(String restoDomicilio) {
		this.restoDomicilio = restoDomicilio;
	}

	public int getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(int codPostal) {
		this.codPostal = codPostal;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public Vector getTiene() {
		return tiene;
	}

	public void setTiene(Vector tiene) {
		this.tiene = tiene;
	}

	@Override
	public String toString() {
		return "Domicilio [dni_nie=" + dni_nie + ", domicilio=" + domicilio + ", restoDomicilio=" + restoDomicilio
				+ ", codPostal=" + codPostal + ", localidad=" + localidad + ", municipio=" + municipio + ", provincia="
				+ provincia + ", tiene=" + tiene + "]";
	}



}