
public class IkaOhjelma {

	public static void main(String[] args) {
	int ika = 65;
	
	//Tulostusehdot
	
	if (ika > 0 && ika < 15) {

		System.out.println("Olet alaik�inen");

		if (ika >= 15) {

		System.out.println("Saat ajaa mopoa"); }

		} else if (ika >= 65) {

		System.out.println("Olet el�kel�inen");

		} else {

		System.out.println("Olet aikuinen");

		}
	if (ika >= 16 && ika <= 17)
	{
		System.out.println("Saat ajaa kevaria");
	}
	else if (ika == 18)
	{
		System.out.println("Olet juuri tullut t�ysi-ik�iseksi, ja saat ajaa autoa. Huraa!");
	}
	else if (ika % 10 == 0)
	{
		System.out.println("Onnea tasavuosien t�ytt�misen johdosta!");
	}
	if (ika == 100)
	{
		System.out.println("Onnea,");
		System.out.println("Olet t�ytt�nyt");
		System.out.println("100-vuotta!!");
	}
	//Onnentoivotus 100v t�ytt�neille
	if (ika >= 58 && ika <=64)
	{
		System.out.println("Voit nyt halutessasi menn� varhaisel�kkeelle.");
	}
	if (ika == 65)
	{
		System.out.println("Onnea el�k�itymisen johdosta!!");
	}
	if (ika >= 40 && ika <= 50)
	{
		System.out.println("Hauskaa keski-ik��!!");
	}
  }
 }