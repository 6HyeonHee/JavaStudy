package ex04controlstatement;

public class QuPyramid02 {

	public static void main(String[] args) {
		int i = 5; // 줄 번호 초기화 5줄 먼저
		
		do {
			int j = 1; // 별개수
			
			do {
				System.out.print("*");
				j++;
			}while(j<=i);
			System.out.println();
			i--;
		}while (i>0);
	}
}

