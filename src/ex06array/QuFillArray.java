package ex06array;

import java.util.Scanner;

public class QuFillArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // 첫번째 배열 선언 및 입력 받기
        int[] firstArray = new int[10];
        System.out.println("총 10개의 정수를 입력하세요:");
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print((i + 1) + "번째 정수를 입력하세요: ");
            firstArray[i] = scanner.nextInt();
        }
        // 두번째 배열 생성
        int[] secondArray = new int[10];
        int oddIndex = 0; // 홀수가 채워질 인덱스
        int evenIndex = secondArray.length - 1; // 짝수가 채워질 인덱스

        // 홀수와 짝수를 구분하여 두번째 배열에 저장
        for (int num : firstArray) {
            if (num % 2 == 1) { // 홀수일 경우
                secondArray[oddIndex] = num;
                oddIndex++;
            } else { // 짝수일 경우
                secondArray[evenIndex] = num;
                evenIndex--;
            }
        }

        // 순서대로 입력된 결과 출력
        System.out.println("순서대로 입력된 결과:");
        printArray(firstArray);

        // 홀수/짝수 구분 입력 결과 출력
        System.out.println("홀수/짝수 구분 입력 결과:");
        printArray(secondArray);

	}
	// 배열 출력 메소드
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

