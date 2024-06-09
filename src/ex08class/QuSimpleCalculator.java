package ex08class;

class CalculatorEx {
	public int addcount, mincount, mulcount, divcount;
	
	public CalculatorEx() {
		init();
	}
	// 횟수 초기화 = 0
	public void init() {
		addcount = 0;
		mincount = 0;
		mulcount = 0;
		divcount = 0;
	}
	
	
	// 산술연산 부분
	public int add(int a, int b) {
		addcount++;
		int result = a + b;
		return result;
	}
	public double min(double a, double b) {
		mincount++;
		double result = a - b;
		return result;
	}
	public double mul(double a, double b) {
		mulcount++;
		double result = a * b;
		return result;
	}
	public int div(int a, int b) {
		divcount++;
		int result = a / b;
		return result;
	}
	
	
	public void showOpCount() {
		System.out.println("덧셈횟수 : " + addcount);
		System.out.println("뺄셈횟수 : " + mincount);
		System.out.println("곱셈횟수 : " + mulcount);
		System.out.println("나눗셈횟수 : "+ divcount);
	}
	
}

public class QuSimpleCalculator {
	
	public static void main(String[] args) {
		CalculatorEx cal = new CalculatorEx();
		cal.init();
		System.out.println("1 + 2 = " + cal.add(1 , 2));
		System.out.println("10.5 - 5.5 = " + cal.min(10.5 , 5.5));
		System.out.println("4.0 * 5.0 = " + cal.mul(4.0 , 5.0));
		System.out.println("100 / 25 = " + cal.div(100 , 25));
		System.out.println("10.0 * 3.0 = " + cal.mul(10.0 , 3.0));
		cal.showOpCount();

	}
}
