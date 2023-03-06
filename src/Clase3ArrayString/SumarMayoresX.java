package Clase3ArrayString;

public class SumarMayoresX {
	public static void main(String[] args) throws Exception {
		
		// Ejercicio 1. Parte "c".
		 
		int numsC[] = {9,345,3,6,9,1};
		int numMayor = 3;
		
		for(int i=0;i<numsC.length;i++) {
			
			if(numsC[i]>numMayor) {
				numMayor = numMayor + numsC[i]; 
			
			}
		
		}
		
		System.out.println("Ejercicio 3\nResultado de la suma: " + numMayor + "\n---");
		
	}	
}
