package TareaMaven;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String nombre = "";
		Scanner	scn = new Scanner(System.in);
		
		List<Persona> PersonasColec = new ArrayList<Persona>();
		
		System.out.println("Ingrese nombre:");
		nombre = scn.nextLine();
		
		while(!nombre.equals("0") && !nombre.equals("1")) {
			
			Persona persona = new Persona();			
			System.out.println("Ingrese apellido:");
			persona.setApellido(scn.nextLine());
			System.out.println("Ingrese fecha de nacimiento:");
			persona.setFecnac(scn.nextLine());
			persona.setNombre(nombre);
			PersonasColec.add(persona);
			
			System.out.println("Ingrese el nombre de la siguiente persona, 0 para salir o 1 para salir y listar las personas.");
			nombre = scn.nextLine();
		}
		
		if(nombre.equals("1")) {
			for(Persona persona : PersonasColec) {
				System.out.println("Nombre " + persona.getNombre() + " Apellido: " + persona.getApellido() + " Fecha de nacimiento : " + persona.getFecnac());
			}
		}
	}

}
