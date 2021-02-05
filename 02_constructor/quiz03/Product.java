package constructor_quiz01;

public class Product {
	// 속성: 필드, 멤버변수
	private String name;
	private int price;
	private String expiration;
	
	// 행위,기능: 메소드
	
	// 생성자
	public Product(String name, int price, String expiration) {
		this.name = name;
		this.price = price;
		this.expiration = expiration;
		System.out.println(this.name + " " + this.price + " " + this.expiration);
	}
	
	public String getName() {
		return this.name;
	}
	public int getPrice() {
		return this.price;
	}
	public String getExpiration() {
		return this.expiration;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setExpiration(String expiration) {
		this.expiration = expiration;
	}
	
	public int calculatePrice(int count) {
		return this.price * count;
	}
	
	public String availableSale() {
		// "2021-03-02"      
		// 오늘 날짜 <= 유통기한: 판매 가능    , 오늘 날짜 > 유통기한: 판매 불가
		String[] expirationDate = this.expiration.split("-");
		int year = Integer.parseInt(expirationDate[0]);
		int month = Integer.parseInt(expirationDate[1]);
		int day = Integer.parseInt(expirationDate[2]);
		
//		if (year > 2021) {
//			return "판매 가능 상품";
//		} else if (year == 2021) {
//			if (month > 2) {
//				return "판매 가능 상품";
//			} else if (month == 2) {
//				if (day > 5) {
//					return "판매 가능 상품";
//				}
//			}
//		} 
		
		// "2021-03-02"  
		if (this.expiration.compareTo("2021-02-05") >= 0) {
			// 기준 문자열이 더 크면 : 1
			// 같으면 : 0
			// 기준 문자열이 작으면: -1
			return "판매 가능 상품";
		}
		
		return "판매 불가 상품";
	}
}
