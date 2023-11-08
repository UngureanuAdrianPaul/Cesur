import java.util.Random;

public class aleatorio3 {

	public static void main(String[] args) {
		Random aleatorio;
		aleatorio = new Random();
		//int filas = (int) (aleatorio.nextDouble() * 10 + 1);

		int filas = 4;

		for (int i = 0; i <= filas; i++) {

			for (int j = filas-i; j>0; j--) {

				System.out.print(" ");

			}

			for (int k= (i*2); k>0; k--) {

				System.out.print("*");
			}

			System.out.println("*");

		}

	}

}
