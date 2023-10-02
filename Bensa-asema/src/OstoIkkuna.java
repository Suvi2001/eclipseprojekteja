import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class OstoIkkuna extends JDialog {

	private KuittiIkkuna kuittiIkkuna = new KuittiIkkuna();

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			OstoIkkuna dialog = new OstoIkkuna();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	String filename = "src/Recources/enter-pin-message-on-gas-260nw-1543148804 (2).png";
	String filename1 = "src/Recources/kuitti.txt";
	String filename2 = "src/Recources/E95.txt";
	String filename3 = "src/Recources/E98.txt";
	String filename4 = "src/Recources/Diesel.txt";
	String filename5 = "src/Recources/tankkiE95.txt";
	String filename6 = "src/Recources/tankkiE98.txt";
	String filename7 = "src/Recources/tankkiDiesel.txt";

	private JLabel Pic;
	private JMenuBar menuBar;
	private JMenu Valikko;
	private JMenuItem mntmNewMenuItem;
	private JTextField textField_E95;
	private JLabel lblNewLabel;
	private JButton vahvistusNappi;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JCheckBox checkBoxE95;
	private JCheckBox checkBoxE98;
	private JCheckBox checkBoxDiesel;
	private JTextField textField_E98;
	private JTextField textField_Diesel;
	private JButton btnNewButton;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JTextField textField_3;
	private JButton btnNewButton_95;
	private JButton btnNewButton_98;
	private JButton btnNewButton_Diesel;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_10;

	/**
	 * Create the dialog.
	 */
	public OstoIkkuna() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/Recources/gas-station.png"));
		setTitle("Asiakkaan oston\u00E4kym\u00E4");
		setBounds(100, 100, 801, 550);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 783, 477);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);

		btnNewButton = new JButton("Peruuta ostotapahtuma");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "Haluatko poistua tankilta? Bensa j‰‰ saamatta!",
						"Varoitus!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
				if (result == JOptionPane.YES_OPTION) {
					System.out.println("OK painettu, ikkuna suljettu");
					System.exit(0);
				}
				if (result == JOptionPane.NO_OPTION) {
					System.out.println("No painettu, ohjelma pyˆrii");
					setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				}

			}
		});

		btnNewButton_95 = new JButton("Laske");
		btnNewButton_95.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double asiakasraha1 = 0, litrahinta2 = 1.40, tulos = 0;
				vahvistusNappi.setEnabled(true);
				try {
					asiakasraha1 = Double.parseDouble(textField_E95.getText());
//					luku2 = Double.parseDouble(textField_E95.getText());
//					luku2 = lueTiedostosta(filename5);
//					String teksti = lueTiedostosta2(filename2);
//					litrahinta2 = Double.parseDouble(filename2);
//					lueTiedostosta(filename2);

					tulos = asiakasraha1 * litrahinta2;
//					tulostaTiedostoon1(textField_E95.getText(), filename1);
//					tulostaTiedostoon1("Tankkaus rahasummalla: " + luku1 + "yhteens‰ " + luku2 + "litraa ");
					textField_3.setText(Double.toString(tulos));
				} catch (Exception args0) {
					JOptionPane.showMessageDialog(null, "Kirjoita numero!!", "Error", JOptionPane.ERROR_MESSAGE);
				}
				if (asiakasraha1 <= 9 || asiakasraha1 >= 201) {
					JOptionPane.showMessageDialog(null,
							"Raham‰‰r‰ ei voi olla pienempi kuin 10 tai suurempi kuin 200!");
					vahvistusNappi.setEnabled(false);
					textField_3.setText(" ");
				}
				if (checkBoxE95.isSelected()) {
					tulostaTiedostoon1(
							"Tankkaus rahasummalla : " + asiakasraha1 + " Ä yhteens‰ : " + tulos + " litraa ",
							filename1);
					tulostaTiedostoon5("Bensaa tankattu : -" + tulos + " litraa ", filename5);
				}
			}
		});

		btnNewButton_Diesel = new JButton("Laske");
		btnNewButton_Diesel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double asiakasraha1 = 0, litrahinta2 = 1.20, tulos = 0;
				vahvistusNappi.setEnabled(true);
				try {
					asiakasraha1 = Double.parseDouble(textField_Diesel.getText());
//					luku2 = Double.parseDouble(textField_Diesel.getText());
//					luku2 = lueTiedostosta(filename7);
//					litrahinta2 = Double.parseDouble(filename7);
//					litrahinta2 = lueTiedostosta(filename7);

					tulos = asiakasraha1 * litrahinta2;
//					tulostaTiedostoon1(textField_Diesel.getText(), filename1);
//					tulostaTiedostoon1("Tankkaus rahasummalla: " + luku1 + "yhteens‰ " + luku2 + "litraa ");
					textField_3.setText(Double.toString(tulos));
				} catch (Exception args0) {
					JOptionPane.showMessageDialog(null, "Kirjoita numero!!", "Error", JOptionPane.ERROR_MESSAGE);
				}
				if (asiakasraha1 <= 9 || asiakasraha1 >= 201) {
					JOptionPane.showMessageDialog(null,
							"Raham‰‰r‰ ei voi olla pienempi kuin 10 tai suurempi kuin 200!");
					vahvistusNappi.setEnabled(false);
					textField_3.setText(" ");
				}
				if (checkBoxDiesel.isSelected()) {
					tulostaTiedostoon1(
							"Tankkaus rahasummalla : " + asiakasraha1 + " Ä yhteens‰ : " + tulos + " litraa ",
							filename1);
					        tulostaTiedostoon7("Bensaa tankattu : -" + tulos + " litraa ", filename7);
				}
			}

		});

		lblNewLabel_10 = new JLabel("\u20AC");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_10.setBounds(501, 288, 21, 16);
		contentPanel.add(lblNewLabel_10);

		lblNewLabel_7 = new JLabel("\u20AC");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_7.setBounds(501, 228, 21, 16);
		contentPanel.add(lblNewLabel_7);

		lblNewLabel_6 = new JLabel("\u20AC");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(501, 170, 21, 16);
		contentPanel.add(lblNewLabel_6);

		lblNewLabel_5 = new JLabel("litraa");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(501, 347, 76, 16);
		contentPanel.add(lblNewLabel_5);
		btnNewButton_Diesel.setBounds(542, 284, 76, 25);
		contentPanel.add(btnNewButton_Diesel);

		btnNewButton_98 = new JButton("Laske");
		btnNewButton_98.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double asiakasraha1 = 0, litrahinta2 = 1.52, tulos = 0;
				vahvistusNappi.setEnabled(true);
				try {
					asiakasraha1 = Double.parseDouble(textField_E98.getText());
//					luku2 = Double.parseDouble(textField_E98.getText());
//					luku2 = lueTiedostosta(filename5);
//					litrahinta2 = Double.parseDouble(filename6);
//					lueTiedostosta(filename6);

					tulos = asiakasraha1 * litrahinta2;
//					tulostaTiedostoon1(textField_E95.getText(), filename1);
//					tulostaTiedostoon1("Tankkaus rahasummalla: " + luku1 + "yhteens‰ " + luku2 + "litraa ");
					textField_3.setText(Double.toString(tulos));
				} catch (Exception args0) {
					JOptionPane.showMessageDialog(null, "Kirjoita numero!!", "Error", JOptionPane.ERROR_MESSAGE);
				}
				if (asiakasraha1 <= 9 || asiakasraha1 >= 201) {
					JOptionPane.showMessageDialog(null,
							"Raham‰‰r‰ ei voi olla pienempi kuin 10 tai suurempi kuin 200!");
					vahvistusNappi.setEnabled(false);
					textField_3.setText(" ");
				}
				if (checkBoxE98.isSelected()) {
					tulostaTiedostoon1(
							"Tankkaus rahasummalla : " + asiakasraha1 + " Ä yhteens‰ : " + tulos + " litraa ",
							filename1);
					tulostaTiedostoon6("Bensaa tankattu : -" + tulos + " litraa ", filename6);
				}
			}
		});
		btnNewButton_98.setBounds(542, 224, 76, 25);
		contentPanel.add(btnNewButton_98);

		btnNewButton_95.setBounds(542, 166, 76, 25);
		contentPanel.add(btnNewButton_95);

		textField_3 = new JTextField();
		textField_3.setBounds(404, 344, 87, 22);
		contentPanel.add(textField_3);
		textField_3.setColumns(10);
		textField_3.setEditable(false);

		lblNewLabel_9 = new JLabel("& sy\u00F6t\u00E4 raham\u00E4\u00E4r\u00E4 jolla tankataan:");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_9.setBounds(225, 115, 400, 25);
		contentPanel.add(lblNewLabel_9);

		lblNewLabel_8 = new JLabel("Polttoaineen laskettu m\u00E4\u00E4r\u00E4:");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_8.setBounds(179, 347, 225, 16);
		contentPanel.add(lblNewLabel_8);

		btnNewButton.setBounds(196, 389, 182, 25);
		contentPanel.add(btnNewButton);

		textField_E98 = new JTextField();
		textField_E98.setBounds(404, 225, 85, 22);
		contentPanel.add(textField_E98);
		textField_E98.setColumns(10);

		textField_Diesel = new JTextField();
		textField_Diesel.setBounds(404, 285, 85, 22);
		contentPanel.add(textField_Diesel);
		textField_Diesel.setColumns(10);

		textField_E95 = new JTextField();
		textField_E95.setBounds(404, 167, 85, 22);
		contentPanel.add(textField_E95);
		textField_E95.setColumns(10);

		lblNewLabel = new JLabel("Valitse tankattavan polttoaineen tyyppi");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel.setBounds(225, 90, 400, 25);
		contentPanel.add(lblNewLabel);

		vahvistusNappi = new JButton("Vahvista osto");
		vahvistusNappi.addActionListener(new ActionListener() {
			private KuittiIkkuna KuittiIkkuna;

			public void actionPerformed(ActionEvent e) {
			
				if (textField_3.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Et ole laskenut polttoaineen hintaa!!", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
				 else {
					 JOptionPane.showMessageDialog(null, "Tankkaus onnistui!");
//					    PaaIkkuna.setVisible(false);
						OstoIkkuna.this.dispose();
						KuittiIkkuna = new KuittiIkkuna();
						KuittiIkkuna.setVisible(true);
				} 
			}
		});

		vahvistusNappi.setBounds(444, 389, 175, 25);
		contentPanel.add(vahvistusNappi);

		lblNewLabel_2 = new JLabel("E95");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(201, 167, 56, 16);
		contentPanel.add(lblNewLabel_2);

		lblNewLabel_3 = new JLabel("E98");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(201, 225, 56, 16);
		contentPanel.add(lblNewLabel_3);

		lblNewLabel_4 = new JLabel("Diesel");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(201, 285, 56, 16);
		contentPanel.add(lblNewLabel_4);

		checkBoxE95 = new JCheckBox("Valitse E95");

		checkBoxE95.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (checkBoxE95.isSelected()) {
					checkBoxE98.setEnabled(false);
					checkBoxDiesel.setEnabled(false);
					textField_E98.setEditable(false);
					textField_Diesel.setEditable(false);
					btnNewButton_98.setEnabled(false);
					btnNewButton_Diesel.setEnabled(false);
				}
				else {
					JOptionPane.showMessageDialog(null, "Merkitse checkBox valituksi!!", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		checkBoxE95.setBounds(265, 166, 113, 25);
		contentPanel.add(checkBoxE95);

		checkBoxE98 = new JCheckBox("Valitse E98");
		checkBoxE98.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (checkBoxE98.isSelected()) {
					checkBoxE95.setEnabled(false);
					checkBoxDiesel.setEnabled(false);
					textField_E95.setEditable(false);
					textField_Diesel.setEditable(false);
					btnNewButton_95.setEnabled(false);
					btnNewButton_Diesel.setEnabled(false);
				}
				else {
					JOptionPane.showMessageDialog(null, "Merkitse checkBox valituksi!!", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		checkBoxE98.setBounds(265, 224, 113, 25);
		contentPanel.add(checkBoxE98);

		checkBoxDiesel = new JCheckBox("Valitse Diesel");
		checkBoxDiesel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkBoxDiesel.isSelected()) {
					checkBoxE95.setEnabled(false);
					checkBoxE98.setEnabled(false);
					textField_E95.setEditable(false);
					textField_E98.setEditable(false);
					btnNewButton_95.setEnabled(false);
					btnNewButton_98.setEnabled(false);
				}
				else {
					JOptionPane.showMessageDialog(null, "Merkitse checkBox valituksi!!", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		checkBoxDiesel.setBounds(265, 284, 113, 25);
		contentPanel.add(checkBoxDiesel);

		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(156, 57, 499, 363);
		contentPanel.add(lblNewLabel_1);

		Pic = new JLabel("");
		Pic.setBounds(0, 0, 782, 480);
		//Pic.setIcon(new ImageIcon("src/Recources/enter-pin-message-on-gas-260nw-1543148804 (2).png", "Kuva"));
		Pic.setIcon(new ImageIcon(new ImageIcon("src/Recources/enter-pin-message-on-gas-260nw-1543148804 (2).png").getImage().getScaledInstance(800, 500, Image.SCALE_DEFAULT)));
		contentPanel.add(Pic);

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		Valikko = new JMenu("Valikko");
		menuBar.add(Valikko);

		mntmNewMenuItem = new JMenuItem("Poistu");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int result = JOptionPane.showConfirmDialog(null, "Haluatko poistua tankilta? Bensa j‰‰ saamatta!",
						"Varoitus!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
				if (result == JOptionPane.YES_OPTION) {
					System.out.println("OK painettu, ikkuna suljettu");
					System.exit(0);
				}
				if (result == JOptionPane.NO_OPTION) {
					System.out.println("No painettu, ohjelma pyˆrii");
					setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				}

			}
		});
		Valikko.add(mntmNewMenuItem);

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

	public void tulostaTiedostoon1(String txt, String filename1) {
		String filename = "src/Recources/kuitti.txt";
		try {
			new FileWriter("src/Recources/kuitti.txt", false).close();
			java.util.Date date = new java.util.Date();
			FileWriter fwriter = new FileWriter(filename1, true);
			fwriter.write(date.toString() + "\n");
			fwriter.write(txt + "\n");
			fwriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void tulostaTiedostoon(double vastaus) {
		String filename1 = "src/Recources/kuitti.txt";
		try {
			new FileWriter("src/Recources/kuitti.txt", false).close();
			java.util.Date date = new java.util.Date();
			FileWriter fwriter = new FileWriter(filename1, true);
			fwriter.write(date.toString() + "\n");
			fwriter.write(filename1 + "\n");
			fwriter.close();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public void tulostaTiedostoon5(String txt, String filename5) {
		String filename = "src/Recources/tankkiE95.txt";
		try {
			java.util.Date date = new java.util.Date();
			FileWriter fwriter = new FileWriter(filename5, true);
			fwriter.write(date.toString() + "\n");
			fwriter.write(txt + "\n");
			fwriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void tulostaTiedostoon5(double vastaus) {
		String filename5 = "src/Recources/tankkiE95.txt";
		try {
			java.util.Date date = new java.util.Date();
			FileWriter fwriter = new FileWriter(filename5, true);
			fwriter.write(date.toString() + "\n");
			fwriter.write(filename5 + "\n");
			fwriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void tulostaTiedostoon6(String txt, String filename6) {
		String filename = "src/Recources/tankkiE98.txt";
		try {
			java.util.Date date = new java.util.Date();
			FileWriter fwriter = new FileWriter(filename6, true);
			fwriter.write(date.toString() + "\n");
			fwriter.write(txt + "\n");
			fwriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void tulostaTiedostoon6(double vastaus) {
		String filename6 = "src/Recources/tankkiE98.txt";
		try {
			java.util.Date date = new java.util.Date();
			FileWriter fwriter = new FileWriter(filename6, true);
			fwriter.write(date.toString() + "\n");
			fwriter.write(filename6 + "\n");
			fwriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void tulostaTiedostoon7(String txt, String filename7) {
		String filename = "src/Recources/tankkiDiesel.txt";
		try {
			java.util.Date date = new java.util.Date();
			FileWriter fwriter = new FileWriter(filename7, true);
			fwriter.write(date.toString() + "\n");
			fwriter.write(txt + "\n");
			fwriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void tulostaTiedostoon7(double vastaus) {
		String filename7 = "src/Recources/tankkiDiesel.txt";
		try {
			java.util.Date date = new java.util.Date();
			FileWriter fwriter = new FileWriter(filename7, true);
			fwriter.write(date.toString() + "\n");
			fwriter.write(filename7 + "\n");
			fwriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
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

	public String lueTiedostosta5(String filename5) {
		String alltext = " ";

		try {
			FileReader freader = new FileReader(filename5);
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
public String lueTiedostosta6(String filename6) {
	String alltext = " ";

	try {
		FileReader freader = new FileReader(filename6);
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
