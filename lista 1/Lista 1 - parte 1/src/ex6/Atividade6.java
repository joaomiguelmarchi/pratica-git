package ex6;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] num = new int[10];
		int maiornum = 0, menornum = 1000000;
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um número");

			num[i] = Integer.valueOf(s.nextLine());
			if (num[i] >= maiornum) {
				maiornum = num[i];
			}
			if (num[i] <= menornum) {
				menornum = num[i];

			}
		}
		System.out.println("O maior numero e: " + maiornum);
		System.out.println("O menor numero e: " + menornum);
	}
}
