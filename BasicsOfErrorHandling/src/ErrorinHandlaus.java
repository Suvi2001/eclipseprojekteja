import java.util.Scanner;
public class ErrorinHandlaus {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int number = 0;
		boolean numberOk = false;
		
		do 
		{
			System.out.println("Please, write a number");
	
        try {
        	number = Integer.parseInt(in.nextLine());
        	numberOk = true;
        } catch (Exception e) {
          System.out.println("You didn't write a number!");
          numberOk = false;
        }
        
  } while (numberOk == false);
  
  System.out.println ("You wrote: " + number);
}}
