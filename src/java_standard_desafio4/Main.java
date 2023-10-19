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

public class Main {

	public static void main(String[] args) {
		CollectionCustom<Integer> collection = new CollectionCustom<>();

		collection.addLast(1);
		collection.addLast(2);
		collection.addLast(3);

		System.out.println("Longitud: " + collection.size());
		System.out.println("Esta vacia : " + collection.empty());

		collection.addFirst(0);
		collection.addLast(4);
		collection.add(5, 2);

		System.out.println("Longitud: " + collection.size());

		int eliminado = collection.remove(2);
		System.out.println("Eliminado: " + eliminado);
		System.out.println("Longitud: " + collection.size());

		collection.removeAll();
		System.out.println("Longitud: " + collection.size());
	}
}
