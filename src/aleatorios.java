 import java.util.Random; 

 public class aleatorios {

	public static void main(String[] args) {
		Random aleatorio; 
		aleatorio = new Random(); 
		
		int numero;
		char asterisco;
		int num = 10 ;
		
		
		for (int i = 0; i < num; i++) {
			numero = (int) (aleatorio.nextDouble() * 14 + 3) ; //[3...16]
			System.out.print(numero + " ");
		} 
		
	}
	
	
	
}
