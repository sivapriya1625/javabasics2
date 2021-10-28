package basics;


/**
 * default constructor -- harshita
 */

public class Student {
	private String name;
	private int age;

	/**
	 * lahari constructor
	 * @param name
	 */
	public Student(String name) {
		this.name = name;
	}

	/**
	 * this is sathvika constructor
	 * @param name
	 * @param age
	 */
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age+2;
	}
}
