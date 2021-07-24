package sumDigits;

public class SumDigits {
	
	public int sumDigits(int num) {	
		int sum = 0;
		if(num < 10) {
			return num;
		}
		String s_num = Integer.toString(num);
		for(int i = 0; i < s_num.length(); i++) {
			sum += Character.getNumericValue(s_num.charAt(i));
		}
		return sumDigits(sum);
	}

	public static void main(String[] args) {
		
		SumDigits sum_digits = new SumDigits();
		
		System.out.println(sum_digits.sumDigits(1234)); // 1
		System.out.println(sum_digits.sumDigits(89)); // 8
		System.out.println(sum_digits.sumDigits(65271)); // 3
	}
}