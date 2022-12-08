package pratica5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JComboBox txtcomboBox;
	private String texto;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Opções:");
		lblNewLabel.setBounds(10, 36, 69, 31);
		contentPane.add(lblNewLabel);
		
		JComboBox<String> txtcomboBox = new JComboBox<>();
		txtcomboBox.setBounds(150, 34, 69, 35);
		
		String[]vetorPessoa= {"Cauã","João","Davi","Enzo","Eliézer","Bruna"};
		for(int i=0;i<vetorPessoa.length;i++) {
			txtcomboBox.addItem(vetorPessoa[i]);
		}
		
		contentPane.add(txtcomboBox);
		
		
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(75, 122, 249, 108);
			contentPane.add(scrollPane);
			
			
			
			
			JTextArea textArea = new JTextArea();
			scrollPane.setViewportView(textArea);
			
			JButton btnadd = new JButton("ADICIONAR");
			btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valorSelecionado = (String) txtcomboBox.getSelectedItem();
				if (texto == null) {
					texto=(valorSelecionado);
				}
				else{
					texto=(texto + ", "  + valorSelecionado);
				}
				textArea.setText(texto);
			}
		});
			btnadd.setBounds(304, 31, 120, 40);
			contentPane.add(btnadd);
	}
}
