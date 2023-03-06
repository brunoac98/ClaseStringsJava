package Clase3ArrayString;

public class OrdenarNumeros {
	public static void main(String[] args) throws Exception {
		
		// Ejercicio 1. Parte "b". Ordeno de manera ascendente.
		
		int nums[] = {9,345,3,3,8,3,5};
		int aux = 0;
 		boolean ordenAsc = false; // Booleano para orden Ascendente.
		
		for(int i=0;i<nums.length - 1;i++)
			
			for(int j=0;j<nums.length - 1;j++) {
				
				if(ordenAsc) {
					if(nums[j] > nums[j+1]) {
						
						aux = nums[j];
						nums[j] = nums[j+1];
						nums[j+1] = aux;
						
					}
				} else {
					
					if(nums[j] < nums[j+1]) {
							
						aux = nums[j];
						nums[j] = nums[j+1];
						nums[j+1] = aux;
						
						}
					
				}
			}
		
		for(int i=0;i<nums.length;i++) {
			
			System.out.println(nums[i]);
			
			}
		
	}	
}
