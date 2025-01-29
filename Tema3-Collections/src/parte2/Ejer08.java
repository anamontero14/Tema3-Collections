package parte2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Ejer08 {

	// creacion scanner
	static Scanner leer = new Scanner(System.in);

	// creacion del mapa
	static HashMap<String, HashSet<String>> listaTareas = new HashMap<String, HashSet<String>>();

	public static void main(String[] args) {

		/*
		 * Lista de tareas: Implementa una aplicación que permita a los usuarios
		 * gestionar una lista de tareas. Las tareas deben estar agrupadas por
		 * categorías (por ejemplo, trabajo, personal). Usa un mapa donde la clave sea
		 * la categoría y el valor sea una lista de tareas. Debe permitir añadir,
		 * eliminar y listar tareas por categoría.
		 */

		// variable para almacenar la opcion del menu
		int opcion;

		// variable para almacenar la categoria
		String categoria;

		// variable para almacenar la tarea
		String tarea;

		// llamo a la funcion y almaceno la opcion en la variable
		opcion = menu();

		// mientras que la opcion no sea ni menor que 1 ni mayor que 6
		while (opcion > 0 && opcion < 6) {

			switch (opcion) {

			// Añadir una categoría
			case 1 -> {
				// limpiar buffer
				leer.nextLine();
				System.out.print("Introduzca la categoría a introducir: ");
				categoria = leer.nextLine();

				// si el mapa ya tiene esa categoria
				if (listaTareas.containsKey(categoria)) {
					System.err.println("   Esa categoría ya se encuentra en la lista");
				} else {
					// añado la categoria y creo su lista
					listaTareas.put(categoria, new HashSet<>());
					System.out.println("   Categoría añadida correctamente");
				}

			}
			// Añadir una tarea
			case 2 -> {
				// limpiar buffer
				leer.nextLine();
				System.out.print("Introduzca la categoría donde quiere añadir una tarea: ");
				categoria = leer.nextLine();

				System.out.print("Introduzca la tarea que quiere añadir: ");
				tarea = leer.nextLine();

				// si el mapa ya tiene esa categoria
				if (listaTareas.get(categoria).contains(tarea)) {
					System.err.println("   Esa tarea ya se encuentra en la categoría");
				} else {
					// añado la tarea a la categoria
					listaTareas.get(categoria).add(tarea);
					System.out.println("   Tarea añadida correctamente");
				}
			}
			// Eliminar categoría
			case 3 -> {
				// limpiar buffer
				leer.nextLine();
				System.out.print("Introduzca la categoría a eliminar: ");
				categoria = leer.nextLine();

				// si el mapa ya tiene esa categoria
				if (listaTareas.containsKey(categoria)) {
					// elimina la categoria
					listaTareas.remove(categoria);
					System.out.println("   Categoría eliminada correctamente");
				} else {
					System.err.println("   Esa categoría no se encuentra en la lista");
				}
			}
			// Eliminar tarea
			case 4 -> {

				// limpiar buffer
				leer.nextLine();
				System.out.print("Introduzca la categoría de la que quiere eliminar una tarea: ");
				categoria = leer.nextLine();

				System.out.print("Introduzca la tarea a eliminar: ");
				tarea = leer.nextLine();

				// si el mapa ya tiene esa categoria
				if (listaTareas.get(categoria).contains(tarea)) {
					// elimina la tarea de la categoria
					listaTareas.get(categoria).remove(tarea);
					System.out.println("   Tarea eliminada correctamente");
				} else {
					System.err.println("   No se ha podidio eliminar la tarea");
				}

			}
			// Listar tareas
			case 5 -> {
				// limpiar buffer
				leer.nextLine();
				System.out.print("Introduzca la categoría de la que quiere mostrar las tareas: ");
				categoria = leer.nextLine();

				// si el mapa ya tiene esa categoria
				if (listaTareas.containsKey(categoria)) {
					System.out.println(listaTareas.get(categoria));
				} else {
					System.err.println("   No se pudo mostrar la lista de tareas de esa categoría");
				}
			}

			}

			// llamo a la funcion y almaceno la opcion en la variable
			opcion = menu();

		}

		System.out.println("Fin del programa");

	}

	// funcion para el menu
	static int menu() {

		// variable para alacenar la opcion
		int opcion;

		System.out.println("ELIGE UNA OPCIÓN");
		System.out.println(
				"\n 1) Añadir una categoría. \n 2) Añadir una tarea. \n 3) Eliminar categoría. \n 4) Eliminar tarea. \n 5) Listar tareas. \n 6) Salir");

		System.out.println();
		System.out.print("Opción: ");
		// recoge la opcion
		opcion = leer.nextInt();

		// devuelve la opcion
		return opcion;

	}

}
