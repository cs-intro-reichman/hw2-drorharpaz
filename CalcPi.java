// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int num = Integer.parseInt(args[0]);
		double sum = 0;
		int m = 1;
		double sh = 0;
		int o = 1;

		while (num > 0) {
			sh = 1.0 / m;
			if (o % 2 == 0) { sum = sum - sh; }
			else 			{ sum = sum + sh; }
			
			sh = 0;
			num = num - 1;
			o = o + 1;
			m = m + 2;
		}

		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + sum * 4);
	}
}
