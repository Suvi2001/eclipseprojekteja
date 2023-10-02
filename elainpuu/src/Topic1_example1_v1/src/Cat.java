package Topic1_example1_v1.src;


public class Cat extends Mammal {
	
	private String name;

	//public Cat() {
	//	super(nursingDays);
		
	//}

	public Cat(int weight, String name) {
		super(weight);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void swim() {
		System.out.println("Swimming like a cat!");
		
	}

}
