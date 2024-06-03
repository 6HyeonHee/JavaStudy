package ex05method;

import java.util.Scanner;

public class QuTemperature {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 섭씨를 화씨로 변환
		System.out.print("섭씨온도를 입력하세요: ");
		double celsiusInput = scanner.nextDouble();
		double fahrenheit = celsiusToFahrenheit(celsiusInput);
		System.out.println("화씨 온도 = "+ fahrenheit);
		
		// 화씨를 섭씨로 변환
		System.out.print("화씨온도를 입력하세요: ");
		double fahrenheitInput = scanner.nextDouble();
		double celsius = fahrenheitToCelsius(fahrenheitInput);
		System.out.println("섭씨 온도 = "+ celsius);
	}
	
	// double로 입력되는 경우.. void 대신 double (왜..??)
	public static double celsiusToFahrenheit(double celsius) {
		// 화씨 = 1.8 * 섭씨 + 32
		return  1.8 * celsius + 32;
	}
	
	public static double fahrenheitToCelsius(double fahrenheit) {
        // 섭씨 = (화씨 - 32) / 1.8
        return (fahrenheit - 32) / 1.8;
    }
}
