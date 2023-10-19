package java_standard_desafio2;

import java.util.Scanner;

public class Notas {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese la cantidad de alumnos: ");
		int cantidadAlumnos = teclado.nextInt();
		teclado.nextLine(); 

		String[] nombres = new String[cantidadAlumnos];
		String[] apellidos = new String[cantidadAlumnos];
		int[] numerosExamenes = new int[cantidadAlumnos];
		double[] notas = new double[cantidadAlumnos];

		for (int i = 0; i < cantidadAlumnos; i++) {
			System.out.println("Ingrese la informacion del alumno " + (i + 1) + ":");

			System.out.print("Nombre: ");
			nombres[i] = teclado.nextLine();

			System.out.print("Apellido: ");
			apellidos[i] = teclado.nextLine();

			System.out.print("Numero de examen: ");
			numerosExamenes[i] = teclado.nextInt();

			System.out.print("Nota: ");
			notas[i] = teclado.nextDouble();
			teclado.nextLine();
		}

		teclado.close();

		double notaMaxima = notas[0];
		double notaMinima = notas[0];
		int cantidadPromocionados = 0;
		int cantidadRecursantes = 0;

		for (int i = 0; i < cantidadAlumnos; i++) {
			if (notas[i] > notaMaxima) {
				notaMaxima = notas[i];
			}

			if (notas[i] < notaMinima) {
				notaMinima = notas[i];
			}

			if (notas[i] >= 7) {
				cantidadPromocionados++;
			} else {
				cantidadRecursantes++;
			}
		}

		System.out.println("Alumnos con la calificacion mas alta: ");
		for (int i = 0; i < cantidadAlumnos; i++) {
			if (notas[i] == notaMaxima) {
				System.out.println(nombres[i] + " " + apellidos[i]);
			}
		}

		System.out.println("Alumnos con la calificacion mas baja: ");
		for (int i = 0; i < cantidadAlumnos; i++) {
			if (notas[i] == notaMinima) {
				System.out.println(nombres[i] + " " + apellidos[i]);
			}
		}

		System.out.println("Cantidad de alumnos que promocionan: " + cantidadPromocionados);
		System.out.println("Cantidad de alumnos que deben recursar: " + cantidadRecursantes);

	}

}
