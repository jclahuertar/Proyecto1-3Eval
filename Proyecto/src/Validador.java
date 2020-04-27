
public class Validador {

	// -------------------------------------- Valida un DNI -------------------------------------------
	/**
	 * 
	 * @param dni - Recibe como parámetro un string formado por 8 números y una letra
	 * @return
	 */
	public static boolean validarDNI(String dni) {
		boolean esValido = false;
		int i = 0;
		int caracterASCII = 0;
		char letra = ' ';
		int miDNI = 0;
		int resto = 0;
		char[] asignaLetra = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

		if(dni.length() == 9 && Character.isLetter(dni.charAt(8))) {

			do {
				caracterASCII = dni.codePointAt(i);
				esValido = (caracterASCII > 47 && caracterASCII < 58);
				i++;
			} while (i < dni.length() -1 && esValido);	
		}

		if(esValido) {
			letra = Character.toUpperCase(dni.charAt(8));
			miDNI = Integer.parseInt(dni.substring(0,8));
			resto = miDNI % 23;
			esValido = (letra == asignaLetra[resto]);
		}

		return esValido;

	} //validarDNI

	// -------------------------------------- Valida un NIE -------------------------------------------
	public static boolean validarNIE(String nie) {
		boolean esValido = false;
		int i = 1;
		int caracterASCII = 0;
		char letra = ' ';
		int miNIE = 0;
		int resto = 0;
		char[] asignaLetra = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

		if(nie.length() == 9 && Character.isLetter(nie.charAt(8))
				&& (Character.toUpperCase(nie.charAt(0)) == 'X'
				||  Character.toUpperCase(nie.charAt(0)) == 'Y'
				||  Character.toUpperCase(nie.charAt(0)) == 'Z')) {

			do {
				caracterASCII = nie.codePointAt(i);
				esValido = (caracterASCII > 47 && caracterASCII < 58);
				i++;
			} while (i < nie.length() -1 && esValido);	
		}

		if(esValido && nie.substring(0,1).toUpperCase().equals("X")) {
			nie = "0" + nie.substring(1,9);
		} else if (esValido && nie.substring(0,1).toUpperCase().equals("Y")) {
			nie = "1" + nie.substring(1,9);	
		} else if (esValido && nie.substring(0,1).toUpperCase().equals("Z")) {
			nie = "2" + nie.substring(1,9);
		}

		if(esValido) {
			letra = Character.toUpperCase(nie.charAt(8));
			miNIE = Integer.parseInt(nie.substring(0,8));
			resto = miNIE % 23;
			esValido = (letra == asignaLetra[resto]);
		}

		return esValido;

		} // validarNIE ***************************************************************

		}// class

