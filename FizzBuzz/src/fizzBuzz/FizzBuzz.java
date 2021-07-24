package fizzBuzz;

public class FizzBuzz {
	
	public static void fizzBuzz (int num1, int num2) {
		String output = "";
		int i = 1;
		int n = 100;
		while(i <= n) {
			if(i % num1 == 0) { output += "Fizz"; }
			if(i % num2 == 0) { output += "Buzz"; }
			if(output == "") { output = Integer.toString(i); }
			System.out.println(output);
			output = "";
			i++;
		}
	}

	public static void main(String[] args) {
		fizzBuzz(3,5);
	}
}