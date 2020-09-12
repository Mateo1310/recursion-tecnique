package taller3;

public class EjercicioB {

	/*public static void main(String[] args) {
		int[] array = { 3, 7, 2,40};

		EjercicioB a = new EjercicioB();
		System.out.println("EL elemento mas grande de la matriz es: "+a.mayor(array, 0, 0));

	}*/

	public int mayor(int[] array, int posicion, int numeroMayor) {
		if (posicion == array.length) {
			return numeroMayor;
		} else {
			if (array[posicion] > numeroMayor) {
				numeroMayor = array[posicion];
			}
			return mayor(array, posicion + 1, numeroMayor);
		}
	}

}
