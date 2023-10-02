
public class App {

	public static void main(String[] args) {
		//Kuvio k = new Kuvio();
		//abstraktista luokasta ei voi luoda olioita eik‰ ole tarvekaan (kuvio on kattok‰site)
        Kolmio kolmio = new Kolmio();
        
        kolmio.laskePintaAla(5,2);
        
	}

}

abstract class Kuvio //abstrakti luokka, ett‰ voi laskea useiden eri kuvioiden pinta-alat laskePintaAla-metodilla
{
	protected String vari;
	protected double pintaAla;
	
	public void tulostaTiedot()
	{
		System.out.println("V‰ri: " + vari);
		System.out.println("Pinta-ala: " + pintaAla);
	}
	
	public abstract void laskePintaAla(double kanta, double kork); //abstraktilla metodilla ei ole bodya, t‰m‰ riitt‰‰
}

class Kolmio extends Kuvio
{
	public Kolmio() //oletuskonstruktori
	{
		vari= "";
		pintaAla = 0;
	}
	
	public void laskePintaAla(double kanta, double korkeus)
	{
		pintaAla = kanta * korkeus/2;
		System.out.println(pintaAla);
	}
}
class Nelio extends Kuvio
{
	public void laskePintaAla(double leveys, double korkeus)
	{
		pintaAla = leveys * korkeus;
		System.out.println(pintaAla);
	}
}
class Ympyra extends Kuvio
{
	public void laskePintaAla(double sade, double korkeus)
	{
		//return Math.PI * Math.pow(sade, korkeus);
		System.out.println(pintaAla);
	}
}