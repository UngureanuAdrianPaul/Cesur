import java.util.Scanner;

public class abecedario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner escaner;
		escaner = new Scanner(System.in);
			
		String cadena = escaner.nextLine();
		
		for (int i= cadena.length()-1; i>=0 ; i--) {
			
			System.out.print(cadena.charAt(i));
			
		}
				
		cadena.toUpperCase(System.out.printf(cadena));
		
	
		
		
		
		escaner.close();	
	}
}
