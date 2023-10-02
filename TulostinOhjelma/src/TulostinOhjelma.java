
public class TulostinOhjelma {

	public static void main(String[] args) {
	String s = "Tekija: Suvi";	
    //Suvi Kansakoski koko nimi
	
		System.out.println("Hei, olen tulostin-ohjelma");
		System.out.println("Ohjelman tekija: Suvi");
		
	int luku1 = 3;
	int luku2 = 5;
		
    //System.out.println("luku1 muuttujan arvo on 3");
    //System.out.println("luku2 muuttujan arvo on 5");
    //hyvin toimii, lämmittelen
    
	luku1 = 8;
	luku2 = 4;
	
	    System.out.println("luku1 muuttujan arvo on nyt 8");
	    System.out.println("luku2 muuttujan arvo on nyt 4");
	//testasin vaihtaa muuttujan arvoa   
	    
	
	//annetaan uudelle muuttujalle nimeksi tulo
	  
	luku1 = 8;
	luku2 = 4;
    float tulo = luku1 * luku2;
	
	   System.out.println("luku1-muuttujan arvo on "+ tulo);
	   
	luku1 = 8;
    luku2 = 4; 
	double tulos = luku1 / luku2;
		
	   System.out.println("luku1-muuttujan arvo on "+ tulos);
	   
	luku1 = 8;
	luku2 = 4; 
    double lopputulema = luku1 + + luku2;
			
	   System.out.println("luku1-muuttujan arvo on "+ lopputulema);
	   
	luku1 = 8;
    luku2 = 4; 
    double lopputulos = luku1 - luku2;
				
	   System.out.println("luku1-muuttujan arvo on "+ lopputulos);
		   
	}

}
