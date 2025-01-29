package parte2;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeMap;

public class Ejer07 {

	public static void main(String[] args) {

		/*
		 * Clasificación de palabras: Creao un mapa cuya clave sea un número y su valor
		 * sea un conjunto de palabras, de forma que se clasifiquen las palabras por su
		 * longitud, es decir, en el conjunto con clave 3 se almacenarán palabras de
		 * longitud 3, en el conjunto de clave 4 se almacenarán palabras de longitud 4,
		 * y así sucesivamente.
		 */

		// mapa
		TreeMap<Integer, LinkedHashSet<String>> listaLongitudPalabras = new TreeMap<Integer, LinkedHashSet<String>>();

		// scanner
		Scanner leer = new Scanner(System.in);

		// variable para introducir la palabra
		String palabra;

		// variable para saber si se quiere salir o no
		String salir;

		System.out.print("¿Quiere introducir una palabra?: ");
		salir = leer.next();

		// seguirá preguntando hasta que el usuario se quiera salir
		while (!salir.equalsIgnoreCase("no")) {

			System.out.print("Introduzca una palabra: ");
			palabra = leer.next();

			// si la lista ya contiene la clave de la longitud de la palabra
			if (listaLongitudPalabras.containsKey(palabra.length())) {
				// añadirá la nueva palabra al mapa
				listaLongitudPalabras.get(palabra.length()).add(palabra);
			} else {
				/*
				 * si no se encuentra la clave en el mapa añadirá una nueva clave con la palabra
				 * como valor
				 */
				listaLongitudPalabras.put(palabra.length(), new LinkedHashSet<>());
				listaLongitudPalabras.get(palabra.length()).add(palabra);

			}

			System.out.print("¿Quiere introducir una palabra?: ");
			salir = leer.next();

		}

		// muestra el mapa
		System.out.println(listaLongitudPalabras);

		// cerrar el scanner
		leer.close();

	}

}
