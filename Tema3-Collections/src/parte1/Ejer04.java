package parte1;

import java.util.Random;
import java.util.TreeSet;

public class Ejer04 {

	public static void main(String[] args) {

		/*
		 * Implementa una aplicación donde se insertan 20 números enteros aleatorios
		 * distintos, menores que 100, en una colección. Hay que asegurarse de que se
		 * guardan 20. Deben guardarse ordenados a medida que se vayan generando, y se
		 * mostrará la colección resultante por pantalla
		 */

		// Clase random
		Random rand = new Random();

		// creo la coleccion
		TreeSet<Integer> listaNumeros = new TreeSet<>();

		// numeros a ingtroducir
		final int NUMEROS_A_INTRODUCIR = 20;

		// numero random
		int numRand;

		// mientras que el tamaño de la lista sea menor que 20
		while (listaNumeros.size() < NUMEROS_A_INTRODUCIR) {

			// creo un numero random
			numRand = rand.nextInt(0, 100);

			// añado el numero a la lista
			listaNumeros.add(numRand);

		}

		// muestra por pantalla
		System.out.println(listaNumeros);

	}
}
