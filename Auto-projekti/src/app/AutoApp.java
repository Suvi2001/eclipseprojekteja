package app;
//packagen ideana on, ett� voidaan k�ytt�� monia saman nimisi� luokkia ty�ss� + selkeytt�� sen ulkoasua
import data.Auto;
//import.data*; importtaa kaikki luokat

public class AutoApp {

	public static void main(String[] args) {
		Auto auto = new Auto("ABC-123");

		auto.tulostaTiedot();
	}

}
