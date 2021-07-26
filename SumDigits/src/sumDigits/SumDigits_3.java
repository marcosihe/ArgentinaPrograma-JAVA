package sumDigits;

public class SumDigits_3 {
	
	public int sumDigits(int number) {
		return (number % 9 == 0)? 9 : number % 9 ;
	}
public static void main(String[] args) {
		
		SumDigits sum_digits = new SumDigits();
		
		System.out.println(sum_digits.sumDigits(720)); // 9
		System.out.println(sum_digits.sumDigits(89)); // 8
		System.out.println(sum_digits.sumDigits(65271)); // 3
	}

}
