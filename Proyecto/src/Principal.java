import java.awt.List;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;


public class Principal {

	public static void main(String[] args) throws FileNotFoundException {

		// creamos la instancia de la colección de prematrículas
		ArrayList<AlumnoF> alumnosF = null;
		HashSet<Prematricula> hashPrematriculas = new HashSet<>();


		/* ******************************************************************************************************
		 * Proceso automatizado sin intervención del usuario que consta de tres fases:
		 * 
		 * 1. Carga del fichero de datos de alumnos denominado alumnos.txt en la carpeta por defecto del proyecto y creacion
		 * de la colección o colecciones correspondientes.
		 * 2. Carga del fichero de prematriculas denominado prematriculas.txt en la carpeta por defecto del proyecto y creacion
		 * de la colección prematriculas.
		 * 3. Validación de los DNI´s y NIE´s de la colección prematriculas
		 * 	
		 */

		// Proceso de la fase 1

		try {
			leerAlumnos();
		} catch (IOException e1) {

			e1.printStackTrace();
		}

		// Proceso de la fase 2

		leerPrematriculas();

		
		// Proceso de la fase 3.
		//Prueba verificación DNI's o NIF´s de la clase prematriculas
		boolean a = Validador.validarNIE("25159785Q");
		System.out.println(a);


		// ******************************     Fin procesos automatizados     **********************************


		int op;

		op=menu();
		while(op!=0){
			switch (op){
			case 1:

				break;
			case 2:					

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			case 6:

				break;
			case 7:

				break;
			case 8:

				break;

			}//switch


			op=menu();
		}//while

	}// Main

	/* *********************************************************************************************************
	 *                                                 M É T O D O S                                           *
	 ***********************************************************************************************************/

	public static void leerPrematriculas() {
		
		String marcaTemporal, email, cadena;

		File prematriculas = new File("prematriculas.txt");

		if (prematriculas.exists()) {
			//System.out.println("El fichero existe");

			try {
				BufferedReader bf = new BufferedReader(new FileReader(prematriculas));
				cadena = bf.readLine();		
				Prematricula pre;

				while(cadena!=null) {
					//extraer datos del txt.. separados 

					String[] campos = cadena.split("~");							

					marcaTemporal = campos[0];  
					email = campos[1];
	
					alumnosF = crearAlumnoF(Arrays.copyOfRange(campos, 3, (20+1)));
										
					if (campos[13].equals("Sí")) {
						CentroF centro = new CentroF(Arrays.copyOfRange(campos, 13, (20+1)));
					}
					
					
					crearFamiliarF(campos);
					crearDestinatarioF(campos);
					crearItineraioF(campos);



					
					
					tipoIdFamiliar1 = campos[22];
					idFamiliar1 = campos[23];
					tipoFamiliar1 = campos[24];
					nombreFamiliar1 = campos[25];
					apell1Familiar1 = campos[26];
					apell2Familiar1 = campos[27];
					telefonoFamiliar1 = campos[28];
					emailFamiliar1 = campos[29];
					
					tipoIdFamiliar2 = campos[30];
					idFamiliar2 = campos[31];
					tipoFamiliar2 = campos[32];
					nombreFamiliar2 = campos[33];
					apell1Familiar2 = campos[34];
					apell2Familiar2 = campos[35];
					telefonoFamiliar2 = campos[36];
					emailFamiliar2 = campos[37];
					
					destinartarioCorreo = campos[38];
					domicilioCorreo = campos[39];
					localidadCorreo = campos[40];
					cpCorreo = campos[41];
					troncal1G = campos[42];
					troncal2G = campos[43];
					troncal3G = campos[44];
					especifica1G = campos[45];
					especifica2G = campos[46];
					modalidad = campos[47];
					troncal4C = campos[48];
					troncalOpc1C = campos[49];
					troncalOpc2C = campos[50];
					opc1C = campos[51];
					opc2C = campos[52];
					opc3C = campos[53];
					troncalOpc1HCS = campos[54];
					troncal4HCS = campos[55];
					troncalOpc2HCS = campos[56];
					opc1HCS = campos[57];
					opc2HCS = campos[58];
					opc3HCS = campos[59];
					especifica3GOpc1 = campos[60];
					especifica3GOpc2 = campos[61];
					especifica3GOpc3 = campos[62];
					especifica3GOpc4 = campos[63];






					pre = new Prematricula (marcaTemporal,email	nombreAlum,apell1Alum,apell2Alum,tipoIdAulm,idAlum,
							fechaNacAlum,paisNacAlum,nacionalidadAlum,sexoAlum,emailAlum,telefonoAlum,otroCentro,nombreCentro,
							comunidadCentro,provinciaCentro,direccionCentro,localidadCentro,cpCento,telefonoCentro,repite,
							tipoIdFamiliar1,idFamiliar1,tipoFamiliar1,nombreFamiliar1,apell1Familiar1,apell2Familiar1,
							telefonoFamiliar1,emailFamiliar1,tipoIdFamiliar1,idFamiliar2,tipoFamiliar2,nombreFamiliar2,
							apell1Familiar2,apell2Familiar2,telefonoFamiliar2,emailFamiliar2,destinartarioCorreo,
							domicilioCorreo,localidadCorreo,cpCorreo,troncal1G,troncal2G,troncal3G,especifica1G,especifica2G,
							modalidad,troncal4C,troncalOpc1C,troncalOpc2C,opc1C,opc2C,opc3C,troncalOpc1HCS,troncal4HCS,
							troncalOpc2HCS,opc1HCS,opc2HCS,opc3HCS,especifica3GOpc1,especifica3GOpc2,especifica3GOpc3,
							especifica3GOpc4);

					hashPrematricula.add(pre);
					linea= bufferedReader.readLine();	 
				}//while
				bufferedReader.close();



			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(prematriculas);

		} else {
			System.out.println("El fichero no existe");
		}


	}// ***********************************************************************************

	private static void crearCentroF(String[] campos) {
//		ArrayList<CentroF> centroF = null;
//		CentroF c;
//		String otroCentro, nombreCentro, comunidadCentro, provinciaCentro, direccionCentro,
//		localidadCentro, cpCentro, telefonoCentro;
//
//		otroCentro = campos[13];
//		if (otroCentro.equals("Sí")) {
//			nombreCentro = campos[14];
//			comunidadCentro = campos[15];
//			provinciaCentro = campos[16];
//			direccionCentro = campos[17];
//			localidadCentro = campos[18];
//			cpCentro = campos[19];
//			telefonoCentro = campos[20];
//			c = new CentroF(otroCentro, nombreCentro, comunidadCentro, provinciaCentro, direccionCentro,
//					localidadCentro, cpCentro, telefonoCentro);
//			centroF.add(c);
//		}
		
		
		
	}// crearCentroF -------------------------
	
	
	
	
	
	

	private static void crearAlumnoF(String[] campos) {
		ArrayList<AlumnoF> alumnoF = null;
		AlumnoF a;
		String paisNacAlum, nacionalidadAlum, sexoAlum, emailAlum, telefonoAlum, repite;

		nombreAlum = campos[2];
		apell1Alum = campos[3];
		apell2Alum = campos[4];
		tipoIdAlum = campos[5];
		idAlum = campos[6];
		if (tipoIdAlum.equals("DNI")) {
			boolean dni = Validador.validarDNI(idAlum);
			if (!dni) idAlum = "DNI no válido";
		}

		if (tipoIdAlum.equals("NIE")) {
			boolean nie = Validador.validarNIE(idAlum);
			if (!nie) idAlum = "NIE no válido";
		}
		
		paisNacAlum = campos[8];
		nacionalidadAlum = campos[9];
		sexoAlum = campos[10];
		emailAlum = campos[11];
		telefonoAlum = campos[12];
		repite = campos[21];

		a = new AlumnoF(paisNacAlum, nacionalidadAlum, sexoAlum, emailAlum, telefonoAlum, repite);
		alumnoF.add(a);

	}//crearAlumnoF --------------------------

	private static ArrayList<Persona> crearPersonaF(String[] campos) {
		ArrayList<Persona> persona = null;
		Persona p;
		String nombreAlum, apell1Alum, apell2Alum, tipoIdAlum, idAlum, fechaNacAlum, tipoFamiliar;

		//Date fechaNacAlum;

		nombreAlum = campos[2];
		apell1Alum = campos[3];
		apell2Alum = campos[4];
		tipoIdAlum = campos[5];
		idAlum = campos[6];
		if (tipoIdAlum.equals("DNI")) {
			boolean dni = Validador.validarDNI(idAlum);
			if (!dni) idAlum = "DNI no válido";
		}

		if (tipoIdAlum.equals("NIE")) {
			boolean nie = Validador.validarNIE(idAlum);
			if (!nie) idAlum = "NIE no válido";
		}

		fechaNacAlum = campos[7];

		//        SimpleDateFormat parser = new SimpleDateFormat("EEE MMM d HH:mm:ss zzz yyyy");
		//        Date date = parser.parse(fechaNacAlum);
		//        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		//        fechaNacAlum = formatter.format(date);

		tipoFamiliar = "Alumno";
		p = new Persona(nombreAlum, apell1Alum, apell2Alum, idAlum,
				fechaNacAlum, tipoFamiliar);
		persona.add(p);
		
		return persona;

	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	



	public static void leerAlumnos() throws IOException {
		// Nombre del fichero "Sigad.txt"
		String cadena;

		//primero miramos si existe el fichero
		File fileSIGAD = new File("Sigad.txt");
		//si existe leemos el fichero
		if (!fileSIGAD.exists()) {
			//Accedemos y leemos el fichero
			BufferedReader bufferedReader = new BufferedReader(new FileReader("Sigad.txt"));
			while((cadena = bufferedReader.readLine())!=null) {
				<<<<<<< HEAD

				String[] lista = cadena.split("~");
				=======
						String []lista = cadena.split("~");

				>>>>>>> 181ab3782c744869a39402561bbd8f884faab5fa
				/*
				 * AQUI IRAN TODAS LAS POSICIONES O CAMPOS QUE TENGA EL ARCHIVO 
				 * DE TEXTO SIGAD.TXT, CADA POSICION DENTRO DEL ARRAY DE STRING "LISTA"
				 * PARA IR CAPTURANDO CADA POSICION SEPARADA CON "~"
				 * 
				 * */



				//lee otra linea y se repite el bucle hasta que terminen las lineas 
				cadena = bufferedReader.readLine();
			}//while
			bufferedReader.close();
		}else {
			System.out.println("El fichero ya existe");
		}//else
	}//cargarFicheroTextoSigad



	public static int menu() {

		int op;
		System.out.println("\nDADO EL SIGUIENTE MENU:\n");
		System.out.println("(1) Listado de alumnos por modalidad y troncales. "
				+ "\n(2) Listado de asignaturas específicas del itinerario científico por orden de elección de más a menos elegida. "
				+ "\n(3) Listado de asignaturas específicas del itinerario tecnológico por orden de elección de más a menos elegida. " 
				+ "\n(4) Informe individual de cada alumno con su elección de asignaturas. (Tal cual él las cumplimentó en la encuesta, sin tener en cuenta todavía la configuración definitiva de itinerarios. "
				+ "\n(5) Informe individual de cada alumno con las asignaturas de su elección conforme a los itinerarios que finalmente resulten de la elección de todos los alumnos. Lo que configurará su matrícula definitiva. "
				+ "\n(6) Informe individual de alumno con todas sus solicitudes para aquellos que tengan más de una encuesta cumplimentada."
				+ "\n(7) Listado de alumnos identificados con documento distinto a DNI o NIE."
				+ "\n(8) Listado de alumnos con DNI o NIE incorrectos."
				+ "\n(0) SALIR");

		op = Leer.pedirEntero("\nELIJA UNA OPCION");
		return op;

	} //menu

}// Principal


