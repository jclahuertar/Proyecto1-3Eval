
public class CentroF {

	private String otroCentro;
	private String nombreCentro;
	private String comunidadCentro;
	private String provinciaCentro;
	private String direccionCentro;
	private String localidadCentro;
	private String cpCentro;
	private String telefonoCentro;

	public CentroF(String otroCentro, String nombreCentro, String comunidadCentro, String provinciaCentro,
			String direccionCentro, String localidadCentro, String cpCentro, String telefonoCentro) {
		this.otroCentro = otroCentro;
		this.nombreCentro = nombreCentro;
		this.comunidadCentro = comunidadCentro;
		this.provinciaCentro = provinciaCentro;
		this.direccionCentro = direccionCentro;
		this.localidadCentro = localidadCentro;
		this.cpCentro = cpCentro;
		this.telefonoCentro = telefonoCentro;
	}
	
	public CentroF(String[] campos) {
		this.otroCentro = campos[0];
		this.nombreCentro = campos[1];
		this.comunidadCentro = campos[2];
		this.provinciaCentro = campos[3];
		this.direccionCentro = campos[4];
		this.localidadCentro = campos[5];
		this.cpCentro = campos[6];
		this.telefonoCentro = campos[7];
	}

	public String getOtroCentro() {
		return otroCentro;
	}

	public void setOtroCentro(String otroCentro) {
		this.otroCentro = otroCentro;
	}

	public String getNombreCentro() {
		return nombreCentro;
	}

	public void setNombreCentro(String nombreCentro) {
		this.nombreCentro = nombreCentro;
	}

	public String getComunidadCentro() {
		return comunidadCentro;
	}

	public void setComunidadCentro(String comunidadCentro) {
		this.comunidadCentro = comunidadCentro;
	}

	public String getProvinciaCentro() {
		return provinciaCentro;
	}

	public void setProvinciaCentro(String provinciaCentro) {
		this.provinciaCentro = provinciaCentro;
	}

	public String getDireccionCentro() {
		return direccionCentro;
	}

	public void setDireccionCentro(String direccionCentro) {
		this.direccionCentro = direccionCentro;
	}

	public String getLocalidadCentro() {
		return localidadCentro;
	}

	public void setLocalidadCentro(String localidadCentro) {
		this.localidadCentro = localidadCentro;
	}

	public String getCpCentro() {
		return cpCentro;
	}

	public void setCpCento(String cpCentro) {
		this.cpCentro = cpCentro;
	}

	public String getTelefonoCentro() {
		return telefonoCentro;
	}

	public void setTelefonoCentro(String telefonoCentro) {
		this.telefonoCentro = telefonoCentro;
	}

	@Override
	public String toString() {
		return "CentroF [otroCentro=" + otroCentro + ", nombreCentro=" + nombreCentro + ", comunidadCentro="
				+ comunidadCentro + ", provinciaCentro=" + provinciaCentro + ", direccionCentro=" + direccionCentro
				+ ", localidadCentro=" + localidadCentro + ", cpCentro=" + cpCentro + ", telefonoCentro=" + telefonoCentro
				+ "]";
	}
	
	
	
}
