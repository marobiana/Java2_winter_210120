package constructor_quiz02;

public class Circle {
	// 속성: 필드
	private int r;
	
	// 행위: 메소드
	// 생성자
	public Circle(int r) {
		this.r = r;
		System.out.println("반지름 " + r + "인 원이 생성되었다.");
	}
	
	// 넓이 구하기
	public double getArea() {
		return this.r * this.r * Math.PI;
	}
	
	// 둘레 구하기
	public double getRound() {
		return this.r * 2 * Math.PI;
	}
	
	// 개수의 따른 넓이
	// overloading : 메소드 이름은 같은데 파라미터의 개수가 다르거나, 파라미터의 타입이 다른경우 
	//    다른 메소드로 인지하고 일치하는 메소드로 자동 호출 되는 것
	public double getArea(int count) {
		return getArea() * count;
	}
}
