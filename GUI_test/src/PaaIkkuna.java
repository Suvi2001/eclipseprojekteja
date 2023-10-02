import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PaaIkkuna extends JFrame {

	private JPanel contentPane;
	private JButton Nappi;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaaIkkuna frame = new PaaIkkuna();
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
	public PaaIkkuna() {
		setTitle("Mun Ohjelma");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Nappi = new JButton("Paina nappia!");
		Nappi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("nappia painettu");
			}
		});
		Nappi.setBounds(146, 194, 142, 23);
		contentPane.add(Nappi);
		
		textField = new JTextField();
		textField.setBounds(174, 77, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
	}

}
