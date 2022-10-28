package ex06;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Exercicio_06 {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		for(int i=0;i<10;i++) {
		a.add(JOptionPane.showInputDialog("Digite algo"));
		}
	JOptionPane.showMessageDialog(null, a);
}
}
