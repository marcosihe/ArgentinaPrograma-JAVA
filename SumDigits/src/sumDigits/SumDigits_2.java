package sumDigits;

public class SumDigits_2 {

	public int sumDigits(int num) {
		int sumaDigitos = num;
		while (sumaDigitos / 10 != 0) {
			sumaDigitos = sumaDigitos / 10 + sumaDigitos % 10;
		}
		return sumaDigitos;
	}

}
