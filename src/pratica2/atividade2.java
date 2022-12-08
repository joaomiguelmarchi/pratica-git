package pratica2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class atividade2 extends JFrame {

	private JPanel contentPane;
	private JTextField ladoA;
	private JTextField LadoB;
	private JTextField LadoC;
	private int n1,n2,n3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					atividade2 frame = new atividade2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public atividade2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 420, 210);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ladoA = new JTextField();
		ladoA.setBounds(10, 40, 86, 20);
		contentPane.add(ladoA);
		ladoA.setColumns(10);
		
		LadoB = new JTextField();
		LadoB.setBounds(161, 40, 86, 20);
		contentPane.add(LadoB);
		LadoB.setColumns(10);
		
		LadoC = new JTextField();
		LadoC.setBounds(304, 40, 86, 20);
		contentPane.add(LadoC);
		LadoC.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Lado A:");
		lblNewLabel.setBounds(30, 15, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Lado B:");
		lblNewLabel_1.setBounds(175, 15, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Lado C:");
		lblNewLabel_2.setBounds(320, 15, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1= ladoA.getText();
				String num2= LadoB.getText();
				String num3= LadoC.getText();
				
				if ( num1.isEmpty() || num2.isEmpty() || num3.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Valor invalido, redigite");
				}
				
				n1 = Integer.valueOf(num1);
				n2 = Integer.valueOf(num2);
				n3 = Integer.valueOf(num3);
	
				if(n1==n2 && n1==n3 && n2==n3) {
					JOptionPane.showMessageDialog(null, "Triangulo equilatero (Três lados iguais)");
				}else if(n1==n2 || n2==n3 ||  n3==n1) {
					JOptionPane.showMessageDialog(null, "Triangulo isóceles (Dois lados iguais)");
				} else{
					JOptionPane.showMessageDialog(null, "Triangulo escaleno (Três lados diferentes)");
				}
			}
		});
		btnNewButton.setBounds(161, 102, 89, 23);
		contentPane.add(btnNewButton);
	}
}
