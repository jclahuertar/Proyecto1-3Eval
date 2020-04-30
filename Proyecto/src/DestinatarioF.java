
public class DestinatarioF {

	String nombre;
	String domicilio;
	String localidad;
	String cp;

	public DestinatarioF(String[] a) {
		this.nombre = a[0];
		this.domicilio = a[1];
		this.localidad = a[2];
		this.cp = a[3];
	}

	@Override
	public String toString() {
		return nombre +"\n"
				+ domicilio +"\n"
				+ cp +" " + localidad;
	}
		
	
}
