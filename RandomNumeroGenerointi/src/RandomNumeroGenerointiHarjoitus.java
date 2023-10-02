import java.util.Random;
import java.util.Scanner;
public class RandomNumeroGenerointiHarjoitus {

	public static void main(String[] args) {
	
    Random random= new Random();
	
    int randomNumber;
    
    randomNumber = random.nextInt(101);
    System.out.println("Arvon numeron 0-100:" + randomNumber);
    
    Scanner in = new Scanner(System.in);
    String vastaus;
    int suorituskerta = 0;
    
    do
    {
      System.out.println("Heit‰ noppaa");
      suorituskerta++;
      System.out.println("Tahdotko heitt‰‰ uudestaan (k/e)??");
      vastaus = in.nextLine();
      
      if (vastaus != "e"); {
			System.out.println("Kiva kun pelasit!");
			break;
		    }
      
	} while (vastaus.equals("k"));
    
      System.out.println("Heit‰ noppaa uudestaan, niin saat uuden numeron!");
  }
}