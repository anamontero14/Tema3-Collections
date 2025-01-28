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
