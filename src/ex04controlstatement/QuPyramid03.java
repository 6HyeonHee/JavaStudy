package ex04controlstatement;

public class QuPyramid03 {

	public static void main(String[] args) {
		for (int i = 1; i<10; i+=2) {
			for(int j = 9; j>i; j-=2) {
				// 가운데 정렬을 위한 공백
				System.out.print(" ");
			}
			for(int j = 0; j < i; j++) {
				System.out.print("*"); // 별이 두개씩 늘어나야함.
			}
			System.out.println();
		}
	}
}

