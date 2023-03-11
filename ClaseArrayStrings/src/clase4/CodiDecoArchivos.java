/* EJERCICIO 3.
Tome el ejercicio B de la clase 3 y que por parámetro se pueda elegir si es una
codificación o decodificación, el valor del desplazo, y 2 archivos, uno para la entrada y
otro para la salida. Que por pantalla solo indique si terminó o no correctamente, los
resultados deben estar en el archivo de salida
*/
package clase4;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CodiDecoArchivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String entrada = ".//src//Entrada.txt";
		String salida = ".//src//Salida.txt";
		
		char opc = 'd'; // d = decodifica. c = codifica.
		int desp = 2;  // desplazamiento.
				
		opc = Character.toLowerCase(opc);
		
		codiDeco(entrada, salida, opc, desp);

	}
	
	private static String codiDeco(String rutaEntrada, String rutaSalida, char opcEle, int despEle) {
		
		String abcdario = "abcdefghijklmnñopqrstuvwxyz";
		String espacio = " ";
		String textoLow = ""; // String para guardar texto convertido a minusculas.
		String textoCod = ""; // String para guardar texto codificado.
		String textoDecod = ""; // String para guardar texto codificado.
		String textoFinal = "";
		
		int pos  = 0; // Variable para guardar posicion de la letra en el abecedario.
		int cantLetras = 0;
		
		boolean lecturaOK = false;
		
		if  (opcEle == 'c' || opcEle == 'd') { // Si la opción es valida sigo.
			try {
				
				for(String linea : Files.readAllLines(Paths.get(rutaEntrada), StandardCharsets.ISO_8859_1)){
					
					textoLow = linea;
					lecturaOK = true;
					
				}			
				
			} catch (IOException e) {

				System.out.println("Error lectura");
			}
			
			if (lecturaOK) { // Si la lectura esta OK sigo.
									
				if (opcEle == 'c') {
			
					cantLetras = abcdario.length() - 1;
					textoLow = textoLow.toLowerCase();
					
					for(int i=0;i<textoLow.length();i++) {		
			
							pos = abcdario.indexOf(textoLow.charAt(i));
							
							// Si es un espacio concateno un espacio.
							if(textoLow.charAt(i) == espacio.charAt(0)) 
							{
								
								textoCod = textoCod.substring(0, i) + " " + textoLow.substring(i + 1) ;
			
							} else {
								
								if((pos +  despEle) > cantLetras) 
								{
									
									pos = pos - cantLetras;
									pos = pos + despEle - 1 ;
									
								} else {
									
									pos = pos + despEle;
								}
								
								// Concateno los caracteres desplazados y los caracteres originales hasta que finaliza el desplazamiento.
								textoCod = textoCod.substring(0, i) + abcdario.charAt(pos) + textoLow.substring(i + 1) ;
				
							}
							
					}
												
					textoFinal = textoCod;
					
					//* Guardo texto codificado.
					try {
						
						Files.writeString(Paths.get(rutaSalida ), textoFinal);		
						System.out.println("Texto codificado guardado con exito.");	
						
					} catch (IOException e) {

						System.out.println("Error al escribir texto codificado.");	
					}			
				}
				
				if (opcEle == 'd') {	
					// Parte para decodificar.	
					
					cantLetras = abcdario.length() - 1;
					textoLow = textoLow.toLowerCase();
					
					for(int i=0;i<textoLow.length();i++) 
					   {		
						
						pos = abcdario.indexOf(textoLow.charAt(i));
						
						if(textoLow.charAt(i) == espacio.charAt(0)) 
						{
							
							textoDecod = textoDecod.substring(0, i) + " " + textoLow.substring(i + 1) ;
			
						} else {
						
							// Controlo si es menor a 0 para no salirme del array.
							if((pos -  despEle) < 0) 
								{
								
									// Sumo 1 para que tome la letra correspondiente
								    pos = (pos - despEle + 1);
								    pos = cantLetras  -  (pos * -1);
							
								} else {
							
									pos = pos - despEle;
									
								}
										
						textoDecod = textoDecod.substring(0, i) + abcdario.charAt(pos) + textoLow.substring(i + 1) ;
			
						}				
					}
					
					textoFinal = textoDecod;
					
					//* Guardo texto decodificado.
					try {
						
						Files.writeString(Paths.get(rutaSalida), textoFinal);		
						System.out.println("Texto decodificado guardado con exito.");	
						
					} catch (IOException e) {

						System.out.println("Error al escribir texto decodificado.");	
					}				
			
				}
		
			}
		} else {
			textoFinal = "Opcion incorrecta";
		};
		
		return textoFinal;

}
	
	
}
