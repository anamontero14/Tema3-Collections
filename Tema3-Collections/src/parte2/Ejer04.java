package parte2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Ejer04 {

	// creacion de la lista
	static LinkedList<String> listaNombres = new LinkedList<String>();

	// inicializacion del scanner
	static Scanner leer = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Realiza un programa que cree una lista de nombres de personas vacía. A
		 * continuación, mostrará el siguiente menú. Atendiendo a la opción seleccionada
		 * por el usuario el programa debe realizar la operación concreta:
		 * 
		 * Añadir nuevo nombre a la lista.
		 * 
		 * Elimina un nombre específico.
		 * 
		 * Ordena la lista alfabéticamente.
		 * 
		 * Busca si un nombre específico está en la lista.
		 * 
		 * Salir.
		 */

		// variable para almacenar la opcion del menu
		int opcionMenu;

		// variable para almacenar la palabra
		String nombre;

		// almaceno la opcion en la variable
		opcionMenu = menu();

		// mientras que la opcion no sea salir
		while (opcionMenu != 5) {

			// mientras que la opcion del menu no sea 0
			switch (opcionMenu) {

			// en caso de que sea 1
			case 1 -> {

				// limpio el buffer
				leer.nextLine();

				System.out.print("Introduzca un nuevo nombre en la lista: ");
				nombre = leer.nextLine(); // almaceno el nuevo nombre a introducir

				// si el nombre está en la lista
				if (listaNombres.contains(nombre)) {
					// lo informa
					System.err.println("El nombre ya se encuentra en la lista");

					// si no está
				} else {
					// añado el nombre
					listaNombres.add(nombre);
					System.out.println();
					System.out.println("   Nombre añadido correctamente");
				}

				System.out.println();
			}

			// si coge 2 para eliminar un nombre
			case 2 -> {

				// limpiar el buffer
				leer.nextLine();

				System.out.println();
				System.out.print("Introduzca el nombre que quiere eliminar: ");
				nombre = leer.nextLine(); // almaceno el nuevo nombre a introducir

				// si el nombre está en la lista
				if (listaNombres.contains(nombre)) {

					// añado el nombre
					listaNombres.remove(nombre);

					System.out.println();
					System.out.println("   Nombre eliminado correctamente");

				} else {
					// lo informa
					System.err.println("El nombre no está en la lista");
				}

				System.out.println();

			}

			// si coge 3 para ordenar la lista
			case 3 -> {

				// ordeno la lista
				Collections.sort(listaNombres);

				System.out.println();
				System.out.println("Lista ordenada correctamente");
				System.out.println(listaNombres);
				System.out.println();

			}

			// si coge 4 para buscar si el nombre está en la lista
			case 4 -> {

				// limpiar el buffer
				leer.nextLine();

				System.out.println();
				System.out.print("Introduzca el nombre a buscar: ");
				nombre = leer.nextLine();

				// si el nombre está en la lista
				if (listaNombres.contains(nombre)) {
					// lo informa
					System.out.println("El nombre " + nombre + " está en la lista.");

					// si no está
				} else {
					// lo informa
					System.out.println("El nombre " + nombre + " no está en la lista.");
				}

				System.out.println();

			}

			}

			// almaceno la opcion en la variable
			opcionMenu = menu();
		}

		System.out.println("Fin del programa.");

	}

	// funcion para el menu
	static int menu() {

		// variable para alacenar la opcion
		int opcion;

		System.out.println("ELIGE UNA OPCIÓN");
		System.out.println(
				"\n 1) Añadir nuevo nombre a la lista. \n 2) Elimina un nombre específico. \n 3) Ordena la lista alfabéticamente. \n 4) Busca si un nombre específico está en la lista. \n 5) Salir.");

		// recoge la opcion
		opcion = leer.nextInt();

		// devuelve la opcion
		return opcion;

	}

}
