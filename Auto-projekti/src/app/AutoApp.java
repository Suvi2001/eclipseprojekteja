package app;
//packagen ideana on, että voidaan käyttää monia saman nimisiä luokkia työssä + selkeyttää sen ulkoasua
import data.Auto;
//import.data*; importtaa kaikki luokat

public class AutoApp {

	public static void main(String[] args) {
		Auto auto = new Auto("ABC-123");

		auto.tulostaTiedot();
	}

}
