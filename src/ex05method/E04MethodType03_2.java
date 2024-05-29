 package ex05method;

import java.util.Scanner;

public class E04MethodType03_2 {
	/*
	연습문제] 사용자로부터 2~9사이의 숫자중 2개를 입력받아 이에 해당하는 
		구구단을 출력하는 메서드를 작성하시오. 무조건 첫번째 입력받는수가 작아야한다.
	입력예]
		첫번째숫자 : 3
		두번째숫자 : 12
		3*1=3 3*2=6........
		........
		...................12*9=108
	메서드명 : inputGugudan(int sNum, int eNum)
	 */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째숫자 : ");
		int s = scanner.nextInt();
		System.out.print("두번째숫자 : ");
		int e = scanner.nextInt();
	
		inputGugudan(s,e);
	}
	
	// 구구단은 for문을 더 많이 사용함.
	static void inputGugudan(int sNum, int eNum) {
		for(int dan=sNum; dan<=eNum; dan++) {
			for(int su=1; su<=9; su++) {
				System.out.printf("%2d*%d=%3d", dan, su, (dan*su));
				
				// 각 항목을 구부하기 위해 띄어쓰 기
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	// 강사님 코드 일부분
	static void inputGugudan2(int sNum, int eNum) {
		int dan = sNum;
		while(dan<=eNum) {
			int su = 1;
			while(su<=9) {
				System.out.printf("%-2d*-2d%=%2d", dan, su, (dan*su));
				System.out.print(" ");
				su++;
			}
			System.out.println();
			dan++;
		}
	}
}
