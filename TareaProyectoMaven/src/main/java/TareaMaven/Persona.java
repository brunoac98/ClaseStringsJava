package TareaMaven;

import lombok.Data;

@Data

public class Persona {
	private String nombre;
	private String apellido;
	private String fecnac;
	
	public Persona(String nombre, String apellido, String fecnac) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecnac = fecnac;
	}
	
	public Persona() {
		
	}
	
	
}
