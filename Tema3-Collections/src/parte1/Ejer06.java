package parte1;

import java.util.Scanner;
import java.util.TreeSet;

public class Ejer06 {

	public static void main(String[] args) {

		/*
		 * Repite la actividad anterior de forma que se inserten los nombres manteniendo
		 * el orden alfabético
		 */

		// creacion del scanner
		Scanner leer = new Scanner(System.in);

		// lista
		TreeSet<String> listaNombres = new TreeSet<String>();

		// respuesta a introducir
		String dato = "";

		// introducir un nombre
		System.out.print("Introduzca un nombre: ");
		dato = leer.next();

		// mientras que la respuesta no sea fin
		while (!dato.equals("fin")) {
			// añado el dato a la lista
			listaNombres.add(dato);

			// introducir otro nombre
			System.out.print("Introduzca un nombre: ");
			dato = leer.next();
		}

		System.out.println(listaNombres);

		// cerrar el scanenr
		leer.close();

	}

}
