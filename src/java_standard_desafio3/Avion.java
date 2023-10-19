package java_standard_desafio3;

public class Avion extends Volador implements Pista1 {
	
	public Avion(String nombre) {
        super(nombre);
    }
	
	@Override
	public void aterrizar() {
		System.out.println(getClass().getSimpleName() + " aterrizando en Pista 1.");
	}
}
