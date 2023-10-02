package Topic1_example1_v1.src;

public abstract class Mammal extends Animal {
	
	protected int nursingDays;

	public Mammal(int weight) {
		// TODO Auto-generated constructor stub
	}
	
	public Mammal(int d, int w) {
		this.nursingDays = d;
	}
	
	public int getNursingDays() {
		return nursingDays;
	}
	
	public int setNursingDays(int nursingDays) {
		return this.nursingDays = nursingDays;
	}
	
	@Override
	public void swim() {
		System.out.println("Swimming like a mammal");
	}

}
