package sumarCifras;

public class SumarCifras {
	
	public int sumarCifras(int numero) {	
		int suma = 0;
		int cantidadDeCifras = contarCantidadDeCifras(numero);
		
		if(numero < 10) {
			return numero;
		}
		for(int i = 0; i < cantidadDeCifras; i++) {
			suma += numero / Math.pow(10, i) % 10;
		}
		return sumarCifras(suma);
	}
	
	private int contarCantidadDeCifras(int numero) {
		int cantidadDeCifras = Integer.toString(numero).length();
		return cantidadDeCifras;
	}
	
	public static void main(String[] args) {
		
		SumarCifras sc = new SumarCifras();
		System.out.println(sc.sumarCifras(1234)); //1
		System.out.println(sc.sumarCifras(123456)); //3
		System.out.println(sc.sumarCifras(389)); //2
		System.out.println(sc.sumarCifras(44)); //8
		System.out.println(sc.sumarCifras(9)); //9
	}

}
