package mf0227.uf2404.actividad2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Realizar un programa que nos cree una lista de coches, para ello deberá
 * almacenarse dentro de esta lista los objetos de tipo coche que crearemos.<br>
 * Para rellenar la lista se creara un menú que nos solicitara introducir los
 * datos por teclado, y una vez leídos todos, se guardaran en un objeto que se
 * añadirá a la lista y nos pedirá que indiquemos si queremos introducir un
 * vehículo más o no.<br>
 * Una vez que no queramos introducir más coches, nos mostrara todo el contenido
 * en pantalla.
 * 
 * @author Julen Martin
 *
 */
public class principal {

	public static void main(String[] args) {
		// Variables
		char resp;
		ArrayList<Coche> coches = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		do {
			// Metodo para pedir datos
			rellenarDatos(sc, coches);
			System.out.println("Quieres introducir otro coche?");
			resp = sc.nextLine().charAt(0);

		} while (Character.toUpperCase(resp) == 'S');
		// Metodo para mostrar los datos
		mostrarDatos(coches);
		sc.close();
	}

	private static void mostrarDatos(ArrayList<Coche> coches) {

		System.out.printf("%6s %6s %9s %5s %10s %8s\n", "MARCA", "MODELO", "MATRICULA", "COLOR", "CILINDRADA",
				"POTENCIA");

		for (Coche coche : coches) {

			System.out.printf("%6s %6s %9s %5s %10.2f %8.2f\n", coche.getMarca(), coche.getModelo(),
					coche.getMatricula(), coche.getColor(), coche.getCilindrada(), coche.getPotencia());

		}
	}

	private static void rellenarDatos(Scanner sc, ArrayList<Coche> coches) {

		Coche c = new Coche();
		boolean isCorrect = true;

		do {
			isCorrect = true;
			System.out.println("Introduce la marca del coche");
			c.setMarca(sc.nextLine());
			// For para validar si meten numeros
			for (int i = 0; i < c.getMarca().length(); i++) {
				if (Character.isDigit(c.getMarca().charAt(i))) {
					isCorrect = false;
					System.out.println("La marca no puede contener numeros");
				}
			}
		} while (!isCorrect);

		System.out.println("Introduce el modelo del coche");
		c.setModelo(sc.nextLine());
		do {
			isCorrect = true;
			System.out.println("Introduce la matricula del coche");
			c.setMatricula(sc.nextLine());
			if (c.getMatricula().length() > 7) {
				isCorrect = false;
			}
		} while (!isCorrect);

		do {
			isCorrect = true;
			System.out.println("Introduce el color del coche");
			c.setColor(sc.nextLine());
			// For para validar si meten numeros
			for (int i = 0; i < c.getColor().length(); i++) {
				if (Character.isDigit(c.getColor().charAt(i))) {
					isCorrect = false;
					System.out.println("El color no puede contener numeros");
				}
			}
		} while (!isCorrect);
		do {
			isCorrect = true;
			try {

				System.out.println("Introduce la cilindrada del coche");
				c.setCilindrada(Float.parseFloat(sc.nextLine()));

				System.out.println("Introduce la potencia del coche");
				c.setPotencia(Float.parseFloat(sc.nextLine()));

				coches.add(c);

			} catch (Exception e) {

				isCorrect = false;
				System.out.println("Tienes que introducir un numero");
			}
		} while (!isCorrect);
	}

}
