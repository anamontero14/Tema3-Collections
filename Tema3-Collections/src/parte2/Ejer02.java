package parte2;

import java.util.LinkedHashSet;
import java.util.Random;

public class Ejer02 {

	public static void main(String[] args) {

		/*
		 * Implementa una aplicación que genere 10 números enteros aleatorios distintos
		 * en el rango del 1 al 20 y los guarde en una implementación que no permita que
		 * se dupliquen números en el caso de que se repitan y que garantice un orden
		 * basado en inserción. Luego, muestra los números únicos generados por pantalla
		 */

		// creo la clase random
		Random rand = new Random();

		// creo la lista donde iran los numeros
		LinkedHashSet<Integer> listaNum = new LinkedHashSet<Integer>();

		// variable donde almacenar el numero random
		int numRandom;

		// variable contador
		int cont = 1;

		// creo un bucle para generar y añadir 10 números enteros que no se repitan
		while (cont <= 10) {

			// almaceno el numero random
			numRandom = rand.nextInt(1, 21);

			// si el número no está lo añade y si no sigue
			if (!listaNum.contains(numRandom)) {

				// añado un número aleatorio desde 1 hasta 20
				listaNum.add(numRandom);

				// aumenta el contador
				cont++;
			}

		}

		// muestro los números generados por pantalla
		System.out.println(listaNum);

	}

}
