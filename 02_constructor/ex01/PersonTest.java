package constructor_ex01;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("신보람");
		p1.setBirth("20000101");
		p1.setGender("여자");
		
		System.out.println(p1.getName());
		System.out.println(p1.getBirth());
		System.out.println(p1.getGender());
		
		Person p2 = new Person("신바다", "20190102", "남자");
		p2.setGender("여자");
		
		System.out.println(p2.getName());
		System.out.println(p2.getBirth());
		System.out.println(p2.getGender());
		
//		p1.name = "신보람";
//		p1.gender = "여자";
//		p1.birth = "20000101";
//		
//		p1.greet();
//		p1.walk();
//		p1.introduce();
//		p1.printAge();
	}

}
