/*Desafío 4, Crear un branch con el nombre feature/desafio-java-4.

El objetivo es crear una clase CollectionCustom<T>
-La clase tiene un atributo T[] “un array de T” en el cual se deben guardar los tipos una vez creada la implementación.
- debe tener los métodos
size():int
addFirst(T): void
addLast(T):void
add(T):void
remove(T): T remueve el primer elemento indicado y lo retorna.
removeAll(T): void remueve todos los elementos.
boolean empty(): indica si la colección está vacía.

Crear la clase Main para probar cada método.
Nota:No usar Collection (Set, List, Collection etc) vistas en clase, deben trabajar con array de T, uds deben implementar la lógica. */

package java_standard_desafio4;

public class CollectionCustom<T> {
	// Atributos
	private T[] array;
	private int longitud;

	// Constructor
	public CollectionCustom(int longitud) {
		this.longitud = longitud;
		this.array = (T[]) new Object[longitud];
	}

	// Contructor sin indicar longitud, 1 por defecto
	public CollectionCustom() {
		longitud = 0;
		this.array = (T[]) new Object[longitud];
	}

	// Métodos
	public int size() {
		return longitud;
	}

	public void addFirst(T elemento) {
		incrementarLongitud();
		for (int i = longitud; i > 0; i--) {
			array[i] = array[i - 1];
		}
		array[0] = elemento;
		longitud++;
	}

	public void addLast(T elemento) {
		incrementarLongitud();
		array[longitud] = elemento;
		longitud++;
	}

	public void add(T elemento, int posicion) {
		incrementarLongitud();
		for (int i = longitud; i > posicion; i--) {
			array[i] = array[i - 1];
		}
		array[posicion] = elemento;
		longitud++;
	}

	public T remove(T elemento) {
		if (!empty()) {
			for (int i = 0; i < longitud; i++) {
				if (array[i] == elemento) {
					for (int j = i; j < longitud - 1; j++) {
						array[j] = array[j + 1];
					}
					decrementarLongitud();
					longitud--;
					return elemento;
				}
			}
		}
		return null;
	}

	public void removeAll() {
		if (!empty()) {
			longitud = 0;
			T[] arrayAux = (T[]) new Object[longitud];
			array = arrayAux;
		}

	}

	public boolean empty() {
		if (longitud == 0) {
			return true;
		} else {
			return false;
		}
	}

	// Métodos auxiliares
	private void incrementarLongitud() {
		int longitud = array.length + 1;
		T[] arrayAux = (T[]) new Object[longitud];
		if (longitud > 0) {
			for (int i = 0; i < longitud - 1; i++) {
				arrayAux[i] = array[i];
			}
		}
		array = arrayAux;
	}

	private void decrementarLongitud() {
		int longitud = array.length - 1;
		T[] arrayAux = (T[]) new Object[longitud];
		if (longitud > 0) {
			for (int i = 0; i < longitud; i++) {
				arrayAux[i] = array[i];
			}
		}

		array = arrayAux;
	}
}
