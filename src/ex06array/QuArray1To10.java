package ex06array;

public class QuArray1To10 {

	public static void main(String[] args) {
		// 크기가 10인 정수 배열 선언
        int[] arr = new int[10];

        // 배열 채우기
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1; // 1부터 시작하여 순차적으로 채움
        }

        // 배열 출력
        System.out.println("초기화된 배열 요소:");
        printArray(arr);

        // 배열 요소의 합 계산 및 출력
        int sum = calculateSum(arr);
        System.out.println("배열 전체 요소의 합: " + sum);
	}
	// 배열 출력 메소드
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // 배열 요소의 합 계산 메소드
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num; // 배열 요소를 누적하여 더함
        }
        return sum;
    }
}
