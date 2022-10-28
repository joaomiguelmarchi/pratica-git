package ex4;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Integer num;
		for (int i=0;i<10;i++) {
			System.out.println("digite um numero");
			num=Integer.valueOf(s.nextLine());	
			System.out.println("o numero digitado foi: "+ num);
			}
		}
	}

