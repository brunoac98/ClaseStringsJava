/* EJERCICIO 2.
Haga una main donde por parámetro envíe la ruta de un archivo. Ese archivo debe
contener números. El programa debe escribir por consola la suma de esos números.
PARTE A- Al programa anterior agreguele un parámetro para que la operación pueda ser
suma o multiplicación.
*/
package clase4;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SumaNumerosParteA {

	public static void main(String[] args) {
		
		String ruta = ".//src//Numeros.txt";
		char opc = 'D'; // s = suma. x = multiplica.
		
		opc = Character.toLowerCase(opc);
		
		System.out.println("Resultado: " + sumador(ruta, opc));

	}
	
	private static int sumador(String rutaRecibida, char opcElegida) {
		
		int numeros = 0;
		
		if (opcElegida == 'x') {
			numeros = 1;
		}
				
		try {
			
			System.out.println("Numeros leidos:");
			for(String linea : Files.readAllLines(Paths.get(rutaRecibida), StandardCharsets.ISO_8859_1)){
				
				System.out.println(linea);
				
				if (opcElegida == 's') {
					numeros = numeros + Integer.parseInt(linea);
				} else if (opcElegida == 'x') {
					numeros = numeros * Integer.parseInt(linea);
				} else {
					System.out.println("Opcion incorrecta.");
					break;
				}
				
				
			}			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error lectura");
		}
				
		return numeros;	
		
}

}
