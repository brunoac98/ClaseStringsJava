package Clase3ArrayString;

public class EjercicioString {
	public static void main(String[] args) throws Exception {
		
		String texto1 = "Hola mundo";
		String textoSplit = "Hola mundo 2";
		
		System.out.println(texto1);
		System.out.println(texto1.length());
		texto1 = texto1.toUpperCase();
		System.out.println(texto1);
		
		//Split divide un String y lo convierte en Array:
		String [] textoSpliteado = textoSplit.split(" "); // Corta textoSplit en cada ESPACIO
		System.out.println(textoSpliteado[0]);  // Deberia mostrar "Hola"
		
		String textoSalto = "Hola mundo 3\n Hola mundo 4"; // Forma de hacer salto de linea ya que java no permite String multilinea.
		System.out.println(textoSalto);
		
		String textoComillas = "Hola \"mundo\" 3"; // Forma de mostrar un texto entre comillas en un String
		System.out.println(textoComillas);
		
		String textoTabulado = "Bruno\tEdad: 24\tProgramador\n"; // Forma de mostrar un texto tabulado
		System.out.println(textoTabulado);
		
		String[] separado = "3_tristes tigres_del_13".split("_");
		System.out.println(separado[1]);
				
		
		
	}
}
