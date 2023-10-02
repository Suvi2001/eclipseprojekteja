import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class PaaIkkuna extends JFrame {

	private JPanel contentPane;
	private JButton Nappi1paaIkkuna;
	private JButton Nappi2paaIkkuna;
	
	private Ikkuna1 ikkuna1 = new Ikkuna1();
	// T‰m‰ ikkuna on ali-ikkuna, joka aukeaa vain t‰m‰n p‰‰ikkunan kautta. T‰ss‰ se m‰‰ritell‰‰n.
	private Ikkuna2 ikkuna2 = new Ikkuna2();
	public static JLabel Label1;
	private JLabel Label2;
	private JButton tekstiHaku;
	public static JTextField textField;

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
		setTitle("P\u00E4\u00E4Ikkuna");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Nappi1paaIkkuna = new JButton("Avaa Ikkuna1");
		Nappi1paaIkkuna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ikkuna1.dispose();
				ikkuna1 = new Ikkuna1();
	    // ylempi koodip‰tk‰ tyhjent‰‰ Ikkuna1 tekstikentt‰‰n syˆtetyt tiedot kun se suljetaan ja avataan uudestaan
				ikkuna1.setVisible(true);
			}
		});
		Nappi1paaIkkuna.setBounds(156, 30, 122, 23);
		contentPane.add(Nappi1paaIkkuna);
		
		Nappi2paaIkkuna = new JButton("Avaa Ikkuna2");
		Nappi2paaIkkuna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ikkuna2.dispose();
				ikkuna2 = new Ikkuna2();
				ikkuna2.setModal(true);
				ikkuna2.setVisible(true);
			}
    });
		Nappi2paaIkkuna.setBounds(156, 66, 122, 23);
		contentPane.add(Nappi2paaIkkuna);
		
		Label1 = new JLabel("Nimi on Suvi");
		Label1.setHorizontalAlignment(SwingConstants.CENTER);
		Label1.setBounds(156, 102, 122, 16);
		contentPane.add(Label1);
		
		Label2 = new JLabel("");
		Label2.setHorizontalAlignment(SwingConstants.CENTER);
		Label2.setBounds(100, 179, 231, 16);
   	    contentPane.add(Label2);
		
		textField = new JTextField();
		textField.setBounds(100, 208, 231, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel Label2 = new JLabel("");
		Label2.setHorizontalAlignment(SwingConstants.CENTER);
		Label2.setBounds(100, 213, 231, 16);
		contentPane.add(Label2);
		
		JButton tekstiHaku = new JButton("Hae teksti ikkunasta 1");
		tekstiHaku.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Label2.setText(ikkuna1.textField.getText());
		// luetaan tietoa ali-ikkunan 1 tekstikent‰st‰ p‰‰ikkunaan tyhj‰‰n jlabeliin nappia painatessa
		// ikkuna1 textfieldist‰ tehtiin public ett‰ setterit ja getterit toimii
			}
		});
		tekstiHaku.setBounds(100, 162, 231, 25);
		contentPane.add(tekstiHaku);
}
}
