/* EJERCICIO 2.
Haga una main donde por parámetro envíe la ruta de un archivo. Ese archivo debe
contener números. El programa debe escribir por consola la suma de esos números
*/
package clase4;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SumaNumeros {

	public static void main(String[] args) {
		
		String ruta = ".//src//Numeros.txt";
			
		System.out.println("Resultado: " + sumador(ruta));

	}
	
	private static int sumador(String rutaRecibida) {
		
		int numeros = 0;
		
		
		try {
			
			System.out.println("Numeros leidos:");
			for(String linea : Files.readAllLines(Paths.get(rutaRecibida), StandardCharsets.ISO_8859_1)){
				
				System.out.println(linea);
				numeros = numeros + Integer.parseInt(linea);
				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error lectura");
		}
		
		
		return numeros;	
		
}

}
