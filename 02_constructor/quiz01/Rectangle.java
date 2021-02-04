package constructor_quiz01;

// 설계도
public class Rectangle {
	// 속성: 필드
	private int width;  // 가로
	private int height; // 세로
	
	// 행위: 메소드
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		System.out.println("가로 " + this.width + "cm, 세로 " + this.height + "cm 사각형이 만들어졌습니다");
	}
	
	// 넓이 구하는 메소드
	public int getArea() {
		return this.width * this.height;
	}
	
	// 둘레 구하는 메소드
	public int getRound() {
		return (this.width * 2) + (this.height * 2);
	}
}
