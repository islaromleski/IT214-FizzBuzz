package fb;

public class MainController {
	public static void main(String[] args) {
		
		ConsoleView aView = new ConsoleView();
		FizzBuzz myFizzBuzz = new FizzBuzz();
		
		for(int i = 1; i <= 100; i++) {
			aView.print((i + " " + myFizzBuzz.calculate(i) + " "));
			if(i % 4 == 0) {
				aView.print("\n");
			}
		}
	}
}
