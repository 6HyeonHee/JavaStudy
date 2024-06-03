package ex04controlstatement;

public class QuPyramid01 {

	public static void main(String[] args) {
		int i = 1; // 줄번호
		
		while(i<=5) {
			int j = 1; // 별 개수
			while (j<=i) {
				j++;
				System.out.print("*");				
			}
			System.out.println();
			i++;
		}
	}
}
