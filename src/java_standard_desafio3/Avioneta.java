package java_standard_desafio3;

public class Avioneta extends Volador implements Pista1 {

	public Avioneta(String nombre) {
		super(nombre);
	}

	@Override
	public void aterrizar() {
		System.out.println(getClass().getSimpleName() + " aterrizando en Pista 1.");
	}

}
