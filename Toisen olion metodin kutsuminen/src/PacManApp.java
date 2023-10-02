public class PacManApp {

	public static void main(String[] args) {

		Pacman pacman = new Pacman(); // olio
		Pacman.setElamat(5);

		Fruit fruit1 = new Fruit();
		Fruit fruit2 = new Fruit();
		Fruit fruit3 = new Fruit();

		pacman.eat(fruit2); // metodin kutsu
		
		Ghost.syoPacman(pacman);
		
		Pacman.printData();
	

		//System.out.println("Fruit1" + fruit1.isVisible);
		//System.out.println("Fruit2" + fruit2.isVisible);
		//System.out.println("Fruit3" + fruit3.isVisible);

	}

}

class Pacman // luokka
{
	private static int points; 
	private static int elamat;

	public static int getElamat() {
		return elamat;
	}

	public static void setElamat(int elamat) {
		Pacman.elamat = elamat;
		elamat = 5;
	}

	public Pacman() // oletusmuodostin
	{
		points = 0;
		elamat = 5;
	}

	public static void printData() // metodi
	{
		System.out.println("Elämiä jäljellä: " + Pacman.getElamat());
	}

	public static int getPoints() {
		return points;
	}

	public static void setPoints(int points) {
		Pacman.points = points;
		points = 0;
	}

	public static void eat(Fruit eatenFruit) {
		System.out.println("Pac-Man ate fruit");
		points++;
		Pacman.setPoints(points);
		System.out.println("Points: " + Pacman.getPoints());
		eatenFruit.disappear();
	}

	public static void vahennaElama(Pacman syoPacman) {
		System.out.println("Pacman syöty!");
		elamat--;
		Pacman.setElamat(elamat);
	}
}

class Fruit {
	protected boolean isVisible;

	public Fruit() {
		isVisible = true;
	}

	public void disappear() {
		isVisible = false;
		System.out.println("Fruit is hidden");
	}
}

class Ghost {
	private boolean isVisible;

	public Ghost() 
	{
		isVisible = true;
	}

	public void disappear() {
		isVisible = false;
		System.out.println("Ghost is hidden");
	}

	public static void syoPacman(Pacman vahennaElama) {
		Pacman.vahennaElama(vahennaElama);
	}
}