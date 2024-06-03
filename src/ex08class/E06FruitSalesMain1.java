package ex08class;

// 과일 판매자
class FruitSeller {
	
	// 멤버 변수
	// 판매자의 보유수량
	int numOfApple = 100;
	// 판매 수입금
	int myMoney = 0;
	// 멤버 상수 : 사과의 단가
	final int APPLE_PRICE = 1000;
	/*
	 final이 있으면 변수->상수가 됨.
	 - 멤버변수의 경우 초기값이 없는 상태로 정의한 후 
	 인스턴스를 생성하고 차후 초기화할 수 있다.
	 - 하지만 멤버상수는 인스턴스 생성과 상관없이 정의하는 시점에
	 반드시 초기화해야한다. 즉 1000을 지우면 에러가 발생한다.
	 */
	
	// 멤버 메서드 : 매개변수로 받은 money원 만큼의 사과의 갯수를 반환한다.
	public int saleApple(int money) {
		// 금액을 단가로 나눠서 갯수를 계산
		int num = money / APPLE_PRICE;
		// 보유한 사과에서 갯수만큼 차감
		numOfApple -= num;
		// 금액을 합산한다.
		myMoney += money;
		// 사과의 갯수를 반환한다. 즉 구매자에게 사과를 전달한다.
		return num;
	}
	// 판매자의 현재상태를 출력한다.
	public void showSaleResult() {
		System.out.println("[판매자]남은사과갯수: "+ numOfApple);
		System.out.println("[판매자]판매수익: "+ myMoney);
	}
}

// 과일 구매자
class FruitBuyer {
	// 멤버 변수 : 보유 금액 및 구매한 사과의 갯수
	int myMoney = 5000;
	int numOfApple = 0;
	
	/*
	 구매자가 판매자에게 사과를 구매하는 행위를 표현
	 매개변수를 통해 판매자에게 금액을 지불한다.
	 */
	public void buyApple(FruitSeller seller, int money) {
		// 판매자가 반환해주는 사과의 갯수를 합산한다.
		numOfApple += seller.saleApple(money);
		// 지불한 금액을 차감한다.
		myMoney -= money;
	}
	// 구매자의 상태를 표현
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액: "+ myMoney);
		System.out.println("[구매자]사과갯수: "+ numOfApple);
	}
}

public class E06FruitSalesMain1 {
	
	public static void main(String[] args) {
		
		FruitSeller seller = new FruitSeller();
		FruitBuyer buyer = new FruitBuyer();
		
		System.out.println("구매행위가 일어나기전의 상태");
		seller.showSaleResult();
		buyer.showBuyResult();
		
		buyer.buyApple(seller, 5000);
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller.showSaleResult();
		buyer.showBuyResult();
	}

}
