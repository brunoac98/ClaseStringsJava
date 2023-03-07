package arraysStrings;

public class SumaDeNumeros {
	
	public static void main(String[] args) throws Exception {
			
			int numeros[] = {3,4,7,16,35,90,1};			
			int numX = 15;
			int cont = 0;
			

			for(int i=0;i<numeros.length;i++) {
				
				if (numeros[i] > numX) {
					
					cont = cont + numeros[i];
					
				}
				
			}
			
			System.out.println("Resultado final: " + cont);
			
		}

}
