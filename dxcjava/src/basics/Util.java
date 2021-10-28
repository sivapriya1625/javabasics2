package basics;

import objectclass.Util;

public class Student {

	String name; //partition 
@@ -27,7 +29,7 @@ public Student(String name) {
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age+2;
		this.age = Util.incrementByTen(age);
	}

	static String COLLEGE_NAME = "IIT";

