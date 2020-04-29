import java.util.Arrays;

public class PasoArray {

	public static void main(String[] args) {

		String[] cadenas = {"uno", "dos", "tres", "cuatro", "cinco", "seis"};
			
		System.out.println(cadenas);
		System.out.println(cadenas.length); 
		
		String[] resultado = pasaMedioArray(Arrays.copyOfRange(cadenas, 3, 6 ));
	}

	private static String[] pasaMedioArray(String[] a) {

		System.out.println("entramos en el método");
		System.out.println(a);
		System.out.println(a.length); 
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		return null;
	}

}
