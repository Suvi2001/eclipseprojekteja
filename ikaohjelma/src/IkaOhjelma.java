
public class IkaOhjelma {

	public static void main(String[] args) {
	int ika = 65;
	
	//Tulostusehdot
	
	if (ika > 0 && ika < 15) {

		System.out.println("Olet alaikäinen");

		if (ika >= 15) {

		System.out.println("Saat ajaa mopoa"); }

		} else if (ika >= 65) {

		System.out.println("Olet eläkeläinen");

		} else {

		System.out.println("Olet aikuinen");

		}
	if (ika >= 16 && ika <= 17)
	{
		System.out.println("Saat ajaa kevaria");
	}
	else if (ika == 18)
	{
		System.out.println("Olet juuri tullut täysi-ikäiseksi, ja saat ajaa autoa. Huraa!");
	}
	else if (ika % 10 == 0)
	{
		System.out.println("Onnea tasavuosien täyttämisen johdosta!");
	}
	if (ika == 100)
	{
		System.out.println("Onnea,");
		System.out.println("Olet täyttänyt");
		System.out.println("100-vuotta!!");
	}
	//Onnentoivotus 100v täyttäneille
	if (ika >= 58 && ika <=64)
	{
		System.out.println("Voit nyt halutessasi mennä varhaiseläkkeelle.");
	}
	if (ika == 65)
	{
		System.out.println("Onnea eläköitymisen johdosta!!");
	}
	if (ika >= 40 && ika <= 50)
	{
		System.out.println("Hauskaa keski-ikää!!");
	}
  }
 }