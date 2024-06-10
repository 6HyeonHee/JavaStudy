package quiz;

public class QuUpgradeGuGu {
	public static void main(String[] args) {
		int i = 2;
		int j = 2;
		int num = 0;
		
		while(i<=9) {
			while(j<=9) {
				num = (int)Math.pow(i, j);
				System.out.printf("%d의 %d거듭제곱 = %2d\n",i,j,num);
				j++;
			}
			i++;
		}
	}
}
