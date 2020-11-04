package mf0227.uf2404.actividad3;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Aplicacion para gestionar una libreria.<br>
 * Tiene 4 opciones:
 * <ul>
 * <li>1. Listar</li>
 * <li>2. Crear</li>
 * <li>3. Eliminar</li>
 * <li>4. Modificar</li>
 * <li>s. Salir</li>
 * </ul>
 * 
 * @author Julen Martin
 *
 */
public class Principal extends AppGestion {

	final static String NOMBRE_POJO = "Libro";
	static private LibroDaoHash modelo = LibroDaoHash.getInstance();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String opc;

		do {
			pintarMenu(NOMBRE_POJO);
			opc = sc.nextLine();
			switch (opc) {
			case OP_LISTAR:
				listar();
				break;
			case OP_CREAR:
				crear(sc);
				break;
			case OP_ELIMINAR:
				eliminar(sc);
				break;
			case OP_MODIFICAR:
				modificar();
				break;
			case OP_SALIR:
				System.out.println("Hasta otra!");
				break;
			default:
				System.out.println("Esa opcion no existe");
				break;
			}// switch
		} while (!opc.equalsIgnoreCase("s"));

	}

	protected static void modificar() {
		System.out.println("Esta aun sin implementar....");
	}

	protected static void eliminar(Scanner sc) {
		Libro l;
		int id = 0;
		boolean isBorrado;
		boolean isCorrect = false;

		System.out.println("Introduce el identificador del libro que quieras eliminar");
		// Bucle para cuando el usuario no introduzca un numero
		do {
			try {
				id = Integer.parseInt(sc.nextLine());
				isCorrect = true;
			} catch (Exception e) {
				System.out.println("Tienes que introducir un numero");
			}
		} while (!isCorrect);

		l = modelo.getById(id);

		if (l == null) {
			System.out.println("El libro no existe");
		} else {
			isBorrado = modelo.delete(id);

			if (isBorrado == true) {
				System.out.println("El libro ha sido eliminado");
			} else {
				System.out.println("El libro no ha sido eliminado");
			}
		}

	}

	protected static void listar() {
		List<Libro> libros = modelo.getAll();
		// Para ordenar los libros alfabeticamente
		Collections.sort(libros, Libro.LibNomComparator);
		Iterator<Libro> iterador = libros.iterator();

		System.out.printf("%15s %20s\n", "Nombre de libro", "Numero de paginas");

		while (iterador.hasNext()) {
			Libro elemento = iterador.next();
			System.out.printf("%15s %20d\n", elemento.getNombre(), elemento.getNumeroPaginas());

		}

	}

	protected static void crear(Scanner sc) {
		String nombre;
		Libro l = new Libro();
		boolean isCorrect = true;
		// Bucle para que el usuariop no introduzca numeros en el nombre
		do {
			System.out.println("Introduce el nombre del libro");
			nombre = sc.nextLine();
			for (int i = 0; i < nombre.length(); i++) {
				if (Character.isDigit(nombre.charAt(i))) {
					isCorrect = false;
					System.out.println("El nombre no puede contener numeros");
					break;
				} else {
					isCorrect = true;
				}
			}
		} while (!isCorrect);
		l.setNombre(nombre);
		isCorrect = false;
		// Bucle con excepcion para cuando el usuario no introduce numero
		do {
			try {
				System.out.println("Introduce el numero de paginas del libro");
				l.setNumeroPaginas(Integer.parseInt(sc.nextLine()));
				isCorrect = true;
			} catch (Exception e) {
				System.out.println("Tienes que introducir un numero");
			}
		} while (!isCorrect);

		modelo.insert(l);

	}

}
