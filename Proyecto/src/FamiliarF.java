public class FamiliarF extends Persona{
	
//	nombre, apell1, apell2, tipoId, id, fechaNac  (att de Persona)
	
	String tipoFamiliar = null;
	String telefonoFamiliar = null;
	String emailFamiliar = null;
	
	public FamiliarF(
			String nombre, String apellidoUno, String apellidoDos, String tipoId, String dni_nie,
			String tipoFamiliar, String telefonoFamiliar, String emailFamiliar
			) {
		super(nombre, apellidoUno, apellidoDos, tipoId, dni_nie);
		this.tipoFamiliar = tipoFamiliar;
		this.telefonoFamiliar = telefonoFamiliar;
		this.emailFamiliar = emailFamiliar;
	}
	//0    		1	2		3		4		5		6			7									
	//22	    23  24    	25     	26     	27     	28     		29
	//tipoId	id	tipo	nombre	apell1	apell2	telefono	email
	public FamiliarF(String[] a) {
		super(a[3], a[4], a[5], a[0], a[1]);
		this.tipoFamiliar = a[2];
		this.telefonoFamiliar = a[6];
		this.emailFamiliar = a[7];
	}
	public String getTipoFamiliar() {
		return tipoFamiliar;
	}
	public void setTipoFamiliar(String tipoFamiliar) {
		this.tipoFamiliar = tipoFamiliar;
	}
	public String getTelefonoFamiliar() {
		return telefonoFamiliar;
	}
	public void setTelefonoFamiliar(String telefonoFamiliar) {
		this.telefonoFamiliar = telefonoFamiliar;
	}
	public String getEmailFamiliar() {
		return emailFamiliar;
	}
	public void setEmailFamiliar(String emailFamiliar) {
		this.emailFamiliar = emailFamiliar;
	}
	

	
	
} // FamiliarF ******************************************************************************************