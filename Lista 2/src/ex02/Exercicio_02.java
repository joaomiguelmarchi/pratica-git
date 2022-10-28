package ex02;

import javax.swing.JOptionPane;

public class Exercicio_02 {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite o nome");
		Integer idade = Integer.valueOf(JOptionPane.showInputDialog("Digite a idade"));
		JOptionPane.showMessageDialog(null, nome);
		JOptionPane.showMessageDialog(null, idade);
	}
}
