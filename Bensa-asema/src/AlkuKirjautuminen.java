import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class AlkuKirjautuminen extends JFrame {

	private JPanel contentPane;
	private JLabel kortinPIN;
	private JButton nappi1;
	private JTextField textField_PIN;
	private JLabel otsikkoTeksti;
	private JButton nappi2;
	private JLabel tekstiavaan;
	private PaaIkkuna paaIkkuna = new PaaIkkuna();
	private JLabel Pic;

	String filename = "src/Recources/enter-pin-message-on-gas-260nw-1543148804 (2).png";

	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlkuKirjautuminen frame = new AlkuKirjautuminen();
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
	public AlkuKirjautuminen() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/Recources/gas-station.png"));
		setTitle("St10-Asiakkaan Kirjautuminen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		kortinPIN = new JLabel("Sy\u00F6t\u00E4 korttisi PIN:");
		kortinPIN.setFont(new Font("Tahoma", Font.PLAIN, 17));
		kortinPIN.setBounds(208, 244, 139, 25);
		contentPane.add(kortinPIN);

		nappi1 = new JButton("Kirjaudu");
		nappi1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		nappi1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				String oikea_PIN = crypt("0000");
				String PIN_crypted = "";

				try {
					PIN_crypted = crypt(textField_PIN.getText());
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Kirjoita numero", "Erroria lykää", JOptionPane.ERROR_MESSAGE);
					textField_PIN.setText(" ");
				}

				if (oikea_PIN.equals(PIN_crypted)) {
					JOptionPane.showMessageDialog(null, "Sisäänkirjautuminen tapahtui onnistuneesti");
					AlkuKirjautuminen.this.dispose();
					paaIkkuna.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "Ei salasanavastaavuuksia!", "Virhe",
							JOptionPane.ERROR_MESSAGE);
					textField_PIN.setText(" ");
				}
			}
		});
		nappi1.setBounds(429, 325, 190, 25);
		contentPane.add(nappi1);

		textField_PIN = new JTextField();
		textField_PIN.setBounds(376, 247, 190, 22);
		contentPane.add(textField_PIN);
		textField_PIN.setColumns(10);

		otsikkoTeksti = new JLabel("Tervetuloa st10 bensa-asemalle!");
		otsikkoTeksti.setFont(new Font("Tahoma", Font.PLAIN, 25));
		otsikkoTeksti.setHorizontalAlignment(SwingConstants.CENTER);
		otsikkoTeksti.setBounds(208, 124, 396, 28);
		contentPane.add(otsikkoTeksti);

		nappi2 = new JButton("Peruuta");
		nappi2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		nappi2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "Lopetetaanko?", "Lopetus?", JOptionPane.YES_NO_OPTION,
						JOptionPane.WARNING_MESSAGE);
				if (result == JOptionPane.YES_OPTION) {
					System.out.println("OK painettu, ikkuna suljettu");
					System.exit(0);
				}
				if (result == JOptionPane.NO_OPTION) {
					System.out.println("No painettu, ohjelma pyörii");
					setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				}
			}
		});
		nappi2.setBounds(180, 325, 190, 25);
		contentPane.add(nappi2);

		tekstiavaan = new JLabel("Ole hyv\u00E4 ja tunnistaudu.");
		tekstiavaan.setHorizontalAlignment(SwingConstants.CENTER);
		tekstiavaan.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tekstiavaan.setBounds(308, 180, 204, 25);
		contentPane.add(tekstiavaan);

		lblNewLabel = new JLabel("");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(156, 73, 499, 357);
		contentPane.add(lblNewLabel);

		Pic = new JLabel("");
		Pic.setBounds(0, 0, 782, 503);
		//Pic.setIcon(new ImageIcon("src/Recources/enter-pin-message-on-gas-260nw-1543148804 (2).png", "Kuva"));
		Pic.setIcon(new ImageIcon(new ImageIcon("src/Recources/enter-pin-message-on-gas-260nw-1543148804 (2).png").getImage().getScaledInstance(800, 500, Image.SCALE_DEFAULT)));
		contentPane.add(Pic);
	}

	protected ImageIcon createImageIcon(String path, String description) {
		java.net.URL imgURL = getClass().getResource(path);
		if (imgURL != null) {
			ImageIcon icon = new ImageIcon(imgURL, description);
			Image img = icon.getImage();
			Image newImg = img.getScaledInstance(Pic.getWidth(), Pic.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon newImc = new ImageIcon(newImg);

			return newImc;
		} else {
			System.err.println("Couldn't find file: " + path);
			return null;
		}
	}

	public static String crypt(String str) {
		if (str == null || str.length() == 0) {
			throw new IllegalArgumentException("String to encript cannot be null or zero length");
		}

		MessageDigest digester;
		try {
			digester = MessageDigest.getInstance("MD5");

			digester.update(str.getBytes());
			byte[] hash = digester.digest();
			StringBuffer hexString = new StringBuffer();
			for (int i = 0; i < hash.length; i++) {
				if ((0xff & hash[i]) < 0x10) {
					hexString.append("0" + Integer.toHexString((0xFF & hash[i])));
				} else {
					hexString.append(Integer.toHexString(0xFF & hash[i]));
				}
			}
			return hexString.toString();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return "";
	}
}
