import java.util.Scanner;
public class Arvauspeli {

	public static void main(String[] args) {
		
    Scanner input = new Scanner(System.in);
	String vastaus;
	int arvauskerta = 0;
	String nimi = "Suvi";
	
	do
	{
	    System.out.println("Arvaa nimeni! K�yt� isoja alkukirjaimia.");
	    System.out.println("Jos haluat lopettaa kesken, kirjoita loppu.");
	    System.out.println("K�yt�ss�si on 3 arvausta.");
	    
	    arvauskerta++;
	    vastaus = input.nextLine();
	
        if (vastaus.equals("Suvi")) {
    	System.out.println("Arvasit oikein, onneksi olkoon!");
        break;
        }
        
        else {
        	System.out.println("Arvasit v��rin, yrit� uudestaan.");
        }
        
        if (arvauskerta==3){
        System.out.println("K�ytit kaikki 3 arvaustasi!");	
        break;
        }
        
	  }  while (!vastaus.equals("loppu"));
        
    	System.out.println("Pelisi p��ttyi.");
        
      }
   }
