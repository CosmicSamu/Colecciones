import java.util.ArrayList;
import java.util.Scanner;

public class Suma_y_media {

	public static void main(String[] args) {
		int numero;
		int contador = 0;
		int suma = 0;
		int media = 0;

		Scanner teclado = new Scanner(System.in);
		ArrayList<Integer> lista = new ArrayList<Integer>();

		do {
			System.out.println("Dame un numero ");
			numero = teclado.nextInt();
			if (numero != 0) {
				lista.add(numero);
				suma += numero;
				contador++;
				media = suma / contador;

			}
		} while (numero != 0);

		for (Integer I : lista) {
			if (I > media) {
				System.out.println("Mayores que la media: " + I);
			}
		}
		System.out.println("numero de valores leidos: " + contador);
		System.out.println("la suma de todos los numeros introducidos: " + suma);
		System.out.println("La media de los números: " + media);

	}

}
