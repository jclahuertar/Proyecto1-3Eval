import java.util.ArrayList;

public class ItinerarioF {

	String modalidad;
	String trc1, trc2, trc3, trc4;
	String esp1, esp2;
	String trcO1, trcO2;
	String opc1, opc2, opc3;
	String espO1, espO2, espO3, espO4;
	
//	public ItinerarioF(String modalidad,
//			String trc1, String trc2, String trc3, String trc4,
//			String esp1, String esp2,
//			String trcO1, String trcO2,
//			String opc1, String opc2, String opc3,
//			String espO1, String espO2, String espO3,String espO4) {
//		this.modalidad = modalidad;
//		this.trc1 = trc1;
//		this.trc2 = trc2;
//		this.trc3 = trc3;
//		this.trc4 = trc4;
//		this.esp1 = esp1;
//		this.esp2 = esp2;
//		this.trcO1 = trcO1;
//		this.trcO2 = trcO2;
//		this.opc1 = opc1;
//		this.opc2 = opc2;
//		this.opc3 = opc3;
//		this.espO1 = espO1;
//		this.espO2 = espO2;
//		this.espO3 = espO3;
//		this.espO4 = espO4;
//	}
	
	public ItinerarioF(ArrayList<String> a) {
		this.modalidad = a.get(0);
		this.trc1 = a.get(1);
		this.trc2 = a.get(2);
		this.trc3 = a.get(3);
		this.trc4 = a.get(4);
		this.esp1 = a.get(5);
		this.esp2 = a.get(6);
		this.trcO1 = a.get(7);
		this.trcO2 = a.get(8);
		this.opc1 = a.get(9);
		this.opc2 = a.get(10);
		this.opc3 = a.get(11);
		this.espO1 = a.get(12);
		this.espO2 = a.get(13);
		this.espO3 = a.get(14);
		this.espO4 = a.get(15);
	}

	@Override
	public String toString() {
		return 	"Modalidad: " + modalidad 
				+ "\nTroncal 1: " + trc1 + ", Troncal 2: " + trc2 + ", Troncal 3: " + trc3 + ", Troncal 4: " + trc4 
				+ "\nEspecifica 1: " + esp1 + ", Especifica 2: " + esp2 
				+ "\nTroncal Opcional 1: " + trcO1 + ", Troncal Opcional 2: " + trcO2
				+ "\nOpcional 1: " + opc1 + ", Opcional 2: " + opc2 + ", Opcional 3: " + opc3 
				+ "\nEspecifica Opcional 1: " + espO1 + ", Especifica Opcional 2: " + espO2 
				+ "\nEspecifica Opcional 3: " + espO3 + ", Especifica Opcional 4: " + espO4;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
