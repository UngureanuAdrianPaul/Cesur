//import java.util.Random;

public class aleatorio2 {

	public static void main(String[] args) {
		//Random aleatorio;												//Esta vaina es para hacer numeros aleatorios hasta el 10				
		//aleatorio = new Random();								
		//int filas = (int) (aleatorio.nextDouble() * 10 + 1);

		int filas = 10;
	
		for (int i = 0; i < filas; i++) {

			for (int j = 0; j < filas - i - 1; j++) {

				System.out.print(" ");

			}

			for (int k = 0; k <= (i * 2) - 1; k++) {

				System.out.print("*");
			}

			System.out.println("*");

		}
		for (int l = 0; l < filas-1; l++) {



			for (int m = filas-1; m < filas+l ; m++) {

				System.out.print(" ");
			}
			for (int n = 0; n < filas-l*2+(filas-4) ; n++) {

				System.out.print("*");

			}
			System.out.println("*");

		}
	}

}
