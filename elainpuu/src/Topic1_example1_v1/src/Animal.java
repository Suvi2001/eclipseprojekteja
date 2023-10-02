package Topic1_example1_v1.src;

public abstract class Animal {

	protected int weight; // Weight in grams
	protected int age;
	protected String gender;

	public Animal() {
		System.out.println("Animal() constructor");
	}

	public Animal(int w) {
		this.weight = w;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		// järkevyystarkastus
		if (weight >= 0 && weight <= 400) {
			this.weight = weight;
		}
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		// järkevyystarkastus
		if (age >= 0 && age <= 100) {
			this.age = age;
		}
	}

	public abstract void swim();

	protected void eat() {
		System.out.println("Eating like an animal!");
	}

}
