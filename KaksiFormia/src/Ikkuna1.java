import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Ikkuna1 extends JFrame {

	private JPanel contentPane;
	public JTextField textField;
	private JButton nappi1;
	private JLabel Label1;
	private JButton nappi2;

	// launch the application-osio poistettiin.
	
	/**
	 * Create the frame.
	 */
	public Ikkuna1() {
		setTitle("Ikkuna1");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(87, 113, 262, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		nappi1 = new JButton("Hae teksti p\u00E4\u00E4ikkunalta");
		nappi1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Label1.setText(PaaIkkuna.Label1.getText());
				// haetaan tietoa p‰‰ikkunalta ali-ikkunaan 1 (mun nimi)
			}
		});
		nappi1.setBounds(113, 148, 208, 25);
		contentPane.add(nappi1);
		
		Label1 = new JLabel("");
		Label1.setHorizontalAlignment(SwingConstants.CENTER);
		Label1.setBounds(123, 186, 187, 16);
		contentPane.add(Label1);
		
		nappi2 = new JButton("Aseta teksti p\u00E4\u00E4ikkunalle");
		nappi2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PaaIkkuna.textField.setText(textField.getText());
			}
		});
		nappi2.setBounds(113, 215, 208, 25);
		contentPane.add(nappi2);
	}

}
