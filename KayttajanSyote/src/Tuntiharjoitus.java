import java.util.Scanner;

public class Tuntiharjoitus {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String vastaus;
		int vastausInt;
		Double vastausDouble;
		String tulos;
		
//	    System.out.println("Kirjoita jotain");
//	    Luetaan rivi konsolista ja sijoitetaan se vastaus muuttujaan
//	    vastaus = input.nextLine();
//	    
//	    System.out.println("vastaus on" + vastaus);
//	    
//	    if  (vastaus.equals("Moi")) {
//	    System.out.println("No moi moi!");
//	    }
	    
	    System.out.println("Anna jokin numero, kerron sen kymmenellä");
	    vastaus = input.nextLine();
	    
	    vastausInt = Integer.parseInt(vastaus);
	    vastausDouble = Double.parseDouble(vastaus);
	    
	    System.out.println("Kirjoita luku");
		vastausInt = input.nextInt();
		System.out.println(vastausInt);

	 // Scannerin sulkeminen, ettei tule varoitusta. Ei ole väliä, jos ei muista.
	 		input.close();
	}

}
