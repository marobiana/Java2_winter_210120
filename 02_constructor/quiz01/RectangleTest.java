package constructor_quiz01;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(30, 50);  // 어떤 사이즈의 사각형을 만들겠다
		System.out.println("넓이:" + rect1.getArea() + "cm^2");
		System.out.println("둘레:" + rect1.getRound() + "cm");
	}

}
