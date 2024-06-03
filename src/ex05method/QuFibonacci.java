package ex05method;

import java.util.Scanner;

public class QuFibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("출력할 피보나치 수열의 항목 수를 입력하세요: ");
        int count = scanner.nextInt();

        fibonacciProgression(count);
	}
	 public static void fibonacciProgression(int count) {
		 // 첫번째와 두번째 항은 고정값으로 출력
	     int first = 0, second = 1;
	     System.out.println("첫번째 항: " + first + " / 두번째 항: " + second);

	     // 세번째 항부터 count번째 항까지 출력
	     for (int i = 3; i <= count; i++) {
	    	 int next = first + second;
	         System.out.println(i + "번째 항: " + first + " + " + second + " = " + next);
	         first = second;
	         second = next;
	     }
       }
}
