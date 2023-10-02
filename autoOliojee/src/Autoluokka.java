
public class Autoluokka {

	public static void main(String[] args) {

		Auto auto1 = new Auto("Volkswagen", "Golf", 50, 10);
		auto1.naytaTiedot();
		auto1.Tankkaa();

		Auto auto2 = new Auto("Opel", "Astra", 30, 30);
		auto2.naytaTiedot();

	}
}

class Auto { // luokka
	public String merkki;
	public String malli;
	public int bensanMaara;
	public int tankkausMaara;

	public Auto() {
		merkki = " ";
		malli = " ";
		bensanMaara = 0;
		tankkausMaara = 0;
	}

	public Auto(String merkkiNimi, String malliNimi, int bensaMaara, int tankkiMaara) { // muodostin eli konstruktori,
																						// alla attribuutteja
		merkki = merkkiNimi;
		malli = malliNimi;
		bensanMaara = bensaMaara;
		tankkausMaara = tankkiMaara;
	}

	public void Jarruta() { // metodi
		System.out.println("Auto jarruttaa");
	}

	public void Kiihdyta() { // metodi
		if (bensanMaara >= 1) {
			System.out.println("Auto kiihtyy");
			bensanMaara--;
			System.out.println("Auton bensan m‰‰r‰ nyt: " + bensanMaara + " litraa");
		} else {
			System.out.println("Ei voi kiihdytt‰‰ koska bensa on loppu :(");
		}
	}

	public void Tankkaa() { // metodi
		System.out.println("Tankkaus: " + tankkausMaara + " litraa");
		System.out.println("Tankissa bensaa tankkauksen j‰lkeen: " + (bensanMaara + tankkausMaara) + " litraa");
	}

	public void naytaTiedot() { // metodi
		System.out.println("Auton merkki: " + merkki);
		System.out.println("Auton malli: " + malli);
		System.out.println("Auton bensan m‰‰r‰: " + bensanMaara + " litraa");
	}
}
