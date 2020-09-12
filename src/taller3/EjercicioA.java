package taller3;

public class EjercicioA {

	public static boolean numeroPrimo(int numero, int divisor) {

		if (divisor == 1) {
			return true;

		} else {
			if (numero % divisor == 0) {

				return false;

			}

			return numeroPrimo(numero, divisor - 1);

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese el numero a consultar: ");
		int x = new java.util.Scanner(System.in).nextInt();
		System.out.println(numeroPrimo(x, x - 1));

	}

}
