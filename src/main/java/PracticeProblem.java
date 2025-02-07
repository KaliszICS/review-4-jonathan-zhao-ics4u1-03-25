import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();		
	}

	public static void q1() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String word = in.nextLine();
		System.out.println(Integer.parseInt(5+word) + 5); 
		

		
	}

	public static void q2() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		String word = in.nextLine();
		System.out.println(Double.parseDouble(4+word+3) + 3.4);

		
	}

	public static void q3() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a boolean: ");
		String word = in.nextLine();
		System.out.println(!Boolean.parseBoolean(word));
		
	}

	public static void q4() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String word = in.nextLine();
		System.out.println((char)(Integer.parseInt(word+3) + 2));
		
		
	}

	public static void q5() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String word = in.nextLine();
		System.out.println((double)(Integer.parseInt(word + 1) / 2));
		
	}

	public static void q6() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		String word = in.nextLine();
		System.out.println((int)Double.parseDouble(1 + word));
		
	}

}
