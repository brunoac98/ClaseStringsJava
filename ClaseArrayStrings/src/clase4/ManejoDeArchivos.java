package clase4;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ManejoDeArchivos {
	
	public static void main(String[] args) {
		
		String ruta = "O:\\Lectura.txt";
		
		
		try {
			for (String linea : Files.readAllLines(Paths.get(ruta), StandardCharsets.ISO_8859_1)) { //Se utiliza ISO para captar las Ñ.
				
				System.out.println(linea);
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			System.out.println("Error lectura");
			
		}
		
		try {
			Files.writeString(Paths.get(ruta), "Prueba\n",StandardOpenOption.APPEND );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error escritura");
		}
		
	}

}
