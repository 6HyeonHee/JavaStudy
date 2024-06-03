package ex06array;

public class QuNumberCounter {

	public static void main(String[] args) {
		int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
        int[] counter = new int[4]; 
        
        // answer 배열에서 각 정수의 등장 횟수 카운트
        for(int i = 0; i<answer.length; i++) {
        	int num = answer[i]; // 현재 위치의 정수
        	if (num >= 1 && num <= 4) {
                counter[num - 1]++; // 해당 정수의 카운트를 증가
            }
        }
        // 결과 출력
        for (int i = 0; i < counter.length; i++) {
            System.out.println("정수 " + (i + 1) + "의 개수: " + counter[i]);
        }
	}
}

