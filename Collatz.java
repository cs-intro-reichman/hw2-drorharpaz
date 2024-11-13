// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int N = Integer.parseInt(args[0]);
		char mode = args[1].charAt(0);
		int currentNum = 1;
		int counter1 = 1;
		int counter2 = 1;
		while (counter2 <= N) {
			currentNum = counter2;
			counter1 = 1;
			while (currentNum != 1 || (currentNum == 1 && counter1 == 1) ) {
				if (mode == 'v') { System.out.print(currentNum + " ");}
				if (currentNum % 2 == 0) {currentNum = currentNum / 2;
				} else                   {currentNum = (currentNum * 3 ) + 1;}
				counter1 ++;
			}
			if (mode == 'v') {System.out.println(currentNum + " " + "(" + counter1 + ")");}
			counter2 ++;
		}
		System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
	}
}