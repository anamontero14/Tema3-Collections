package parte1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejer02 {

	public static void main(String[] args) {

		/*
		 * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
		 * ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de
		 * esos números. El tamaño de la lista también será aleatorio y podrá oscilar
		 * entre 5 y 10 elementos ambos inclusive
		 */

		// clase random
		Random rand = new Random();

		// creacion array list
		ArrayList<Integer> listaNumeros = new ArrayList<>();

		// variable para almacenar la suma
		int suma = 0;

		// variable para almacenar la media
		int media = 0;

		// variable para almacenar el maximo
		int maximo = Integer.MIN_VALUE;

		// variable para almacenar el minimo
		int minimo = Integer.MAX_VALUE;

		// tamaño aleatorio de la lista
		int tamañoLista;

		// valor aleatorio
		int numAleatorio;

		// le asigno un tamaño aleatorio a la lista
		tamañoLista = rand.nextInt(5, 11);

		// for para llenar la lista
		for (int i = 0; i < tamañoLista; i++) {

			// le asigno un numero aleatorio entre 0 y 100
			numAleatorio = rand.nextInt(0, 101);

			// le añado el numero
			listaNumeros.add(numAleatorio);

			// le voy sumando todos los numeros
			suma += numAleatorio;

		}

		// hayar el maximo
		maximo = Collections.max(listaNumeros);

		// hayar el minimo
		minimo = Collections.min(listaNumeros);

		// hago la media
		media = suma / listaNumeros.size();

		// muestro todas las variables
		System.out.println("\n Suma: " + suma + "\n Media: " + media + "\n Máximo: " + maximo + "\n Mínimo: " + minimo);

	}
}
