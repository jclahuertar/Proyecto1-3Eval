
public class DestinatarioF {

	String nombre;
	String domicilio;
	String localidad;
	String cp;
	
	public DestinatarioF(String nombre, String domicilio, String localidad, String cp) {
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.localidad = localidad;
		this.cp = cp;
	}

	public DestinatarioF(String[] a) {
		this.nombre = a[0];
		this.domicilio = a[1];
		this.localidad = a[2];
		this.cp = a[3];
	}
	
	
	
	
}
