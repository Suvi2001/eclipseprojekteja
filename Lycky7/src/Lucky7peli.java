import java.util.Random;
import java.util.Scanner;

public class Lucky7peli {

	public static void main(String[] args) {
		
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    String vastaus;
    int randomNumber;
    int Lompakkoarvo1 = 0;
    
    System.out.println("Tervetuloa pelaamaan Lucky 7-peli�!");
    System.out.println("Joka yritt�m� maksaa euron. Peli kest�� niin kauan kun rahat riitt�v�t, tai kun kirjoitat kirjaimen e."); 
    System.out.println("Jos arpomani numero on 7, voitat aina 5�! Jos arvon jotkin muut luvut, h�vi�t 2�."); 
    System.out.println("Vinkki; rahapanoksen kannattaa olla suurempi kuin 5�. Onnea peliin!");
    System.out.println("Sy�t� aloitusraham��r�si lompakkoon:");
    Lompakkoarvo1 = input.nextInt();
    Lompakkoarvo1=Lompakkoarvo1-1;
    vastaus = input.nextLine();
    //Luetaan sy�tett� konsolista
    
    
    do
    {
      
      System.out.println("Arvon nyt 3 numeroa v�lilt� 1-9...");  
      randomNumber = random.nextInt(10);
      
      System.out.println("Arpomani numerot:" + randomNumber + randomNumber + randomNumber);
  
     if (randomNumber == 7) {
      
     System.out.println("Hienoa, voitit 5�! Raham��r� lis�ttiin lompakkoosi :)");
     Lompakkoarvo1=Lompakkoarvo1+5;
     System.out.println("Lompakkosi rahasumma nyt: " +Lompakkoarvo1);
     
     System.out.println("Haluatko arpoa uudet numerot -1�? Jos kyll�, paina enter. Muuten kirjoita e");
     vastaus = input.nextLine();
	 }
    
     else {
 
     Lompakkoarvo1=Lompakkoarvo1-2;
     System.out.println("H�visit 2�!");
     System.out.println("Lompakkosi rahasumma nyt: " +Lompakkoarvo1);
     System.out.println("Haluatko arpoa uudet numerot -1�? Jos kyll�, paina enter. Muuten kirjoita e");
     vastaus = input.nextLine();
     }	 
     if (Lompakkoarvo1<=0) {
 		 System.out.println("Rahasi loppuivat!");
 		 break;
 		 }
     
    } while (!vastaus.equals("e"));
 	
       System.out.println("Pelisi loppui!"); 
    }
   }