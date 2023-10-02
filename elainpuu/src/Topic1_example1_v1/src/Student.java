package Topic1_example1_v1.src;

public class Student extends Human {

	protected String favorite_food;

	public Student(String ff) {
		super();
		System.out.println("Student(String ff) constructor");
		this.favorite_food = ff;
	}

	@Override
	public void swim() {
		System.out.println("Swimming like a student");
	}

}
