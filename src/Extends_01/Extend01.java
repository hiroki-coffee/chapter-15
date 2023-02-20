package Extends_01;

public class Extend01 {
	public static void main(String[] args) {
		Human sugimoto = new Human("杉本", 15);
		System.out.println("Humanクラスのメソッド：名前は、" + sugimoto.getName());

		Student hashimoto = new Student("橋本", 17, 85);
		System.out.println("Humanクラスのメソッド：名前は、" + hashimoto.getName());
		System.out.println("Studentクラスのメソッド：プロフィールを紹介します。" + hashimoto.getStudentProfile());

		Human human = new Employee("山下", 33, "情報統括部");
		System.out.println("Humanクラスのメソッド：名前は、" + human.getName());

		Employee tanaka = (Employee) human;
		System.out.println("Employeeクラスのメソッド：プロフィールを紹介します。" + tanaka.getEmployeeProfile());

		Extend01.printName(sugimoto);
		Extend01.printName(hashimoto);
		Extend01.printName(tanaka);
	}

	public static void printName(Human human) {
		System.out.println("Humanクラスのメソッド：名前は、" + human.getName());
	}
}