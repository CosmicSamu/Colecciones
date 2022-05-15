
/*guarda estudiantes con su DNI y su nombre,de forma que el DNI sea identificativo
 * 
 * */
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio_distado_iterator {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int DNI;
		String nombre;
		int contador = 0;

		TreeMap<Integer, String> mapa = new TreeMap<>();
		do {
			System.out.println("Dime tu dni");
			DNI = (int) Integer.parseInt(teclado.nextLine()); // para que no de problemas de que salen dos a la vez
			System.out.println("Dime tu nombre");
			nombre = teclado.nextLine();

			mapa.put(DNI, nombre);
			contador++;
		} while (contador < 3);

		System.out.println("Dime el DNI que quieres sacar: "); // te saca el nombre del DNi que le introduces
		DNI = teclado.nextInt();
		if (!mapa.containsKey(DNI)) {
			System.out.println("Ese DNI no esta en la lista");
		} else {
			mapa.remove(DNI);
			Iterator<Integer> it = mapa.keySet().iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
		}

	}

}
