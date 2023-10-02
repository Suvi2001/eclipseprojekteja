import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Muistipeli {

	public static void main(String[] args) {
		
     Scanner in = new Scanner(System.in);
     Random random = new Random();
     int vaaratNumerot = 0;
     
     int [] randomNumber1 = new int[7];
     int [] arvaukset1 = new int[7];
     
     System.out.println("Tervetuloa muistipeliin!");
     
     System.out.println("Yritä muistaa alla olevat numerot. Näet ne 3 sekunnin ajan.");
          
     for (int i=0; i < randomNumber1.length; i++)
     {
    	 randomNumber1[i]= (random.nextInt(5)+1);
    	 
    	 System.out.print(randomNumber1[i]);
     }
    
//   Paussi     
     try 
     {  
    	 Thread.sleep(3000);
     } 
     
     catch(InterruptedException ex) 
     { 
    	 Thread.currentThread().interrupt(); 
     }
     
//   Numerot poistuvat näkyvistä ja konsoli kelautuu
     
     for (int i = 0; i < 20; ++i) System.out.println();
     
	 
 	 for (int i=0; i < randomNumber1.length ; i++) 
 	 {	 
 		 System.out.println("Syötä " + (i+1) + ". numero: ");
 		 arvaukset1[i] = in.nextInt();
     }

//   Toistetaan käyttäjän syöttämät numerot
 	 
 	 System.out.println("Sinun numerosi olivat: ");
	 
 	 for (int i=0; i < arvaukset1.length ; i++)
 	 {
 		
 		 System.out.print(arvaukset1[i]);
 	 }
 	 
 	 for (int i = 0; i < 2; ++i) System.out.println();
 	 
 //  Näytetään tietokoneen arpomat numerot	 
 	 System.out.println("Oikeat numerot olivat: ");
 	 
 	 
 	 for (int i=0; i < randomNumber1.length; i++)
 	 {
 		 System.out.print(randomNumber1[i]);
 	 }
 	 
 	 
 	 for (int i = 0; i < 2; ++i) System.out.println();
 	 
     
 //  Näytetään kuinka monta numeroa meni väärin.
 	 for (int i=0; i< arvaukset1.length; i++)
	 {	 
 		 if (arvaukset1[i]!=randomNumber1[i]) {
 		 vaaratNumerot++;
	 	 
 	 } 
	 }
 	 System.out.println("Sinulla meni "+ (vaaratNumerot) +" numeroa väärin.");
    }
  }
