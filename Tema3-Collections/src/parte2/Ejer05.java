package parte2;

import java.util.HashMap;
import java.util.Scanner;

public class Ejer05 {

	// mapa
	static HashMap<String, Integer> listaSeries = new HashMap<String, Integer>();

	// crear el scanner
	static Scanner leer = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Implementa una aplicación de gestión de series de TV que permita al usuario
		 * realizar las siguientes operaciones:
		 * 
		 * Agregar serie: El usuario ingresa el nombre de la serie y su valoración, y se
		 * agrega al sistema.
		 * 
		 * Buscar serie: El usuario ingresa el nombre de la serie que desea buscar, y el
		 * sistema muestra su valoración si existe.
		 * 
		 * Eliminar serie: El usuario ingresa el nombre de la serie que desea eliminar,
		 * y el sistema la elimina de la lista de series.
		 * 
		 * Salir: Termina la ejecución del programa.
		 */

		// variable para almacenar la opcion del menu
		int opcion;

		// variable para almacenar el nombre de la serie
		String serie;

		// variable para almacenar la valoracion
		int valoracion;

		System.out.println("VALORAR SERIES");
		System.out.println();

		// llamo al menú y almaceno la opción
		opcion = menu();

		// mientras que la opcion no sea 4
		while (opcion != 4) {

			switch (opcion) {

			// agregar serie y valoracion
			case 1 -> {

				// limpiar el buffer
				leer.nextLine();

				System.out.print("Introduzca el nombre de la serie que se ha visto: ");
				serie = leer.nextLine();

				System.out.println();
				System.out.print("Introduzca la valoración de la serie sobre 10: ");
				valoracion = leer.nextInt();

				// añado la serie y la valoración
				listaSeries.put(serie, valoracion);
			}

			case 2 -> {

				// limpiar el buffer
				leer.nextLine();

				System.out.print("Introduzca el nombre de la serie a buscar: ");
				serie = leer.nextLine();

				// si al coger la clave no es igual a null significa que está
				if (listaSeries.get(serie) != null) {
					System.out.println();
					// la busca y la muestra
					System.out.println("   La serie se encuentra en la lista");

				} else {
					System.out.println();
					// si no está manda un error
					System.err.println("   La serie no se encuentra en la lista");
				}
			}

			case 3 -> {

				// limpiar el buffer
				leer.nextLine();

				System.out.print("Introduzca el nombre de la serie a buscar: ");
				serie = leer.nextLine();

				// si al coger la clave no es igual a null significa que está
				if (listaSeries.get(serie) != null) {
					// elimina el par de claves
					listaSeries.remove(serie);

					System.out.println();
					System.out.println("   La serie se ha eliminado correctamente");

				} else {
					System.out.println();
					// si no está manda un error
					System.err.println("   La serie no se encuentra en la lista y por lo tanto no se pudo eliminar");
				}

			}

			}

			// llamo al menú y almaceno la opción
			opcion = menu();
		}

		System.out.println("Fin del programa");

		// cierro el scanner
		leer.close();

	}

	// funcion para el menu
	static int menu() {

		// variable para alacenar la opcion
		int opcion;

		System.out.println("ELIGE UNA OPCIÓN");
		System.out.println("\n 1) Agregar serie. \n 2) Buscar serie. \n 3) Eliminar serie. \n 4) Salir.");

		// recoge la opcion
		opcion = leer.nextInt();

		// devuelve la opcion
		return opcion;

	}

}
