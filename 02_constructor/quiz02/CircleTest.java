package constructor_quiz02;

public class CircleTest {

	public static void main(String[] args) {
		// 어떤 사이즈의 원을 만들겠다.
		// 넓이를 알려달라
		Circle c1 = new Circle(8);
		System.out.println("원의 넓이 : " + c1.getArea());
		System.out.println("원의 둘레 : " + c1.getRound());
		System.out.println("25개의 원의 넓이:" + c1.getArea(25));
	}

}
