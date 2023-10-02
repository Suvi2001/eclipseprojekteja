import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PaaIkkuna extends JFrame {

	private JPanel contentPane;
	private JButton Nappi_Kirjoita;
	private JButton Nappi_Lue;
	private JTextArea textArea1;
	private JTextArea textArea2;

	String filename = "src/Recources/myfile.txt";

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

		Nappi_Kirjoita = new JButton("Kirjoita tiedostoon");
		Nappi_Kirjoita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                kirjoitaTiedostoon(textArea2.getText(), filename);
			}
		});
		Nappi_Kirjoita.setBounds(245, 215, 156, 25);
		contentPane.add(Nappi_Kirjoita);

		Nappi_Lue = new JButton("Lue tiedostosta");
		Nappi_Lue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String teksti = lueTiedostosta(filename);
				textArea1.setText(teksti);
			}
		});
		Nappi_Lue.setBounds(30, 215, 150, 25);
		contentPane.add(Nappi_Lue);

		textArea1 = new JTextArea();
		textArea1.setBounds(30, 42, 150, 148);
		contentPane.add(textArea1);

		textArea2 = new JTextArea();
		textArea2.setBounds(245, 42, 156, 148);
		contentPane.add(textArea2);
	}
    // tiedostosta lukemisen metodi
	public String lueTiedostosta(String filename) {
		String alltext = " ";
		
		try  {
			 FileReader freader = new FileReader(filename);
			 BufferedReader br = new BufferedReader(freader);
			 String line;
			 while ((line = br.readLine()) != null) {
				 alltext = alltext + line + "\n";
			 }
    // catchiss‰ n‰ytet‰‰n miss‰ kohtaa meni pieleen
		} catch (Exception e) {
			 e.printStackTrace();
			 alltext = " ";
			 }
			 return alltext;
	}
	// tiedostoon kirjoituksen metodi
	// sininen n-kirjain tarkoittaa new line, eli kirjoitettu teksti tulostuu omalle riville p‰iv‰m‰‰r‰n alle
	public void kirjoitaTiedostoon(String txt, String filename) {
		try  {
		     java.util.Date date = new java.util.Date();
			 FileWriter fwriter = new FileWriter(filename, true);
			 // valinta true aiheuttaa sen, ett‰ p‰iv‰m‰‰r‰ tulee koodin per‰‰n eik‰ muuta koodia ylikirjoiteta sill‰
			 fwriter.write(date.toString() + "\n");
			 fwriter.write(txt + "\n");
			 fwriter.close();
		} catch (Exception e) {
				 e.printStackTrace();
			 }
}
}