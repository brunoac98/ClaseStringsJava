package arraysStrings;

public class PruebaCodifica {
	public static void main(String[] args) throws Exception {
		
		String abcdario = "abcdefghijklmnñopqrstuvwxyz";
		String espacio = " ";
		String texto = "Texto codificado"; // Texto para codificar.
		String textoLow = ""; // String para guardar texto convertido a minusculas.
		String textoCod = ""; // String para guardar texto codificado.
		String textoDecod = ""; // String para guardar texto codificado.
		int desp = 5; // Variable de cantidad de lugares a desplazar.
		int pos  = 0; // Variable para guardar posicion de la letra en el abecedario.
		int cantLetras = 0;
		
		cantLetras = abcdario.length() - 1;
		textoLow = texto.toLowerCase();
		
		System.out.println("Texto original:     " + textoLow);
		
		for(int i=0;i<textoLow.length();i++) {		

				pos = abcdario.indexOf(textoLow.charAt(i));
				
				// Si es un espacio concateno un espacio.
				if(textoLow.charAt(i) == espacio.charAt(0)) 
				{
					
					textoCod = textoCod.substring(0, i) + " " + textoLow.substring(i + 1) ;

				} else {
					
					if((pos +  desp) > cantLetras) 
					{
						
						pos = pos - cantLetras;
						pos = pos + desp - 1 ;
						
					} else {
						
						pos = pos + desp;
					}
					
					// Concateno los caracteres desplazados y los caracteres originales hasta que finaliza el desplazamiento.
					textoCod = textoCod.substring(0, i) + abcdario.charAt(pos) + textoLow.substring(i + 1) ;
	
				}
				
		}
				
		//* Muestro texto codificado.
		System.out.println("Texto codificado:   " + textoCod);		
		

		// Parte para decodificar.				
		for(int i=0;i<textoCod.length();i++) 
		   {		
			
			pos = abcdario.indexOf(textoCod.charAt(i));
			
			if(textoLow.charAt(i) == espacio.charAt(0)) 
			{
				
				textoDecod = textoDecod.substring(0, i) + " " + textoCod.substring(i + 1) ;

			} else {
			
			
				if((pos -  desp) < 0) 
					{
				
						pos = (pos - cantLetras) * - 1 ;
				
					} else {
				
						pos = pos - desp;
						
					}
							
			textoDecod = textoDecod.substring(0, i) + abcdario.charAt(pos) + textoCod.substring(i + 1) ;

			}				
		}
				
		System.out.println("Texto decodificado: " + textoDecod);		
		
		
		}
		
	}
