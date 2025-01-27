package parte1;

import java.util.HashMap;
import java.util.Scanner;

public class Ejer08 {

	// creacion del scanner
	static Scanner leer = new Scanner(System.in);

	// creacion de la lista
	static HashMap<String, String> listaDeRegistro = new HashMap<String, String>();

	public static void main(String[] args) {

		/*
		 * Implementa el control de acceso al área restringida de un programa. Los
		 * nombres de usuario con sus correspondientes contraseñas deben estar
		 * almacenados en una estructura de la clase HashMap. El programa mostrará un
		 * menú con dos opciones:
		 * 
		 * Registro. Debe pedir un nombre de usuario y una contraseña. A continuación,
		 * se almacenarán en el mapa.
		 * 
		 * Login. Debe pedir un nombre de usuario y una contraseña. Si el usuario
		 * introduce los datos correctamente, el programa dirá “Ha accedido al área
		 * restringida”. El usuario tendrá un máximo de 3 oportunidades. Si se agotan
		 * las oportunidades el programa dirá “Lo siento, no tiene acceso al área
		 * restringida”.
		 * 
		 * Salir. Termina el programa.
		 */

		// variable para almacenar la opcion del menu
		int opcion;

		// vairable para salir
		boolean salir = false;

		// mientras que la opcion de salir sea false
		do {
			// almacena la opcion del menu en la variable
			opcion = menu();

			switch (opcion) {
			// en caso que el usuario quiera introducir un usuario y contraseña
			case 1 -> {
				registrarUsuario();
			}

			// en caso que quiera iniciar sesion
			case 2 -> {
				// si es true entonces accedera
				if (iniciarSesion()) {
					System.out.println("Ha accedido al área restringida");
					// si no es true no accedera
				} else {
					System.out.println("Lo siento, no tiene acceso al área restringida");
				}
			}
			}
		} while (opcion != 3);

		// sale
		System.out.println("Saliendo ...");
		System.out.println("Has salido del programa.");

		// cerrar el scanner
		leer.close();

	}

	// funcion para menu
	static int menu() {

		// almacenar la opcion
		int opcion;

		System.out.println();
		System.out.println();
		// opciones
		System.out.println(
				"Selecciona una opción: \n 1) Registro. Ingresa un nombre de usuario y una contraseña \n 2) Iniciar sesión. \n 3) Salir");

		System.out.print("Opción: ");
		// introducir la opcion
		opcion = leer.nextInt();

		return opcion;

	}

	// funcion para añadir pares al registro
	static void registrarUsuario() {

		// variable para almacenar el usuario
		String usuario;

		// variable para almacenar la contraseña
		String contraseña;

		leer.nextLine();

		System.out.print("Inserta usuario: ");
		usuario = leer.next();

		System.out.print("Inserta su correspondiente contraseña: ");
		contraseña = leer.next();

		// añado el par de palabras al diccionario
		listaDeRegistro.put(usuario, contraseña);

	}

	// funcion para comprobar si esta en el mapa
	static boolean iniciarSesion() {

		// variable para recoger el intento del usuario
		String intentoUsuario = "";

		// variable para recoger el intento de la contraseña
		String intentoContraseña = "";

		// variable para determinar si esta o no, por defecto no estara
		boolean estaONO = false;

		System.out.println();
		System.out.print("Introduce un nombre de usuario para iniciar sesión: ");
		intentoUsuario = leer.next();

		System.out.println();
		System.out.print("Introduce una contraseña para iniciar sesión: ");
		intentoUsuario = leer.next();

		// si el mapa contiene la clave y el valor entonces devuelve true y si no pues
		// false
		if (listaDeRegistro.containsValue(intentoContraseña) && listaDeRegistro.containsKey(intentoUsuario)) {
			estaONO = true;
		}

		return estaONO;
	}
}
