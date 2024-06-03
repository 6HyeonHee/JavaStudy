package ex04controlstatement;

public class QuPyramid04 {

	public static void main(String[] args) {
		// 아래로 갈수록 별 개수 증가
		for (int i = 1; i<=5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//아래로 갈수록 별 개수 감소 (4개부터)
		for(int i=0; i<5; i++) {
			for(int j=4; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
