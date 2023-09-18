package Practice2;

import java.util.Scanner;

public class RunTimeInput {

	public static void main(String[] args) {
	int a,b,c;
	System.out.println("Enter the values:");
	try (Scanner s = new Scanner(System.in)) {
		a = s.nextInt();
		b = s.nextInt();
	}
	c = a+b;
	System.out.println("the addition of a = "+ a + " and b = "+ b+ " is c "+c);

	}

}
