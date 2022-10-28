package ex07;

import javax.swing.JOptionPane;

public class Exercicio_07 {

	public static void main(String[] args) {
		Integer nota1 = Integer.valueOf(JOptionPane.showInputDialog("Digite a primeira nota"));
		Integer nota2 = Integer.valueOf(JOptionPane.showInputDialog("Digite a segunda nota"));
		Integer nota3 = Integer.valueOf(JOptionPane.showInputDialog("Digite a terceira nota"));
		Integer MF=(nota1+nota2+nota3)/3;
		if (MF>=6){
			JOptionPane.showMessageDialog(null, MF+"\nAprovado");
		}
		if  (MF>=4 && MF<6){
			JOptionPane.showMessageDialog(null, MF+"\nRecuperação");
		}
		if(MF<4){
			JOptionPane.showMessageDialog(null, MF+"\nReprovado");
		}
	}
}
