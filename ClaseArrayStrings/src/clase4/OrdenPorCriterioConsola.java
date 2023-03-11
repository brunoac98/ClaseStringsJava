/*
Ejercicio 1 parte B.
haga lo mismo, pero solicitando los parámetros de a uno por consola.
 */

package clase4;
import java.util.Scanner;

public class OrdenPorCriterioConsola {

	public static void main(String[] args) {
		
		int[] numerosArry = {0,0,0};
		int[] numsOrdenados;
		
		String avisoOpc = "\"Ingrese la opcion A (ascendente) - D (descendente) - X (salir): \"";
		
		char opcChar;
		
		Scanner num = new Scanner(System.in);
		Scanner opc = new Scanner(System.in);
		
		System.out.println(avisoOpc);
		String opcScn = opc.nextLine();
		opcScn = opcScn.toLowerCase();

		
		while(!opcScn.equals("a") && !opcScn.equals("d") && !opcScn.equals("x")) {
			System.out.println(avisoOpc);
			opcScn = opc.nextLine();
			opcScn = opcScn.toLowerCase();
			
			if(opcScn.equals("a") || opcScn.equals("d")) {
				for (int i=0;i<3;i++) {		
					
					System.out.println("Ingrese el numero \"" + (i+1) + "\" seguido de un espacio.");
					numerosArry[i] =  Integer.parseInt(num.nextLine());			
				}
				
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