package ex05method;

import java.util.Scanner;

public class QuSimpleOperation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 정수: ");
		int num1 = scanner.nextInt();
		System.out.print("두번째 정수: ");
		int num2 = scanner.nextInt();
		
		arithmetic(num1,num2);
	}
	
	public static void arithmetic(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("덧셈 = "+ sum);
		
		int dif = num1 - num2;
		System.out.println("뺄셈 = "+ dif);
		
		int mul = num1 * num2;
		System.out.println("곱셈 = "+ mul);
		
		int div = num1 / num2;
		System.out.println("나눗셈의 몫 = "+ div);
		
		int remain = num1 % num2;
		System.out.println("나눗셈의 나머지 = "+ remain);
	}

}

