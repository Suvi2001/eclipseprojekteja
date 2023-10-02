import java.util.Scanner;

public class Hissiapp {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String vastaus;

		Hissi hissi = new Hissi();
		// hissi.kerros = -100;
		// hissi.tulostaTiedot();

		hissi.setKerros(200);
		System.out.println("Hissin kerros on " + hissi.getKerros());

		do {
			System.out.println("y/a/p");
			vastaus = in.nextLine();
			if (vastaus.equals("y") || vastaus.equals("a")) {
				hissi.meneYlosAlas(vastaus);
			}
		} while (!vastaus.equals("p"));
		
	}

} // HissiApp-luokan lopetus

class Hissi { // luokka

	private int kerros;
	private int minKerros;
	private int maxKerros;

	// kerroksen setteri
	public void setKerros(int haluttuKerros) {
		// yksinkertainen validointi
		if (haluttuKerros >= minKerros && haluttuKerros <= maxKerros) {
			kerros = haluttuKerros;
		}
		else
		{
			System.out.println("Hissi pysähtyi");
		}
	}

	// kerroksen getteri
	public int getKerros() {
		return kerros;
	}

	public Hissi() { // oletuskontruktori
		kerros = 1;
		minKerros = 0;
		maxKerros = 8;
	}

	private void tulostaTiedot() {
		System.out.println("HISSI");
		System.out.println("kerros: " + kerros);
	}

	public void meneYlosAlas(String suunta) {
		if (suunta.equals("y")) {
			kerros++;
		} else {
			kerros--;
		}
		tulostaTiedot();
	}

}
