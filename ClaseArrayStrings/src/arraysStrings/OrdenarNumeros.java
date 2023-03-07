package arraysStrings;

public class OrdenarNumeros {
	public static void main(String[] args) throws Exception {
		
		int numeros[] = {51,2,14};		
		int numAux = 0;
		
		for(int i=0;i<numeros.length - 1;i++) {
			
			for(int j=0;j<numeros.length - 1;j++) {
				
				if (numeros[i] > numeros[j + 1]) {
					
					numAux = numeros[i];
					numeros[i] = numeros[j + 1];
					numeros[j + 1] = numAux;								
					
				}
				
			}
			
		}
		
		for(int i=0;i<numeros.length;i++) {
					
			System.out.println("Resultado final: " + numeros[i]);	
					
		}		
		
	}
}
