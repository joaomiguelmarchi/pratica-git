package pratica1;

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

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private Double n1, n2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
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
	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 417, 222);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(151, 95, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(151, 36, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Digite um numero:");
		lblNewLabel.setBounds(10, 39, 104, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Digite outro número:");
		lblNewLabel_1.setBounds(10, 98, 131, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Somar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = (textField.getText());
				String num2 = (textField_1.getText());
				
				if ( num1.isEmpty() || num2.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Valor invalido, redigite");
				}
				n1 = Double.valueOf(num1);
				n2 = Double.valueOf(num2);
				
				JOptionPane.showMessageDialog(null, "A soma dos números é: "+ (n1+n2));
			}
		});
		btnNewButton.setBounds(277, 68, 89, 23);
		contentPane.add(btnNewButton);
	}
}
