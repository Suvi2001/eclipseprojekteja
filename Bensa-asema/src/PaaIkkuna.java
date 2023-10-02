import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

import javax.swing.ImageIcon;
import javax.swing.JButton;
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

public class PaaIkkuna extends JFrame {

	private JPanel contentPane;

	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenu mnNewMenu_1;
	private JLabel Pic;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;

	private JTextField textField_E95;
	private JTextField textField_E98;
	private JTextField textField_Diesel;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel otsikkoTeksti;

	private OstoIkkuna ostoIkkuna = new OstoIkkuna();

	String filename = "src/Recources/enter-pin-message-on-gas-260nw-1543148804 (2).png";
    String filename1 = "src/Recources/E95.txt";
    String filename2 = "src/Recources/E98.txt";
    String filename3 = "src/Recources/Diesel.txt";

	private JButton eteenpainNappi;
	private JButton poistuNappi;

	protected Reader freader;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/Recources/gas-station.png"));
		setTitle("Tervetuloa ostoksille!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 550);

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		mnNewMenu = new JMenu("Valikko");
		menuBar.add(mnNewMenu);

		mntmNewMenuItem = new JMenuItem("Poistu");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "Haluatko varmasti poistua tankilta?", "Varmistus",
						JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
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
		mnNewMenu.add(mntmNewMenuItem);

		mnNewMenu_1 = new JMenu("Yll\u00E4pito");
		menuBar.add(mnNewMenu_1);

		mntmNewMenuItem_1 = new JMenuItem("Yll\u00E4pidon Kirjautuminen");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Tänne pääsee vain ylläpito.", "Pääsy estetty!",
						JOptionPane.WARNING_MESSAGE);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField_E95 = new JTextField();
		textField_E95.setEditable(false);
		textField_E95.setBounds(289, 101, 116, 22);
		
		lblNewLabel_6 = new JLabel("\u20AC/l");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(543, 308, 56, 16);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_5 = new JLabel("\u20AC/l");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(543, 234, 56, 16);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_4 = new JLabel("\u20AC/l");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(543, 159, 56, 16);
		contentPane.add(lblNewLabel_4);
		
		textField_E95 = new JTextField();
		textField_E95.setBounds(371, 153, 139, 22);
		contentPane.add(textField_E95);
		textField_E95.setColumns(10);

		textField_E98 = new JTextField();
		textField_E98.setBounds(371, 228, 139, 22);
		contentPane.add(textField_E98);
		textField_E98.setColumns(10);
		textField_E98.setEditable(false);

		textField_Diesel = new JTextField();
		textField_Diesel.setBounds(371, 308, 139, 22);
		contentPane.add(textField_Diesel);
		textField_Diesel.setColumns(10);
		textField_Diesel.setEditable(false);

		lblNewLabel = new JLabel("E95");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(272, 153, 56, 16);

		contentPane.add(lblNewLabel);
		textField_E95.setEditable(false);

		lblNewLabel_1 = new JLabel("E98");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(272, 228, 56, 16);
		contentPane.add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel("Diesel");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(272, 308, 56, 16);
		textField_E95.setEditable(false);
		contentPane.add(lblNewLabel_2);

		otsikkoTeksti = new JLabel("Dieselin ja bensiinin hinnat t\u00E4n\u00E4\u00E4n:");
		otsikkoTeksti.setHorizontalAlignment(SwingConstants.CENTER);
		otsikkoTeksti.setFont(new Font("Tahoma", Font.PLAIN, 23));
		otsikkoTeksti.setBounds(203, 84, 430, 37);
		contentPane.add(otsikkoTeksti);

		eteenpainNappi = new JButton("Tankkaukseen >");
		eteenpainNappi.addActionListener(new ActionListener() {
			private OstoIkkuna OstoIkkuna;

			public void actionPerformed(ActionEvent arg0) {
//				PaaIkkuna.this.dispose();
				OstoIkkuna = new OstoIkkuna();
				OstoIkkuna.setModal(true);
				OstoIkkuna.setVisible(true);
			}
		});
		eteenpainNappi.setBounds(474, 378, 147, 25);
		contentPane.add(eteenpainNappi);

		poistuNappi = new JButton("Poistu");
		poistuNappi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				int result = JOptionPane.showConfirmDialog(null, "Haluatko varmasti poistua tankilta?", "Varmistus",
						JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
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
		poistuNappi.setBounds(203, 378, 150, 25);
		contentPane.add(poistuNappi);
		

		String teksti = lueTiedostosta1(filename1);
		String teksti1 = lueTiedostosta2(filename2);
		String teksti2 = lueTiedostosta3(filename3);

		textField_E95.setText(teksti);
		textField_E98.setText(teksti1);
		textField_Diesel.setText(teksti2);

		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setBackground(Color.WHITE);
		lblNewLabel_3.setBounds(156, 57, 499, 363);
		contentPane.add(lblNewLabel_3);

		Pic = new JLabel("");
		Pic.setBounds(0, 0, 782, 480);
		//Pic.setIcon(new ImageIcon("src/Recources/enter-pin-message-on-gas-260nw-1543148804 (2).png", "Kuva"));
		Pic.setIcon(new ImageIcon(new ImageIcon("src/Recources/enter-pin-message-on-gas-260nw-1543148804 (2).png").getImage().getScaledInstance(800, 500, Image.SCALE_DEFAULT)));
		contentPane.add(Pic);
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
	public String lueTiedostosta1(String filename1) {
		String alltext = " ";

		try {
			FileReader freader = new FileReader(filename1);
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
	public String lueTiedostosta2(String filename2) {
		String alltext = " ";

		try {
			FileReader freader = new FileReader(filename2);
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
	public String lueTiedostosta3(String filename3) {
		String alltext = " ";

		try {
			FileReader freader = new FileReader(filename3);
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
}
