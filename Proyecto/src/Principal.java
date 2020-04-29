import java.awt.List;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;


public class Principal {

	public static void main(String[] args) throws FileNotFoundException {

/* ******************************************************************************************************
* Proceso automatizado sin intervenci�n del usuario que consta de tres fases:
* 
* 1. Carga del fichero de datos de alumnos denominado alumnos.txt en la carpeta por defecto del proyecto y creacion
* de la colecci�n o colecciones correspondientes.
* 
* 2. Carga del fichero de prematriculas denominado prematriculas.txt en la carpeta por defecto del proyecto y creacion
* de la colecci�n prematriculas.
* 	
* ******************************************************************************************************
*/
	// Proceso de la fase 1
		//Pendiente de desarrollar

	// Proceso de la fase 2
		
		// creamos la instancia de la colecci�n de prematr�culas
		ArrayList<Prematricula> listPremat = null;

		listPremat = leerPrematriculas();


// ******************************     Fin procesos automatizados     **********************************

		// Mostramos el men�
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
*                                                 M � T O D O S                                           *
***********************************************************************************************************/

	public static ArrayList<Prematricula> leerPrematriculas() {
		ArrayList<Prematricula> capturaDatos = null;

		String marcaTemporal, email, cadena;
		AlumnoF alumno;
		CentroF centro = null;
		FamiliarF fam1;
		FamiliarF fam2 =null;
		DestinatarioF destinatario;
		ItinerarioF itinerario = null;
		

		// cargamos el fichero de texto
		File archivo = new File("prematriculas.txt");

		if (archivo.exists()) {
			//System.out.println("El fichero existe");
			try {
				// Leemos las l�neas del fichero
				BufferedReader bf = new BufferedReader(new FileReader(archivo));
				cadena = bf.readLine();		

				while(cadena!=null) {
					//extraer datos del txt.. separados 

					String[] campos = cadena.split("~");							
					// Son atributos de la clase Prematricula
					marcaTemporal = campos[0];  
					email = campos[1];

					// Atributos de la clase AlumnoF

					//Creamos el objeto AlumnoF
					//union = Arrays.copyOfRange(campos, 2, (12+1))+campos[21];


					//creamos el array list para listar los campos y recorrerlos con el for
					//de la posicion 2 a la 12 los a�adimos
					ArrayList<String> listarCampos = new ArrayList<>();
					for (int i = 2; i <= 12; i++) {
						listarCampos.add(campos[i]);
					}
					//despues a este arraylist le a�adimos el campo 21
					listarCampos.add(campos[21]);
					String[] camposConstructor = (String[]) listarCampos.toArray(); 
					//le pasamos el string al objeto alum
					alumno = new AlumnoF(camposConstructor);			

					//alum = new AlumnoF(Arrays.copyOfRange(campos, 2, (12+1)), campos[21]);
					// Creamos el objeto CentroF
					if (campos[13].equals("S�")) {
						centro = new CentroF(Arrays.copyOfRange(campos, 13, (20+1)));
					}

					// Creamos los objetos familiar 1 y familiar 2

					fam1 = new FamiliarF(Arrays.copyOfRange(campos, 22, (29+1)));

					fam2 = new FamiliarF(Arrays.copyOfRange(campos, 30, (37+1)));

					
					//Creamos los objetos itinerario Destinatario
					
					destinatario = new DestinatarioF(Arrays.copyOfRange(campos, 38, (41+1)));
					
					
					//Creamos los objetos itinerario Ciencias o Humanidades y CCSS
					listarCampos = new ArrayList<>();
					for (int i = 2; i <= 12; i++) {
						listarCampos.add(campos[i]);
					
					
					if(campos[47].equals("Ciencias")) {
						
						itinerario = new ItinerarioF(Arrays.copyOfRange(campos, , (+1)));
						
						
					} else if(campos[47].equals("Humanidades y Ciencias Sociales")) {
						
						listarCampos = new ArrayList<>();
						for (int i = 2; i <= 12; i++) {
							listarCampos.add(campos[i]);
						}
						//despues a este arraylist le a�adimos el campo 21
						listarCampos.add(campos[21]);
						String[] camposConstructor = (String[]) listarCampos.toArray(); 
						//le pasamos el string al objeto alum
						
						itinerario = new ItinerarioF(Arrays.copyOfRange(campos, , (+1)));
						
					} else {
						System.out.println("Itinearario no definido");
					}
					



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

			System.out.println(archivo);

		} else {
			System.out.println("El fichero no existe");
		}

		return capturaDatos;

	}// ***********************************************************************************


	public static int menu() {

		int op;
		System.out.println("\nDADO EL SIGUIENTE MENU:\n");
		System.out.println("(1) Listado de alumnos por modalidad y troncales. "
				+ "\n(2) Listado de asignaturas espec�ficas del itinerario cient�fico por orden de elecci�n de m�s a menos elegida. "
				+ "\n(3) Listado de asignaturas espec�ficas del itinerario tecnol�gico por orden de elecci�n de m�s a menos elegida. " 
				+ "\n(4) Informe individual de cada alumno con su elecci�n de asignaturas. (Tal cual �l las cumpliment� en la encuesta, sin tener en cuenta todav�a la configuraci�n definitiva de itinerarios. "
				+ "\n(5) Informe individual de cada alumno con las asignaturas de su elecci�n conforme a los itinerarios que finalmente resulten de la elecci�n de todos los alumnos. Lo que configurar� su matr�cula definitiva. "
				+ "\n(6) Informe individual de alumno con todas sus solicitudes para aquellos que tengan m�s de una encuesta cumplimentada."
				+ "\n(7) Listado de alumnos identificados con documento distinto a DNI o NIE."
				+ "\n(8) Listado de alumnos con DNI o NIE incorrectos."
				+ "\n(0) SALIR");

		op = Leer.pedirEntero("\nELIJA UNA OPCION");
		return op;

	} //menu

}// Principal


