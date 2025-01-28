package parte2;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejer03 {

	public static void main(String[] args) {

		/*
		 * Implementa una aplicación que cuente la frecuencia de aparición de cada letra
		 * (solo los caracteres alfabéticos) en la siguiente cadena de texto y luego
		 * muestre el conteo por pantalla. Usa la implementación más apropiada:
		 * 
		 * "En un agujero en el suelo, vivia un hobbit. No un agujero humedo, sucio,
		 * repugnante, con restos de gusanos y olor a fango, ni tampoco un agujero,
		 * seco, desnudo y arenoso, sin nada en que sentarse o que comer: era un
		 * agujero-hobbit, y eso significa comodidad" .
		 * 
		 * Pista: se puede utilizar el método estático isLetter de la clase Character.
		 */

		// scanner
		Scanner leer = new Scanner(System.in);

		// tree map porque es voy a necesitar un espacio para la letra y para el numero
		TreeMap<Character, Integer> listaLetras = new TreeMap<Character, Integer>();

		// variable donde se almacenara la frase
		String frase;

		// contador para las letras
		int contador;

		// variable para almacenar las letras
		char letra;

		// almacenar el valor
		int val;

		// le pregunto al usuario por una frase
		System.out.print("Escriba una frase para contar cuántas veces aparecen las letras de la frase: ");
		frase = leer.nextLine().toLowerCase(); // almaceno la frase en la variable

		// hago un for para recorrer toda la frase y contar las letras
		for (int i = 0; i < frase.length(); i++) {

			// reinicio el contador
			contador = 0;

			// almaceno la letra actual
			letra = frase.charAt(i);

			// si el mapa no contiene la letra
			if (!listaLetras.containsKey(letra) && Character.isLetter(letra)) {

				contador++;

				// pone la letra junto con el contador de las letras
				listaLetras.put(letra, contador);

				// si el mapa CONTIENE la letra entonces añade al contador
			} else if (Character.isLetter(letra)) {

				// alamaceno las veces que se repite esa letra y le sumo 1 porque se ha repetido
				val = listaLetras.get(letra) + 1;

				// igualo el contador al resultado del valor
				contador = val;

				// reemplazo el contador de la letra
				listaLetras.replace(letra, contador);
			}

		}

		// muestro el recuento
		System.out.println(listaLetras);

		// cerrar el scanner
		leer.close();

	}

}
