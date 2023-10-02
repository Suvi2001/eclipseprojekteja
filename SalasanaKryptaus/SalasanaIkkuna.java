import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.awt.event.ActionEvent;

public class SalasanaIkkuna extends JFrame {

	private JPanel contentPane;
	private JTextField textField1;
	private JTextField textField2;
	private JLabel label1;
	private JLabel label2;
	private JButton nappi1;

	private OhjelmaIkkuna ohjelmaikkuna = new OhjelmaIkkuna();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SalasanaIkkuna frame = new SalasanaIkkuna();
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
	public SalasanaIkkuna() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField1 = new JTextField();
		textField1.setBounds(156, 67, 163, 20);
		contentPane.add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(156, 107, 163, 20);
		contentPane.add(textField2);
		textField2.setColumns(10);
		
		label1 = new JLabel("K\u00E4ytt\u00E4j\u00E4tunnus");
		label1.setBounds(58, 70, 112, 14);
		contentPane.add(label1);
		
		label2 = new JLabel("Salasana");
		label2.setBounds(58, 110, 112, 14);
		contentPane.add(label2);
		
		nappi1 = new JButton("Kirjaudu");
		nappi1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					//Oikean salasanan crytaus
					String oikea_kayttajatunnus = "oranssi";
					String oikea_salasana = crypt("porkkana"); // t‰m‰ tulisi oikeasti esim. tietokannasta!! 
					
					//System.out.println(oikea_salasana);
					
					String salasana_crypted="";
					
					try {
						salasana_crypted = crypt(textField2.getText());
					} catch (Exception e) {
					}
					
					if(textField1.getText().equals(oikea_kayttajatunnus) && oikea_salasana.equals(salasana_crypted)) {
						SalasanaIkkuna.this.setVisible(false);
						//SalasanaIkkuna.this.dispose();  // Tai edellisen sijasta t‰m‰kin olisi mahdollinen
						ohjelmaikkuna.setVisible(true);
						
					}
					else {
						JOptionPane.showMessageDialog(null, "V‰‰r‰ salasana!");
					}
				
			}
		});
		nappi1.setBounds(156, 176, 163, 23);
		contentPane.add(nappi1);
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
