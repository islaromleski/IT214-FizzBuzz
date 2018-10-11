package fb;

public class FizzBuzz {
	String calculate(int testNum) {
		if((testNum % 3 == 0) && (testNum % 5 == 0)) {
			return "FizzBuzz";
		}
		else if(testNum % 5 == 0) {
			return "Buzz    ";
		}
		else if(testNum % 3 == 0) {
			return "Fizz    ";
		}
		else {
			return "        ";
		}
	}
}
