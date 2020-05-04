import java.awt.List;
import java.io.*;
import java.io.ObjectInputStream.GetField;
import java.text.SimpleDateFormat;
import java.util.*;


public class Principal {

	public static void main(String[] args) throws FileNotFoundException {

		/* ******************************************************************************************************
		 * Proceso automatizado sin intervención del usuario que consta de tres fases:
		 * 
		 * 1. Carga del fichero de datos de alumnos denominado alumnos.txt en la carpeta por defecto del proyecto y creacion
		 * de la colección o colecciones correspondientes.
		 * 
		 * 2. Carga del fichero de prematriculas denominado prematriculas.txt en la carpeta por defecto del proyecto y creacion
		 * de la colección prematriculas.
		 * 	
		 * ******************************************************************************************************
		 */
		// Proceso de la fase 1
		//Pendiente de desarrollar

		// Proceso de la fase 2

		// creamos la instancia de la colección de prematrículas
		ArrayList<Prematricula> listPremat;

		listPremat = leerPrematriculas();


		// ******************************     Fin procesos automatizados     **********************************

		// Mostramos el menú
		int op;

		op=menu();
		while(op!=0){
			switch (op){
			case 1:
				mostrarDatos(listPremat);
				break;
			case 2:					

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:
				alumnoAsignatura(listPremat);
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

	/**
	 * <p>Este método crea un <b>ArrayList</b> de prematrículas con todas las líneas que son 
	 * leídas del archivo de texto <b>prematrículas.txt</b>.
	 *  
	 * @author  Rogelio Gimeno
	 * @author  Carlos Lahuerta
	 * @see     List
	 * @return  
	 */

	public static ArrayList<Prematricula> leerPrematriculas() {
		ArrayList<Prematricula> listaPrematr = new ArrayList<>();
		ArrayList<String> camposLinea;
		String marcaTemporal, email, cadena;
		AlumnoF alumno;
		CentroF centro = null;
		FamiliarF fam1;
		FamiliarF fam2;
		DestinatarioF destinatario;
		ItinerarioF itinerario;
		Prematricula unaPrematricula;

		// cargamos el fichero de texto
		File archivo = new File("prematriculas.txt");
		if (archivo.exists()) {
			try {
				// Leemos las líneas del fichero
				BufferedReader bf = new BufferedReader(new FileReader(archivo));
				cadena = bf.readLine();		
				while(cadena!=null) {
					//extraer datos del txt separados 
					String[] campos = cadena.split("~");							
					// Son atributos de la clase Prematricula
					marcaTemporal = campos[0];  
					email = campos[1];

					//Creamos el objeto AlumnoF -----------------------------------------------------
					camposLinea = new ArrayList<>();
					//creamos el arraylist para recoger los campos 2 a 12 recorriéndolos con el for	
					for (int i = 2; i <= 12; i++) {
						camposLinea.add(campos[i]);
					}
					//después le añadimos el campo 21
					camposLinea.add(campos[21]);

					//le pasamos el ArraList al objeto alum
					alumno = new AlumnoF(camposLinea);			

					// Creamos el objeto CentroF
					if (campos[13].equals("Sí")) {
						centro = new CentroF(Arrays.copyOfRange(campos, 13, (20+1)));
					}

					// Creamos los objetos familiar 1 y familiar 2 ---------------------------------------							
					fam1 = new FamiliarF(Arrays.copyOfRange(campos, 22, (29+1)));
					fam2 = new FamiliarF(Arrays.copyOfRange(campos, 30, (37+1)));

					//Creamos los objetos destinatario ---------------------------------------------------
					destinatario = new DestinatarioF(Arrays.copyOfRange(campos, 38, (41+1)));

					//Creamos el objeto itinerario Ciencias o Humanidades y CCSS -------------------------						
					camposLinea = new ArrayList<>();

					//en primer lugar añadimos la modalidad
					camposLinea.add(campos[47]);

					// añadimos las materias comunes a ambas modalidades. Campos 42 a 46
					for (int i = 42; i <= 46; i++) {
						camposLinea.add(campos[i]);
					}
					// discriminamos entre las asignaturas de la modalidad de Ciencias y Humanidades y CCSS
					if(campos[47].equals("Ciencias")) {
						// de los campos 48 a 53 son exclusivos del itinerario de Ciencias
						for (int i = 48; i <= 53; i++) {
							camposLinea.add(campos[i]);
						}
					} else if(campos[47].equals("Humanidades y Ciencias Sociales")) {
						// de los campos 54 a 59 son exclusivos del itinerario de Humanidades y CCSS
						for (int i = 54; i <= 59; i++) {
							camposLinea.add(campos[i]);
						}
					}					
					// añadimos prelación de las materias optativas. Campos 60 al 63
					for (int i = 60; i <= 63; i++) {
						camposLinea.add(campos[i]);
					}	
					itinerario = new ItinerarioF(camposLinea);	

					//creamos un objeto de clase Prematricula

					unaPrematricula = new Prematricula(marcaTemporal, email, alumno, centro,
							fam1, fam2, destinatario, itinerario);
					listaPrematr.add(unaPrematricula);
					/*
					 * otra forma de pasar las premactriculas
					 * 	listaPrematr.add(new Prematricula(marcaTemporal, email, alumno, centro,
					 *		fam1, fam2, destinatario, itinerario));
					 * */

					// leemos una nueva líena de la cadena que contiene el archivo
					cadena = bf.readLine();	 				
				}//while

				bf.close();

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			System.out.println("El fichero no existe");
		}

		return listaPrematr;

	}// ***********************************************************************************

	/*
	 * LISTAR DATOS DE ALUMNO E ITINERARIO
	 * 
	 */
	public static void alumnoAsignatura(ArrayList<Prematricula> listPremat) {
		int contador = 1;
		for (Prematricula prematricula : listPremat) {
			System.out.println("\n*************************************************************"
					+ "\nALUMNO " + contador +":"+ prematricula.getAlumno() 
					+ "\n*********************************************************************"
					+ "\nITINERARIO: " + prematricula.getItinerario());
			contador++;
		}

	}//alumnoAsignatura

	/*
	 * METODO PARA MOSTRAR TODOS LOS DATOS
	 * 
	 */
	public static void mostrarDatos(ArrayList<Prematricula> listPremat) {

		for (Prematricula prematricula : listPremat) {
			System.out.println(prematricula);
		}
	}


	public static int menu() {
		int op;
		System.out.println("\nDADO EL SIGUIENTE MENU:\n");
		System.out.println("(1) Mostrar todos los datos. "
				+ "\n(2) Listado de alumnos por modalidad y troncales. "
				+ "\n(3) Listado de asignaturas específicas del itinerario científico por orden de elección de más a menos elegida. "
				+ "\n(4) Listado de asignaturas específicas del itinerario tecnológico por orden de elección de más a menos elegida. " 
				+ "\n(5) Informe individual de cada alumno con su elección de asignaturas. (Tal cual él las cumplimentó en la encuesta, sin tener en cuenta todavía la configuración definitiva de itinerarios. "
				+ "\n(6) Informe individual de cada alumno con las asignaturas de su elección conforme a los itinerarios que finalmente resulten de la elección de todos los alumnos. Lo que configurará su matrícula definitiva. "
				+ "\n(7) Informe individual de alumno con todas sus solicitudes para aquellos que tengan más de una encuesta cumplimentada."
				+ "\n(8) Listado de alumnos identificados con documento distinto a DNI o NIE."
				+ "\n(9) Listado de alumnos con DNI o NIE incorrectos."
				+ "\n(0) SALIR");

		op = Leer.pedirEntero("\nELIJA UNA OPCION");
		return op;
	} //menu

}// Principal


