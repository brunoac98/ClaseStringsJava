package arraysStrings;

public class ContadorCaracteres {
	public static void main(String[] args) throws Exception {
		
		String texto = "Texto de prueba";
		char letraEj = 'e';
		int cont = 0;
		
		texto = texto.toLowerCase();		
		
		for(int i=0;i<texto.length();i++) {
			
			if (texto.charAt(i) == letraEj) {
				
				cont = cont+ 1;
				
			}
			
		}
		
		System.out.println("La letra \"" + letraEj + "\" se repite " + cont + " veces.");
		
	}
}
