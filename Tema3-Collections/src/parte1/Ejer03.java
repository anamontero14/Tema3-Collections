package parte1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejer03 {

	public static void main(String[] args) {

		/*
		 * Realiza un programa que genere 30 números enteros aleatorios, con valores
		 * comprendidos entre 1 y 10. Se deben almacenar en una colección de forma
		 * ordenada. Pinta la colección por consola una vez rellena
		 */

		// clase random
		Random rand = new Random();

		// lista con numeros comprendidos entre 1 y 10
		ArrayList<Integer> listaNumeros = new ArrayList<>();

		// numero maximo de numeros a crear
		final int NUMEROS_A_CREAR = 30;

		// numero aleatorio
		int num;

		// mientras que no sea el contador 30
		for (int i = 0; i < NUMEROS_A_CREAR; i++) {

			// crea un numero random entre 0 y 10
			num = rand.nextInt(0, 11);

			// lo añade a la lista
			listaNumeros.add(num);
		}

		// ordeno la lista
		Collections.sort(listaNumeros);

		// muestro la coleccion
		System.out.println(listaNumeros);

	}

}
