package fizzBuzz;

public class FizzBuzz {
	private String output;
	
	public FizzBuzz() {
		this.output = "";
	}
	
	public void setOutput(String output) {
		this.output = output;
	}
	
	// Methods
	public void asignMessage(int counter, int number, String message, String output) {
		if(counter % number == 0) {
			setOutput(output + message);
		}
	}
	
	public void asignValue(String output, int i) {
		if(output == "") {
			setOutput(Integer.toString(i));
		}
	}
	
	public void printMessages(int start, int end, int numberOne, int numberTwo) {
		int i = start;
		while(i <= end) {
			asignMessage(i, numberOne, "Fizz", output);
			asignMessage(i, numberTwo, "Buzz", output);
			asignValue(output, i);
			System.out.println(output);
			setOutput("");
			i++;
		}
	}
}
