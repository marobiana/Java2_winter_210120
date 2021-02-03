package class_quiz02;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "신보람";
		p1.gender = "여자";
		p1.birth = "20000101";
		
		p1.greet();
		p1.walk();
		p1.introduce();
		p1.printAge();
	}

}
