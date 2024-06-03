package ex05method;

import java.util.Scanner;

public class QuCircleCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("반지름을 입력하시오 : ");
		int radius = scanner.nextInt();
		
		circleArea(radius);
		System.out.println("");
		circleRound(radius);
	}
	
	public static void circleArea(int radius) {
		double area = 3.14 * radius * radius;
		System.out.printf("원의넓이 : %2.2f",area);
	}
	public static void circleRound(int radius) {
		double round = 2 * 3.14 * radius;
		System.out.printf("원의둘레 : %2.2f",round);
	}
}

