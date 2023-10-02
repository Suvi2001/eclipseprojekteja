package Topic1_example1_v1.src;

public class RunClass {

	public static void main2(String[] args) {

		// Animal a = new Animal(); // This would not work as you cannot create an
		// instance from abstract class

		// ***************************************

//		
//		Cat kitty = new Cat(8, "Kitty");
//		System.out.println("kitty (name) : " + kitty.getName());
//		System.out.println("kitty (weight) : " + kitty.getWeight());
//		
//		kitty.eat();

		// *********************************************

		Teacher tommy = new Teacher();

		System.out.println("tommy (name) : " + tommy.getName());
		System.out.println("tommy (weight) : " + tommy.getWeight());

		tommy.eat();
		tommy.swim();
		
		Student pekka = new Student(null);
		
		pekka.eat();
		pekka.swim();
		pekka.getAge();

		//tommy.setWeight(80);
		//tommy.setName("Tommy");

//		System.out.println("tommy (name) : " + tommy.getName());
//		System.out.println("tommy (weight) : " + tommy.getWeight());
//
//		
//		Human tommy2 = new Human(90, 50, "Tommy2");
//		
//		System.out.println("tommy2 (name) : " + tommy2.getName());
//		System.out.println("tommy2 (weight) : " + tommy2.getWeight());
//	
//		
//		System.out.println("" + tommy.weight);
	}

	public static void main(String[] args) {

		Student john = new Student("Pizza");

	}

}
