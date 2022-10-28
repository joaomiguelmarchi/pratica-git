package ex8;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade8 {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		System.out.println("a");
		for (int i=0;i<10;i++) {
			a.add(s.nextLine());
		}
		for (String string : a) {
			System.out.println(a);
		}
		System.out.println(a.size());
		System.out.println(a.get(a.size()-1));
		System.out.println(a.get(3));
	}
}
