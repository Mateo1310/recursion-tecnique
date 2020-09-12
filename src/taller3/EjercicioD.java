package taller3;

public class EjercicioD {

	/*public static void main(String[] args) {
		EjercicioD x = new EjercicioD();
		System.out.println("La cantidad de digitos en el numero es: "+x.contarDigitos(5250, 0));

	}*/
	
	
	public int contarDigitos(int numero, int contador) {
		if(numero==0) {
			return contador;
		}else {
			return contarDigitos(numero/10, contador+1);
		}
	}
	

}
