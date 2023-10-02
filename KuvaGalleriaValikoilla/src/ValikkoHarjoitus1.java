import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ValikkoHarjoitus1 extends JFrame {
	
	private JPanel contentPane;
	private JLabel Pic;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenu mnNewMenu_2;
	private JMenu mnNewMenu_1;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JMenuItem mntmNewMenuItem_5;
	
	String [] list = { "img/amywinehouse92929.jpg", // 0
			"img/kissakuvawoop.jpg", //1
			"img/lanadelrey.jpg", //2
	};
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ValikkoHarjoitus1 frame = new ValikkoHarjoitus1();
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
	public ValikkoHarjoitus1() {
		setTitle("Valikkoikkuna");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("Amy Winehouse ja kissa");
		menuBar.add(mnNewMenu);
		
		mntmNewMenuItem_1 = new JMenuItem("Amy Winehouse");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			ImageIcon icon = createImageIcon (list [0], "Amy Winehouse");
			Pic.setIcon (icon);
					
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		mntmNewMenuItem_2 = new JMenuItem("Kissa");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = createImageIcon (list [1], "Kissa");
				Pic.setIcon (icon);
						
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		
		mnNewMenu_1 = new JMenu("Lana Del Rey");
		menuBar.add(mnNewMenu_1);
		
		mnNewMenu_2 = new JMenu("Valitse alivalikosta");
		mnNewMenu_1.add(mnNewMenu_2);
		
		mntmNewMenuItem_5 = new JMenuItem("Lana Del Rey");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = createImageIcon (list [2], "Lana Del Rey");
				Pic.setIcon (icon);
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_5);
		
		mntmNewMenuItem_5 = new JMenuItem("Lana Del Rey");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = createImageIcon (list [2], "Lana Del Rey");
				Pic.setIcon (icon);
			}
		});
		
		Pic = new JLabel("");
		Pic.setBounds(53, 13, 327, 189);
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
        }}
}
