package circulosEIntersecciones;

public class CirculoEIntersecciones {
	
	
		public int sumDigits(int num) {
			int sumaDigitos = num;
			while (sumaDigitos / 10 != 0) {
				sumaDigitos = sumaDigitos / 10 + sumaDigitos % 10;
			}
			return sumaDigitos;
		}
	

	public static void main(String[] args) {
		CirculoEIntersecciones sd = new CirculoEIntersecciones();
		
		System.out.println(sd.sumDigits(9999));  // 9
		System.out.println(sd.sumDigits(562)); // 4
		System.out.println(sd.sumDigits(4)); // 4
		System.out.println(sd.sumDigits(123457)); // 4

	}

}
