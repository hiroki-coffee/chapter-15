package Extends_01;

public class Student extends Human {
	private int score;

	public Student(String name, int age, int score) {
		super(name, age);
		this.score = score;
	}

	public String getStudentProfile() {
		String profile = "年齢は" + super.age + "です。";
		profile += "学生で、テストの点数は" + this.score + "点です。";
		return profile;
	}

}