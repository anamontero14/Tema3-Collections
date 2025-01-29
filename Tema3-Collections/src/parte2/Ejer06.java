package parte2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejer06 {

	static Scanner leer = new Scanner(System.in);

	static HashMap<String, Set<String>> listaTelefonos = new HashMap<String, Set<String>>();

	public static void main(String[] args) {

		/*
		 * Libreta de direcciones. Crea una aplicación que relacione nombres de personas
		 * con sus números de teléfono. Hoy en día no es raro que una misma persona
		 * tenga varios númeos de teléfono: el de su casa, el móvil, el de la oficina,
		 * etc. Para ello, cada persona tendrá una lista de teléfonos. Crea un menú con
		 * las siguientes opciones que permita al usuario realizar las siguientes
		 * acciones:
		 * 
		 * Añadir persona.
		 * 
		 * Añadir teléfono a una persona dada.
		 * 
		 * Mostrar los teléfonos de una persona.
		 * 
		 * Eliminar teléfono de una persona.
		 * 
		 * Eliminar una persona.
		 */

		// variable para almacenar la opcion del menu
		int opcion;

		// variable para almacenar la persona
		String persona;

		// variable para almacenar el numero
		String numero;

		// llamo a la funcion y almaceno lo que devuelve
		opcion = menu();

		// mientras que la opcion sea menor que 6 pero mayor que 0
		while (opcion < 6 && opcion > 0) {

			switch (opcion) {

			// añadir persona
			case 1 -> {
				// limpiar buffer
				leer.nextLine();
				System.out.println();

				System.out.print("Añada una persona: ");
				persona = leer.nextLine();

				// añado a la persona y creo una lista nueva
				listaTelefonos.put(persona, new HashSet<>());

				System.out.println();

			}
			// añadir telefono de persona
			case 2 -> {
				// limpiar buffer
				leer.nextLine();
				System.out.println();

				System.out.print("Especifique la persona a la que le quiere añadir un teléfono: ");
				persona = leer.nextLine();

				System.out.print("Introduzca el teléfono: ");
				numero = leer.nextLine();

				// añado el telefono a la persona
				listaTelefonos.get(persona).add(numero);

				System.out.println();
			}

			// mostrar telefono de persona
			case 3 -> {
				// limpiar buffer
				leer.nextLine();
				System.out.println();

				System.out.print("Especifique la persona de la que quiere ver los teléfonos: ");
				persona = leer.nextLine();

				// si persona existe
				if (listaTelefonos.get(persona) != null) {
					System.out.println(listaTelefonos.get(persona));
				} else {
					System.err.println("La persona no existe");
				}

				System.out.println();
			}
			// eliminar telefono de persona
			case 4 -> {
				// limpiar buffer
				leer.nextLine();
				System.out.println();

				System.out.print("Especifique la persona de la que quiere eliminar un teléfono: ");
				persona = leer.nextLine();

				System.out.print("Especifique teléfono a eliminar: ");
				numero = leer.nextLine();

				// si devuelve true
				if (listaTelefonos.get(persona).remove(numero)) {
					System.out.println("Se ha eliminado correctamente");
				} else {
					System.err.println("No se ha podido eliminar");
				}

				System.out.println();
			}
			// eliminar persona
			case 5 -> {
				// limpiar buffer
				leer.nextLine();
				System.out.println();

				System.out.print("Especifique la persona a eliminar: ");
				persona = leer.nextLine();

				if (listaTelefonos.remove(persona) != null) {
					System.out.println("Se ha eliminado correctamente");
				} else {
					System.err.println("No se ha podido eliminar");
				}

				System.out.println();
			}

			}

			// llamo a la funcion y almaceno lo que devuelve
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
		System.out.println(
				"\n 1) Añadir persona. \n 2) Añadir teléfono a una persona dada. \n 3) Mostrar los teléfonos de una persona. \n 4) Eliminar teléfono de una persona. \n 5) Eliminar una persona \n 6) Salir");

		System.out.println();
		System.out.print("Opción: ");
		// recoge la opcion
		opcion = leer.nextInt();

		// devuelve la opcion
		return opcion;
	}

}
