package java_standard_desafio3;

import java.util.ArrayList;
import java.util.List;

public class TorreDeControl {

	public static void main(String[] args) {
		List<Volador> voladores = new ArrayList<>();
		voladores.add(new Avion("Boeing 777"));
		voladores.add(new Avioneta("Cessna 152"));
		voladores.add(new Helicoptero("Robinson R44"));
		voladores.add(new Zeppelin("Hindenburg"));
		voladores.add(new Avion("Airbus A380 "));

		Operario operario = new Operario();

		System.out.println("Aterrizajes:");

		for (Volador volador : voladores) {
			if (volador instanceof Pista1) {
				((Pista1) volador).aterrizar();
			} else {
				if(operario.autorizarAterrizaje()){
					System.out.println(volador.getClass().getSimpleName() + " aterrizando en Pista 2.");
				} else{
					System.out.println(volador.getClass().getSimpleName() + " no autorizado para aterrizar.");
				}
			}
		}
	}
}
