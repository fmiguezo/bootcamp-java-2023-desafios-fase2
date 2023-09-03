package java_standard_desafio1;

import java.util.Scanner;

public class Fecha {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese una fecha en formato dd/mm/aaaa: ");
		String fecha = scanner.nextLine();
		String esFechaValida = validarFecha(fecha) ? "Fecha valida." : "Fecha invalida.";
		System.out.println(esFechaValida);
		scanner.close();
	}

	public static boolean validarFecha(String fecha) {
		boolean esBisiesto;
		String[] fechaDividida = fecha.split("/");
		
		if(fechaDividida.length != 3) {
			return false;
		}
		
		for (String division : fechaDividida) {
			 if (!esNumero(division)) {
	                return false;
	            }
		}
		
		int dia = Integer.parseInt(fechaDividida[0]);
		int mes = Integer.parseInt(fechaDividida[1]);
		int anio = Integer.parseInt(fechaDividida[2]);
		
		if (anio >= 1900 && anio <= 2099) {
			esBisiesto = esAnioBisiesto(anio);
		} else {
			return false;
		}
		
		if (mes >= 1 && mes <= 12) {
			switch (mes) {
				case 4:
				case 6:
				case 9:
				case 11:
					if (dia < 1 || dia > 30) {
						return false;
					}
					break;
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					if (dia < 1 || dia > 31) {
						return false;
					}
					break;
				case 2:
					if ((dia < 1 || dia > 28) && !esBisiesto) {
						return false;
					} else if ((dia < 1 || dia > 29) && esBisiesto) {
						return false;
					}
					break;
			}	
		} else {
			return false;
		}
		return true;
	}
	
	public static boolean esAnioBisiesto(int anio) {
		if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean esNumero(String numero) {
        try {
            Integer.parseInt(numero);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

