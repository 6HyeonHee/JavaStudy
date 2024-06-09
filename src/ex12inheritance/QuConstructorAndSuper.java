package ex12inheritance;

class Car {
	int gasoline;
}

class HybridCar extends Car {
	int electric;
}

class HybridWaterCar extends HybridCar {
	int water;
	public HybridWaterCar(int a, int b, int c) {
		gasoline = a;
		electric = b;
		water = c;
	}
	
	public void showNowGauge() {
		System.out.println("남은 가솔린: " + gasoline);
		System.out.println("남은 전기량: " + electric);
		System.out.println("남은 워터량: " + water);
	}
}

public class QuConstructorAndSuper {

	public static void main(String[] args) {
		HybridWaterCar hcar = new HybridWaterCar(10,20,30);
		hcar.showNowGauge();
	}

}
