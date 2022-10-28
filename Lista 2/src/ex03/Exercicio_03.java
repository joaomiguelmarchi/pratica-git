package ex03;

import javax.swing.JOptionPane;

public class Exercicio_03 {

	public static void main(String[] args) {
		Double precoLitro = Double.valueOf(JOptionPane.showInputDialog("Digite o preço do Litro"));
		Integer quantidadeLitro = Integer.valueOf(JOptionPane.showInputDialog("Digite a quantidade abastecida"));
		double totalPagamento = quantidadeLitro*precoLitro;
		JOptionPane.showMessageDialog(null, totalPagamento);
	}
}
