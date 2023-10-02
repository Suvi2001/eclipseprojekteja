import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PaaIkkuna extends JFrame {

	private JPanel contentPane;
	private JButton Nappi1;
	private JButton Nappi2;
	private JButton Nappi3;
	private JButton Nappi4;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Nappi1 = new JButton("1. N\u00E4yt\u00E4 message");
		Nappi1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Väärä salasana");
				
			}
		});
		Nappi1.setBounds(12, 32, 173, 25);
		contentPane.add(Nappi1);
		
		Nappi2 = new JButton("2. N\u00E4yt\u00E4 message");
		Nappi2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = createImageIcon ("img/dice-icon-png-12.jpg");
				JOptionPane.showMessageDialog(null, "Älä arvo, väärä salasana!", "Pääsy estetty!", JOptionPane.WARNING_MESSAGE);
			}
		});
		Nappi2.setBounds(12, 88, 173, 25);
		contentPane.add(Nappi2);
		
		Nappi3 = new JButton("3. N\u00E4yt\u00E4 message");
		Nappi3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(null, "lopetetaanko?");		
			}
		});
		Nappi3.setBounds(12, 144, 173, 25);
		contentPane.add(Nappi3);
		
		Nappi4 = new JButton("4. N\u00E4yt\u00E4 message");
		Nappi4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "Haluatko varmasti lopettaa?", "Lopetus?", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
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
		
		Nappi4.setBounds(12, 200, 173, 25);
		contentPane.add(Nappi4);
	}

	/** Returns an ImageIcon, or null if the path was invalid. **/
	protected ImageIcon createImageIcon(String path) {
		java.net.URL imgURL = getClass().getResource(path);
		if (imgURL != null) {
			ImageIcon icon = new ImageIcon(imgURL, null);
			return icon;
	} else {
		System.out.println("Couldn't find file: " +path);
		return null;
	}
  }}
