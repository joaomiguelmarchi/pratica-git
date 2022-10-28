package org.com.jotinha;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Anp_27_10 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCPF;
	private String nome, cpf, pronome, texto;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Anp_27_10 frame = new Anp_27_10();
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
	public Anp_27_10() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 343);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboPro = new JComboBox();
		comboPro.setModel(new DefaultComboBoxModel(new String[] {"Sr.", "Sra.", "Srta."}));
		comboPro.setBounds(87, 54, 67, 22);
		contentPane.add(comboPro);
		
		txtNome = new JTextField();
		txtNome.setBounds(66, 102, 191, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtCPF = new JTextField();
		txtCPF.setBounds(66, 133, 191, 20);
		contentPane.add(txtCPF);
		txtCPF.setColumns(10);
		
	
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(66, 180, 279, 100);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JLabel lblNewLabel = new JLabel("NOME:");
		lblNewLabel.setBounds(10, 105, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CPF:");
		lblNewLabel_1.setBounds(10, 136, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PRONOME:");
		lblNewLabel_2.setBounds(10, 58, 67, 14);
		contentPane.add(lblNewLabel_2);
		
			JButton butao = new JButton("ADICIONAR");
		butao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				pronome=comboPro.getSelectedItem().toString();
				nome=txtNome.getText();
				cpf=txtCPF.getText();
				if(nome.isEmpty() || cpf.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nome ou CPF invalido, redigite");
				}
				else {
				
				if( texto==null ) {
					texto=(pronome + " " + nome + " cujo CPF é "+ cpf);
				}
				else {
					texto=(texto + "\n" + pronome + " " + nome + " cujo CPF é "+ cpf);
				}
				textArea.setText(texto);
				}
			}		
		});
		butao.setBounds(296, 132, 128, 23);
		contentPane.add(butao);
	}
}
