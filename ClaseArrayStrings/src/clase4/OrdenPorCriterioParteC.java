/*
Ejercicio 1 parte C.
lo mismo, pero usando los parámetros si hay alguno (como en a) y haciendo (b)
si no detecta ninguno. Vea si con una función puede evitar repetir código
 */

package clase4;
import java.util.Scanner;

public class OrdenPorCriterioParteC {

	public static void main(String[] args) {
		
		//int[] numerosArry = {12,3,165};
		int[] numerosArry = new int[3];
		
		boolean vacio = true;
		
		String avisoOpc = "\"Ingrese la opcion A (ascendente) - D (descendente) - X (salir): \"";
		String opcScn = "";
		
		Scanner num = new Scanner(System.in);
		Scanner opc = new Scanner(System.in);
		
		for (int i=0;i<3;i++) {			
			if (numerosArry[i] != 0) {				
				vacio = false;
				break;
			}
			
		}
				
		if (vacio) {			
			for (int i=0;i<3;i++) {
				
				System.out.println("Ingrese el numero \"" + (i+1) + "\" seguido de un espacio.");
				numerosArry[i] =  Integer.parseInt(num.nextLine());
				
			}			
		}
		
		while(!opcScn.equals("a") && !opcScn.equals("d") && !opcScn.equals("x")) {
			System.out.println(avisoOpc);
			opcScn = opc.nextLine();
			opcScn = opcScn.toLowerCase();
			
			if(opcScn.equals("a") || opcScn.equals("d")) {
				numerosArry = ordenamiento(numerosArry, opcScn);		
				for (int i=0;i<3;i++) {				
					System.out.println(numerosArry[i]);				
				}			
			}
			
		}
			
	}

	private static int[] ordenamiento(int[] numeros, String opc) {
			
		int numAux = 0;
		
		if (opc.equals("a") || opc.equals("d")) {
		
			for (int i = 0; i < numeros.length - 1; i++) {
		        for (int j = 0; j < numeros.length - 1; j++) {
					
					if (opc.equals("a")) {
						
							if (numeros[j] > numeros[j + 1]) {
								numAux = numeros[j];
								numeros[j] = numeros[j + 1];
								numeros[j + 1] = numAux;								
								}	
					
						} else {
								
							if (numeros[j] < numeros[j + 1]) {								
								numAux = numeros[j];
								numeros[j] = numeros[j + 1];
								numeros[j + 1] = numAux;																
					    }						
					}				
				}				
			}		
			
		}
		
		return numeros;	
		
}

}