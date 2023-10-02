package Topic1_example1_v1.src;

public class Human extends Mammal {

	private String name;

	public Human() {
		super(100);
		//System.out.println("Human() constructor");
        //weight = 100;
	}

	public Human(int weight, int nursingDays, String name) {
		super(weight, nursingDays);
		//this.name = name;
		//this.nursingDays = nursingDays;
		//this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void eat() {
		System.out.println("paino ennen syömistä " + weight);
		System.out.println("Eating using fork and knife!");
	}

	@Override
	public void swim() {
		System.out.println("Swimming like a human");

	}

}
