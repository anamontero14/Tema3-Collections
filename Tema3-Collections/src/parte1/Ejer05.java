package parte1;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {

		/*
		 * Introduce por teclado, hasta que se introduzca “fin”, una serie de nombres,
		 * que se insertarán en una colección, de forma que se conserve el orden de
		 * inserción y que no puedan repetirse. Al final, la colección se mostrará por
		 * pantalla
		 */

		// creacion del scanner
		Scanner leer = new Scanner(System.in);

		// lista
		LinkedHashSet<String> listaNombres = new LinkedHashSet<String>();

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
