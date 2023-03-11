package clase4;

public class Funciones {

	private static int sumatoria(int[] numeros) {
			
			int resultado = 0;
			for (int i=0;i<numeros.length;i++) {
				
				resultado = resultado + numeros[i];
			}
			
			return resultado;
			
	
	}
	
	public static void main(String[] args) {
		
		int numeros[] = new int[] {3,5,6,7,8};	
		
		System.out.println(sumatoria(numeros));
		
	}
	
	
}
