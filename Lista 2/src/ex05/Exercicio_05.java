package ex05;

import javax.swing.JOptionPane;

public class Exercicio_05 {

	public static void main(String[] args) {
		
		Integer[] num = new Integer[10];
		Integer menornum=999999,maiornum=0;
		for(int i=0;i<10;i++) {
		num[i]=	Integer.valueOf(JOptionPane.showInputDialog("Digite um número"));
			
			if(num[i]<=menornum) {
				menornum=num[i];
			}
			if (num[i]>maiornum) {
				maiornum=num[i];
			}
		}
		JOptionPane.showMessageDialog(null, "O maior número é: "+ maiornum);
		JOptionPane.showMessageDialog(null, "O menor número é: "+ menornum);
	}

}
