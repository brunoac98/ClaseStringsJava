package Clase3ArrayString;

public class ContarApariciones {
	public static void main(String[] args) throws Exception {
		
		// Ejercicio 1. Parte "a".
		String texto = "Hola como estas?";
		char letra = 'a';
		int cont = 0;
		
		
		for(int i=0;i<texto.length();i++) {
			if (texto.charAt(i) == letra) {
				cont = cont + 1;
			}				
		}
		
		System.out.println("Ejercicio 1\nLa letra \"" + letra + "\" aparecio " + cont + " veces.\n---");	
		
	}	
}
