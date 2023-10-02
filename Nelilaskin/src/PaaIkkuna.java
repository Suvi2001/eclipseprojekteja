import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import java.io.FileWriter;

public class PaaIkkuna extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;
	private JTextField txtLuku1;
	private JTextField txtLuku2;
	private JButton plusNappi;
	private JButton kertoNappi;
	private JButton miinusNappi;
	private JButton jakoNappi;
	private JTextField tulosField;
	private JMenuItem mntmNewMenuItem_1;
	private JLabel lblLuku1;
	private JLabel lblLuku2;
	private JLabel lblTulos;

	String filename = "src/Recources/nelilaskin.txt";

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
		setTitle("Nelilaskin.java");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 500);

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		mnNewMenu = new JMenu("Valikko");
		menuBar.add(mnNewMenu);

		mntmNewMenuItem = new JMenuItem("Tyhjenn\u00E4");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtLuku1.setText(" ");
				txtLuku2.setText(" ");
				tulosField.setText(" ");
			}
		});

		mnNewMenu.add(mntmNewMenuItem);

		mntmNewMenuItem_1 = new JMenuItem("Lopeta");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
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
		mnNewMenu.add(mntmNewMenuItem_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtLuku1 = new JTextField();
		txtLuku1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		txtLuku1.setBounds(178, 41, 122, 22);
		contentPane.add(txtLuku1);
		txtLuku1.setColumns(10);

		txtLuku2 = new JTextField();
		txtLuku2.setColumns(10);
		txtLuku2.setBounds(178, 123, 122, 22);
		contentPane.add(txtLuku2);

		plusNappi = new JButton("+");
		plusNappi.setFont(new Font("Tahoma", Font.BOLD, 25));
		plusNappi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int luku1, luku2, vastaus;
				try {
					luku1 = Integer.parseInt(txtLuku1.getText());
					luku2 = Integer.parseInt(txtLuku2.getText());

					vastaus = luku1 + luku2;
					tulostaTiedostoon(vastaus);
					tulosField.setText(Integer.toString(vastaus));
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Kirjoita numero!!", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}

		});
		plusNappi.setBounds(88, 268, 76, 61);
		contentPane.add(plusNappi);

		kertoNappi = new JButton("*");
		kertoNappi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double luku1, luku2, vastaus;
				try {
					luku1 = Double.parseDouble(txtLuku1.getText());
					luku2 = Double.parseDouble(txtLuku2.getText());

					vastaus = luku1 * luku2;
					tulostaTiedostoon(vastaus);
					tulosField.setText(Double.toString(vastaus));
				} catch (Exception args0) {
					JOptionPane.showMessageDialog(null, "Kirjoita numero!!", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		kertoNappi.setFont(new Font("Tahoma", Font.BOLD, 25));
		kertoNappi.setBounds(88, 353, 76, 61);
		contentPane.add(kertoNappi);

		miinusNappi = new JButton("-");
		miinusNappi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int luku1, luku2, vastaus;
				try {
					luku1 = Integer.parseInt(txtLuku1.getText());
					luku2 = Integer.parseInt(txtLuku2.getText());

					vastaus = luku1 - luku2;
					tulostaTiedostoon(vastaus);
					tulosField.setText(Integer.toString(vastaus));
				} catch (Exception args0) {
					JOptionPane.showMessageDialog(null, "Kirjoita numero!!", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}

		});
		miinusNappi.setFont(new Font("Tahoma", Font.BOLD, 25));
		miinusNappi.setBounds(224, 268, 76, 61);
		contentPane.add(miinusNappi);

		jakoNappi = new JButton("/");
		jakoNappi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double luku1 = 0, luku2 = 0, vastaus = 0;
				try {
					luku1 = Double.parseDouble(txtLuku1.getText());
					luku2 = Double.parseDouble(txtLuku2.getText());

					vastaus = luku1 / luku2;
					tulostaTiedostoon(vastaus);
					tulosField.setText(Double.toString(vastaus));
				} catch (Exception args0) {
					JOptionPane.showMessageDialog(null, "Kirjoita numero!!", "Error", JOptionPane.ERROR_MESSAGE);
				}
				if (luku1 == 0 || luku2 == 0) {
					tulosField.setText("Nollalla ei voi jakaa");
					System.out.println ("Mää nään sut Tommi");
					tulostaTiedostoon(vastaus);
				}
			}
		});
		jakoNappi.setFont(new Font("Tahoma", Font.BOLD, 25));
		jakoNappi.setBounds(224, 353, 76, 61);
		contentPane.add(jakoNappi);

		tulosField = new JTextField();
		tulosField.setColumns(10);
		tulosField.setBounds(178, 203, 122, 22);
		contentPane.add(tulosField);

		lblLuku1 = new JLabel("Luku1");
		lblLuku1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLuku1.setBounds(88, 43, 56, 16);
		contentPane.add(lblLuku1);

		lblLuku2 = new JLabel("Luku2");
		lblLuku2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLuku2.setBounds(88, 125, 56, 16);
		contentPane.add(lblLuku2);

		lblTulos = new JLabel("Tulos:");
		lblTulos.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTulos.setBounds(88, 205, 56, 16);
		contentPane.add(lblTulos);
	}

	public void tulostaTiedostoon(int vastaus) {
		String filename = "src/Recources/nelilaskin.txt";
		try {
			java.util.Date date = new java.util.Date();
			FileWriter fwriter = new FileWriter(filename, true);
			fwriter.write(date.toString() + "\n");
			fwriter.write(vastaus + "\n");
			fwriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		public void tulostaTiedostoon(double vastaus) {
			String filename = "src/Recources/nelilaskin.txt";
			try {
				java.util.Date date = new java.util.Date();
				FileWriter fwriter = new FileWriter(filename, true);
				fwriter.write(date.toString() + "\n");
				fwriter.write(vastaus + "\n");
				fwriter.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
}