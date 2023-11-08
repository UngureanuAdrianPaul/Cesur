
public class rombos {

	public static void main(String[] args) {
		//Random aleatorio;												//Esta vaina es para hacer numeros aleatorios hasta el 10				
		//aleatorio = new Random();								
		//int filas = (int) (aleatorio.nextDouble() * 10 + 1);

		int filas = 5;
	
		for (int i = 0; i < filas; i++) {

			for (int j = 0; j < filas - i - 1; j++) {

				System.out.print(" ");
			}

			for (int k = 0; k < i; k++) {

				System.out.print("*");
			}
			for (int l = 0; l < i; l++) {

				System.out.print("*");
			}
			System.out.println("*");

		}

		for (int i = 0; i < filas-1; i++) {

			for (int j = 0; j < i+1; j++) {

				System.out.print(" ");
			}

			for (int k = 0; k < filas-i-2; k++) {

				System.out.print("*");
			}
			for (int l = 0; l < filas-i-2; l++) {

				System.out.print("*");
			}
			System.out.println("*");

		}

		}
	

}


