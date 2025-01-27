package parte2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejer01 {

	public static void main(String[] args) {

		/*
		 * Implementa una aplicación que cree una lista de números enteros del 1 al 10 y
		 * luego la mezcle de forma aleatoria. Finalmente, muestra la lista original y
		 * la lista mezclada por pantalla.
		 */

		// creo la lista de los números
		ArrayList<Integer> listaNum = new ArrayList<Integer>();

		// creo otra lista para almacenar la lista ordenada para que no se pierda
		ArrayList<Integer> listaOrdenada = new ArrayList<Integer>();

		// creo la clase random
		Random rand = new Random();

		// bucle para introducir los números del 1 al 10
		for (int i = 1; i <= 10; i++) {
			// añade la i a la lista de los números la cuál (i) irá incrementando hasta 10
			listaNum.add(i);
		}

		// copio la lista original en la lista auxiliar
		listaOrdenada.addAll(listaNum);

		// desordena la lista y la almacena en la variable correspondiente
		Collections.shuffle(listaNum);

		System.out.println(listaOrdenada);
		System.out.println(listaNum);

	}

}
