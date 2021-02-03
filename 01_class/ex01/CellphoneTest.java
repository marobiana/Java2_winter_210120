package class_ex01;

public class CellphoneTest {

	// 나의 의식의 흐름
	public static void main(String[] args) {
		Cellphone c1 = new Cellphone();
		c1.model = "iphone11pro";
		c1.price = 183;
		c1.color = "gold";
		c1.maker = "apple";
		System.out.println(c1.model);
		System.out.println(c1.price);
		System.out.println(c1.color);
		System.out.println(c1.maker);
		
		c1.call();
		c1.camera();
		
		c1.maker = "samsung";
		c1.model = "zflip";
		c1.color = "purple";
		System.out.println(c1.model);
		System.out.println(c1.price);
		System.out.println(c1.color);
		System.out.println(c1.maker);
	}

}
