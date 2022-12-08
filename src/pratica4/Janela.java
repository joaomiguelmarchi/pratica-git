package pratica4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField Nota2;
	private JTextField Nota3;
	private JTextField Nota1;
	private JTextField txtNome;

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
		setBounds(100, 100, 218, 261);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Nota2 = new JTextField();
		Nota2.setBounds(66, 112, 86, 20);
		contentPane.add(Nota2);
		Nota2.setColumns(10);
		
		Nota3 = new JTextField();
		Nota3.setBounds(66, 150, 86, 20);
		contentPane.add(Nota3);
		Nota3.setColumns(10);
		
		Nota1 = new JTextField();
		Nota1.setBounds(66, 81, 86, 20);
		contentPane.add(Nota1);
		Nota1.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setBounds(66, 39, 86, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(10, 42, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nota 1:");
		lblNewLabel_1.setBounds(10, 84, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nota 2:");
		lblNewLabel_2.setBounds(10, 115, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nota 3:");
		lblNewLabel_3.setBounds(10, 153, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("CALCULAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				
				String n1 = Nota1.getText();
				String n2 = Nota2.getText();
				String n3 = Nota3.getText();
				
				if (n1.isEmpty() || n2.isEmpty() || n3.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Valor invalido, redigite");
				}
				
				Double nota1 = Double.valueOf(n1);
				Double nota2 = Double.valueOf(n2);
				Double nota3 = Double.valueOf(n3);
				
				double media=(nota1+nota2+nota3)/3;
				
				JOptionPane.showMessageDialog(null, "A média de " + nome+ " é:\n"+  media);
			}
		});
		btnNewButton.setBounds(63, 189, 89, 23);
		contentPane.add(btnNewButton);
	}
}
