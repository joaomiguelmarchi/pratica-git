package ex04;

import javax.swing.JOptionPane;

public class Exercicio_04 {

	public static void main(String[] args) {
		for (int i=0;i<10;i++) {
			Integer num = Integer.valueOf(JOptionPane.showInputDialog("Digite um número"));
			JOptionPane.showMessageDialog(null, num);
		}
	}
}
