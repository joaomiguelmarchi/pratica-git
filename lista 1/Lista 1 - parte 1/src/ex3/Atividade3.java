package ex3;

import java.util.Scanner;

public class Atividade3 {

	public static void main (String [] args) {
		Scanner s = new Scanner(System.in);
		Integer num;
		num = Integer.valueOf(s.nextLine());
		if (num % 2 == 0) {
			System.out.println("o numero e par");
		}
		else {
			System.out.println("o numero e impar");
		}
	}
}
