package paarcialTresB;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			boolean continuar = true;
			Nave[] inventario = new Nave[12];

			// Lanzadera Lanzadera = new Lanzadera("\n Saturno V", "H(liq)+O(liq),", "3000
			// toneladas.", "45.000 km/h.", "32000×5 caballos.\n");
			// Tripuladas tripuladas = new Tripuladas ("\n Apolo 11", "NO4+UDMH", "12.820
			// kilogramos .", "45.000 km/h", "20.500 libras de empuje \n");
			// NoTripuladas notripuladas = new NoTripuladas("\n Surveyor","solido
			// liquido","995 kilogramos ","116 km/h","85 vatios \n");
			// Tripuladas tripuladas2 = new Tripuladas ("\n Dragon V2", "Solido", "9.525
			// kilogramos .", "28.000 km/h", "2.800 vatios \n ");

			// System.out.print(Lanzadera.toString());
			// System.out.print(tripuladas.toString());
			// System.out.print(notripuladas.toString());
			// System.out.print(tripuladas2.toString());

			while (continuar) {
				System.out.println("Elija una opción:");
				System.out.println("1. Agregar nave");
				System.out.println("2. Buscar nave");
				System.out.println("3. Salir");
				int opcion = scanner.nextInt();
				scanner.nextLine();
				switch (opcion) {
				case 1:
					System.out.println("que nave desea agregar:" + "\n 1.tipo lanzadera \n" + "\n 2.tipo tripulada \n"
							+ "\n 3.tipo no tripulada \n");
					int tipodeNave = scanner.nextInt();
					scanner.nextLine();
					if (tipodeNave >= 1 && tipodeNave <= 3) {

						System.out.println("Nombre:");
						String nombre = scanner.nextLine();
						System.out.println(" combustible");
						String combustible = scanner.nextLine();
						System.out.println("velocidad maxima");
						String velocidad = scanner.nextLine();
						System.out.println("peso");
						String peso = scanner.nextLine();
						System.out.println("potencia");
						String potencia = scanner.nextLine();

						switch (tipodeNave) {
						case 1:

							Lanzadera lanzadera = new Lanzadera(nombre, combustible, peso, velocidad, potencia);
							agregarNave(inventario, lanzadera);
							break;

						case 2:

							Tripuladas tripulada = new Tripuladas(nombre, combustible, peso, velocidad, potencia);
							agregarNave(inventario, tripulada);

							break;

						case 3:
							NoTripuladas Notripulada = new NoTripuladas(nombre, combustible, peso, velocidad, potencia);
							agregarNave(inventario, Notripulada);
							break;
						
						
						}

					} else {
						System.out.println("opcion incorrecta digite una opcion correcta");
					}

					break;
				case 2:
					System.out.println(" ingrese el nombre de la nave desea buscar");
					String Buscar = scanner.nextLine();
					Nave Encontrada = buscar(inventario, Buscar);

					if (Encontrada != null) {
						System.out.println("Nave encontrada:");
						System.out.println(Encontrada);
					} else {
						System.out.println("no existe dicha nave :( vuelva e ingrese un nombre o termine el programa");
					}

					break;
				case 3:
					continuar = false;
					break;

				}

			}
		}

	}

	public static void agregarNave(Nave[] inventario, Nave nave) {
		for (int i = 0; i < inventario.length; i++) {
			if (inventario[i] == null) {
				inventario[i] = nave;
				break;
			}
		}
	}

	public static Nave buscar(Nave[] inventario, String nombre) {
		for (Nave nave : inventario) {
			if (nave != null && nave.getnombre().equalsIgnoreCase(nombre)) {
				return nave;
			}
		}
		return null;
	}
}