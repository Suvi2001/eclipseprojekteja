import java.util.Scanner;

public class MonitorApp {

	public static void main(String[] args) {
		TouchMonitor touchMonitor = new TouchMonitor("Samsung", 400);
		
		Scanner in = new Scanner(System.in);
		
		int x, y;
		
		System.out.println("X: ");
		x = Integer.parseInt(in.nextLine());
		
		System.out.println("Y: ");
		y = Integer.parseInt(in.nextLine());
		
		touchMonitor.setTouchXY(x, y);
		touchMonitor.printData();
		//Monitor monitor1 = new Monitor(); //objekti1
		//monitor1.printData();
		
		//Monitor monitor2 = new Monitor("Apple");
		//monitor2.printData();
		//muodostin hakee monitorin merkin nimen aina t‰‰lt‰ mainista ik‰‰n kuin metodi
		
		//Monitor monitor3 = new Monitor("SyncMaster 12345", true);
		//monitor3.printData();


	} // end of the MonitorApp main

}
// classes go here
class Monitor extends Device//luokka class + attribuutit/properties
{
	protected boolean isOn; //protected siksi, ett‰ attribuutin voi kapseloida mutta myˆs periytt‰‰. ei voi hyˆdynt‰‰ luokan ulkopuolella
	public String brand;
	
	public Monitor() 
	//don't add void, konstruktorin nimi pit‰‰ olla sama kuin luokan nimi eli Monitor. Oletusmuodostin (default constructor)
	//koska sille ei ole m‰‰ritelty parametreja ja String on null, boolean false, brand on empty, int on 0 ym
	{
		brand = "";
		isOn = false;
		price = 0;
	}
	
	// alla olevat muodostimet ovat tottakai parametrisia muodostimia (paremeterized constructors)
	public Monitor(String brandName)
	{
		isOn = false;
		brand = brandName;
	}
	
	public Monitor(String brandName, boolean isMonitorOn)
	{
		brand = brandName;
		isOn = isMonitorOn;
	  //this.brand = brand;
	  //this.isOn = isOn;
	  //esimerkki ett‰ attribuutin nimi voi olla sama kuin luokan nimi, silloin k‰ytet‰‰n sanaa this
	 //ett‰ samannimiset luokat ja attribuutit erottaa toisistaan. = merkin j‰lkeen on parametri
	}
	
	public void start() //metodi
	{
		isOn = true;
	}
	public void shutdown() //metodi
	{
		isOn = false;
	}
	public void printData()
	{
		System.out.println("Monitor");
		System.out.println("Brand: " + brand);
		
		if (isOn == true)
		{
			System.out.println("The monitor is on.");
		}
		else 
		{
			System.out.println("The monitor is off.");
		}
	}
} //luokan loppu

class TouchMonitor extends Monitor
{
	private int touchX, touchY;
	
	//default constructor
	public TouchMonitor()
	{
		isOn = false;
		brand = "";
		price = 0;
		touchX = 0;
		touchY = 0;
	} 

	public TouchMonitor(String brand, int price)
	{
		isOn = false;
		this.brand = brand;
		this.price = price;
		touchX = 0;
		touchY = 0;
	}
	
	public void setTouchXY(int x, int y)
	{
		touchX = x;
		touchY = y;
	}
	
	//kutsutaan kantaluokasta metodia, v‰ltyt‰‰n kirjoittamiselta
	@Override
	public void printData()
	{
		super.printData();
		System.out.println("Price: " +  price + "Ä");
		System.out.println("TouchX: " + touchX + " TouchY: " + touchY);
	}
}