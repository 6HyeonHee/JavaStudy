package ex05method;

public class QuFindPrimeNumber {

	public static void main(String[] args) {
		System.out.println("1부터 100 사이의 소수:");
        for (int num = 1; num <= 100; num++) {
            if (isPrimeNumber(num)) {
                System.out.print(num + " ");
            }
        }
	}
	
	public static boolean isPrimeNumber(int num) {
		// 0 과 1은 소수 아님
		if(num <=1) {
			return false;
		}
		
		// 2는 소수
		if(num==2) {
			return true;
		}
		
		// 2를 제외한 모든 짝수는 소수 아님
		if (num % 2 == 0) {
			return false;
		}
		
		//그외 3부터 'num'의 제곱근까지 홀수로 나누어 떨어지는지 확인
		// 나누어 떨어지면 false => 소수가 아니기 때문
		for(int i = 3; i <= Math.sqrt(num); i +=2) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
	}

}

