package ex04controlstatement;

public class Qu3Or7Sum {

	public static void main(String[] args) {
		// while문 이용
		int total = 0;
		int k = 1;
		
		while(k<=100) {
			if(k%3==0 || k%7==0) {
				total += k;
			}
			k++;
		}
		System.out.println("3또는 7의 배수의 합(while문) : "+ total);
		

		//do~while문 이용
		int total2 = 0;
		int h = 1;
		
		do {
			if(h%3==0 || h%7==0) {
				total2 += h;
			}
			h++;
		} while(h<=100);
		System.out.println("3또는 7의 배수의 합(do~while문) : "+ total2);
		
		
		// for문 이용
		int total3 = 0;
		
		for(int i=1; i<=100; i++) {
			if(i%3==0 || i%7==0) {
				total3 += i;
			}
		}
		System.out.println("3또는 7의 배수의 합(for문) : "+ total3);
	}
}
