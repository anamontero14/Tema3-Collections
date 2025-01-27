package parte1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {

		/*
		 * Crear una lista de números enteros positivos introducidos por consola hasta
		 * que se introduzca uno negativo. A continuación, recorrer la lista y mostrar
		 * por pantalla los índices de los elementos de valor par.
		 */

		// scaner
		Scanner leer = new Scanner(System.in);

		// numero
		int num;

		// lista de numeros enteros
		ArrayList<Integer> listaNumEnteros = new ArrayList<>();

		// preguntar
		System.out.print("Introduce un número entero: ");
		num = leer.nextInt();

		// mientras que el numero sea mayor o igual a 0
		while (num >= 0) {
			// añadir el numero
			listaNumEnteros.add(num);

			// preguntar
			System.out.print("Introduce un número entero: ");
			num = leer.nextInt();
		}

		System.out.print("Índices con números pares: ");

		// recorrer lista hasta el final
		for (int i = 0; i < listaNumEnteros.size(); i++) {

			// si el nº que coge es par
			if (listaNumEnteros.get(i) % 2 == 0) {
				System.out.print(i + ", ");
			}

		}

		leer.close();

	}

}
