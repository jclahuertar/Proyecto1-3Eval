import java.util.Arrays;

public class PasoArray {

	public static void main(String[] args) {
		String[] cadenas = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis"};			
		//System.out.println(cadenas);
		System.out.println(cadenas.length); 	
		String[] resultado = pasaMedioArray(Arrays.copyOfRange(cadenas, 4, 7 ));
	}
	private static String[] pasaMedioArray(String[] a) {
		System.out.println("entramos en el método");
		//System.out.println(a);
		System.out.println(a.length); 		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
//		System.out.println(a[3]);
//		System.out.println(a[4]);
//		System.out.println(a[5]);
//		System.out.println(a[6]);
//		System.out.println(a[7]);
//		System.out.println(a[8]);
		return null;
	}
}
