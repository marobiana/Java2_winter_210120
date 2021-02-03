package class_quiz02;

public class Person {
	// 필드
	String name;
	String birth;  // yyyymmdd
	String gender;
	
	// 메소드
	public void greet() {
		System.out.println("안녕하세요~");
	}
	
	public void walk() {
		System.out.println("걷는다");
	}
	
	public void introduce() {
		System.out.println("내 이름은 " + this.name + "이고 성별은 " + this.gender + "이다.");
	}
	
	public void printAge() {
		String yearStr = this.birth.substring(0, 4);   // yyyymmdd    substring(0, 4)  => yyyy
		int year = Integer.parseInt(yearStr);
		int age = 2021 - year + 1;
		System.out.println("나이는 " + age + "이다.");
	}
	
}
