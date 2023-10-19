package java_standard_desafio3;

import java.util.Random;

public class Operario {
	public boolean autorizarAterrizaje() {
		Random autoriza = new Random();
		return autoriza.nextBoolean();
	}
}
