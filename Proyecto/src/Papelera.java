//import java.util.ArrayList;

//public class Papelera {

	//private static void crearCentroF(String[] campos) {
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



//}// crearCentroF -------------------------

//private static AlumnoF crearAlumnoF(String[] campos) {
//	ArrayList<AlumnoF> alumnoF = null;
//	AlumnoF a;
//	String paisNacAlum, nacionalidadAlum, sexoAlum, emailAlum, telefonoAlum, repite;
//
//	nombreAlum = campos[2];
//	apell1Alum = campos[3];
//	apell2Alum = campos[4];
//	tipoIdAlum = campos[5];
//	idAlum = campos[6];
//	if (tipoIdAlum.equals("DNI")) {
//		boolean dni = Validador.validarDNI(idAlum);
//		if (!dni) idAlum = "DNI no válido";
//	}
//
//	if (tipoIdAlum.equals("NIE")) {
//		boolean nie = Validador.validarNIE(idAlum);
//		if (!nie) idAlum = "NIE no válido";
//	}
//
//	paisNacAlum = campos[8];
//	nacionalidadAlum = campos[9];
//	sexoAlum = campos[10];
//	emailAlum = campos[11];
//	telefonoAlum = campos[12];
//	repite = campos[21];
//
//	a = new AlumnoF(paisNacAlum, nacionalidadAlum, sexoAlum, emailAlum, telefonoAlum, repite);
//	alumnoF.add(a);
//
//}//crearAlumnoF --------------------------

	

//	private static ArrayList<Persona> crearPersonaF(String[] campos) {
//		ArrayList<Persona> persona = null;
//		Persona p;
//		String nombreAlum, apell1Alum, apell2Alum, tipoIdAlum, idAlum, fechaNacAlum, tipoFamiliar;
//
//		//Date fechaNacAlum;
//
//		nombreAlum = campos[2];
//		apell1Alum = campos[3];
//		apell2Alum = campos[4];
//		tipoIdAlum = campos[5];
//		idAlum = campos[6];
//		if (tipoIdAlum.equals("DNI")) {
//			boolean dni = Validador.validarDNI(idAlum);
//			if (!dni) idAlum = "DNI no válido";
//		}
//
//		if (tipoIdAlum.equals("NIE")) {
//			boolean nie = Validador.validarNIE(idAlum);
//			if (!nie) idAlum = "NIE no válido";
//		}
//
//		fechaNacAlum = campos[7];
//
//		//        SimpleDateFormat parser = new SimpleDateFormat("EEE MMM d HH:mm:ss zzz yyyy");
//		//        Date date = parser.parse(fechaNacAlum);
//		//        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
//		//        fechaNacAlum = formatter.format(date);
//
//		tipoFamiliar = "Alumno";
//		p = new Persona(nombreAlum, apell1Alum, apell2Alum, idAlum,
//				fechaNacAlum, tipoFamiliar);
//		persona.add(p);
//
//		return persona;
//
//	}
//
//	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

	
	//
	//
	//
	//
//		public static void leerAlumnos() throws IOException {
//			// Nombre del fichero "Sigad.txt"
//			String cadena;
	//
//			//primero miramos si existe el fichero
//			File fileSIGAD = new File("Sigad.txt");
//			//si existe leemos el fichero
//			if (!fileSIGAD.exists()) {
//				//Accedemos y leemos el fichero
//				BufferedReader bufferedReader = new BufferedReader(new FileReader("Sigad.txt"));
//				while((cadena = bufferedReader.readLine())!=null) {
//					<<<<<<< HEAD
	//
//					String[] lista = cadena.split("~");
//					=======
//							String []lista = cadena.split("~");
	//
	//
//					/*
//					 * AQUI IRAN TODAS LAS POSICIONES O CAMPOS QUE TENGA EL ARCHIVO 
//					 * DE TEXTO SIGAD.TXT, CADA POSICION DENTRO DEL ARRAY DE STRING "LISTA"
//					 * PARA IR CAPTURANDO CADA POSICION SEPARADA CON "~"
//					 * 
//					 * */
	//
	//
	//
//					//lee otra linea y se repite el bucle hasta que terminen las lineas 
//					cadena = bufferedReader.readLine();
//				}//while
//				bufferedReader.close();
//			}else {
//				System.out.println("El fichero ya existe");
//			}//else
//		}//cargarFicheroTextoSigad
	//
	
	
//}
