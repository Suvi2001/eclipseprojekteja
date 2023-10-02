import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class KuittiIkkuna extends JFrame {

	private JPanel contentPane;
	private JLabel Tausta;
	private JLabel otsikkoTeksti;
	private JLabel lblNewLabel;
	private JButton poistuNappi;
	private JTextField textField;

	String filename = "src/Recources/kuitti.txt";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KuittiIkkuna frame = new KuittiIkkuna();
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
	public KuittiIkkuna() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/Recources/gas-station.png"));
		setTitle("Asiakkaan kuitti");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		poistuNappi = new JButton("Sulje kuitti");
		poistuNappi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				System.exit(0);
			}
		});
		poistuNappi.setFont(new Font("Tahoma", Font.PLAIN, 15));
		poistuNappi.setBounds(179, 415, 220, 25);
		contentPane.add(poistuNappi);

		lblNewLabel = new JLabel("Ostoksesi:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(27, 91, 93, 16);
		contentPane.add(lblNewLabel);

		otsikkoTeksti = new JLabel("Kiitos k\u00E4ynnist\u00E4 ja tervetuloa uudelleen!");
		otsikkoTeksti.setFont(new Font("Tahoma", Font.PLAIN, 20));
		otsikkoTeksti.setBounds(96, 42, 382, 36);
		contentPane.add(otsikkoTeksti);

		textField = new JTextField();
		String teksti = lueTiedostosta(filename);
		textField.setText(teksti);

		textField.setBounds(27, 120, 508, 264);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setEditable(false);

		Tausta = new JLabel("");
		Tausta.setBackground(Color.WHITE);
		Tausta.setOpaque(true);
		Tausta.setBounds(12, 13, 538, 389);
		contentPane.add(Tausta);
	}

	public String lueTiedostosta(String filename) {
		String alltext = " ";

		try {
			FileReader freader = new FileReader(filename);
			BufferedReader br = new BufferedReader(freader);
			String line;

			while ((line = br.readLine()) != null) {
				alltext = alltext + line + "\n";
			}
		} catch (Exception e) {
			e.printStackTrace();
			alltext = " ";
		}
		return alltext;
	}
}
