package ex12inheritance;

class Burger {
	// 멤버변수
	/* 버거명, 가격, 패티, 소스, 아채를 표현 */
	private String name;
	private int price;
	private String pathy;
	private String sauce;
	private String vegetable;
	
	// 인자 생성자
	public Burger(String name, int price, String pathy, String sauce, String vegetable) {
		this.name = name;
		this.price = price;
		this.pathy = pathy;
		this.sauce = sauce;
		this.vegetable = vegetable;
	}
	
	// getter : price만 필요
	public int getPrice() {
		return price;
	}
	
	// 햄버거 정보 출력
	/* 버거명, 가격, 식재료 출력*/
	public void showBurgerInfo() {
		System.out.println("버거명 : " + name);
		System.out.println("가격 : " + price);
		System.out.println("식재료 : " + pathy +", "+ sauce + ", " + vegetable );
	}
}

// 햄버거의 기본 가격 추상화
// 기본가격 = 햄버거 + 음료 + 프렌치 프라이
class HamburgerPrice {
	// 멤버변수
	/* 햄버거 종류, 음료, 프렌치 프라이 */
	Burger burger;
	// 값이 변할일이 없기 때문에 상수(고정값)형태로 만들어줌.
	final int COKE = 1000;
	final int POTATO = 1500;
	
	// 인자생성자
	public HamburgerPrice(Burger b) {
		this.burger = b;
	}
	public void showPrice(boolean includeCoke, boolean includePotato) {
		
	}



	// 기본가격 계산
	public int CalTotalPrice(boolean includeCoke, boolean includePotato) {
		int totalPrice = burger.getPrice();
		
		if (includeCoke) {
			totalPrice += COKE;
		}
		if (includePotato) {
			totalPrice += POTATO;
		}
		
		return totalPrice;
	}
	
	// 햄버거와 결제금액 출력 => 기본가격 출력
	public void showPrice() {
		burger.showBurgerInfo();
		int totalPrice = CalTotalPrice(true, true);
		System.out.println("기본 결제 금액 : " + totalPrice );
	}
}

class SetPrice extends HamburgerPrice {

	// 인자생성자
	public SetPrice(Burger b) {
		super(b);
	}
	
	// 세트 가격으로 계산 (오버라이딩)
	@Override
	public int CalTotalPrice(boolean includeCoke, boolean includePotato) {
		int totalPrice = super.CalTotalPrice(includeCoke, includePotato);
		if (includeCoke && includePotato) {
			totalPrice -= 500; // 세트 할인 적용
		}
		return totalPrice;
	}
	
	// 햄버거와 세트결제 금액 출력 (오버라이딩)
	@Override
	public void showPrice(boolean includeCoke, boolean includePotato) {
		super.showPrice(includeCoke, includePotato);
		
		int totalPrice = CalTotalPrice(includeCoke, includePotato);
		System.out.println("세트 결제 금액 : " + totalPrice);
	}
}

public class QuBuyHamburger {

	public static void main(String[] args) {
		
		// 치즈버거 객체 생성
		Burger burger1 = new Burger("치즈버거", 2000, "쇠고기패티", "케챱", "피클");
		// 치킨버거 객체 생성
		Burger burger2 = new Burger("치킨버거", 3000, "닭고기패티", "마요네즈", "양상치");
		
		// 치즈버거를 기본가격으로 구매
		HamburgerPrice price1 = new HamburgerPrice(burger1);
		price1.showPrice();	// 4500원
		
		System.out.println("=============================");
		
		// 치킨버거를 세트가격으로 구매
		HamburgerPrice price2 = new SetPrice(burger2);
		price2.showPrice();	// 5000원
	}

}
