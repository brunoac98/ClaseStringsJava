/*
Ejercicio 1 parte A.
haga un main, donde por parámetro ponga 3 números y una letra que
represente ascendente o descendente y los muestre ordenados por tal criterio
 */

package clase4;

public class OrdenPorCriterio {
	
	public static void main(String[] args) {
		
		int numeros[] = new int[] {3,5,2,12,4};
		char opc = 'd';
		opc = Character.toLowerCase(opc);
		
		numeros = sumatoria(numeros, opc);
		
		if (opc == 'a' || opc == 'd') {
		
			for(int i=0;i<numeros.length;i++) {
				
				System.out.println(numeros[i]);
				
			}
		}
		
	}


	private static int[] sumatoria(int[] numeros, char opc) {
			
		int numAux = 0;
		
		if (opc == 'a' || opc == 'd') {
		
			for (int i = 0; i < numeros.length - 1; i++) {
		        for (int j = 0; j < numeros.length - 1; j++) {
					
					if (opc == 'a') {
													
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
			
		} else {
						
			System.out.println("La opcion \"" + opc + "\" es invalida");
		}
		
		return numeros;
		
		
		
}

}