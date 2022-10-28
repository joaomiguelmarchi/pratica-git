package ex10;

import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			Integer nota1, nota2, nota3;
			float MF;
			
			System.out.println("Digite 3 notas");
			nota1=Integer.valueOf(s.nextLine());
			nota2=Integer.valueOf(s.nextLine());
			nota3=Integer.valueOf(s.nextLine());
			
			MF = calcMedia(nota1, nota2, nota3);
			System.out.println("A media é: "+ MF);
			if (MF>=6) {
				System.out.println("Aprovado");
			}
			else if (MF>=4 && MF<6) {
				System.out.println("Recuperação");
			}
			else {
				System.out.println("Reprovado");
			}
	}
	
	public static int calcMedia(int nota1, int nota2 , int nota3) {
		float media = (nota1+nota2+nota3)/3;
		return (int) media;
	}
}
