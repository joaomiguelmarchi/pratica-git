package ex2;

import java.util.Scanner;

public class Atividade2 {

	public static void main (String [] args) {
		Scanner s = new Scanner(System.in);
		String nome;
		Integer idade;
		System.out.println("digite o nome");
		nome=s.nextLine();
		System.out.println("Digite a idade");
		idade=  Integer.valueOf(s.nextLine());
		System.out.println("Nome: "+ nome + "\nIdade: "+ idade);
		
	}
}
