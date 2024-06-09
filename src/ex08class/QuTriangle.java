package ex08class;

class Triangle {
	private double bottom, height;
	
	public Triangle() {
		init(bottom, height);
	}
	public void init(double a, double b) {
		bottom = a;
		height = b;
	}
	
	public double getArea() {
		double result = bottom * height / 2 ;
		return result;
	}
	public double setBottom(double a) {
		return bottom = a;
	}
	public double setHeight(double b) {
		return height = b;
	}
}

public class QuTriangle {

	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.init(10, 17); //밑변10, 높이17로 초기화
		System.out.println("삼각형의 넓이 : "+ t.getArea());
		t.setBottom(50);//밑변 50으로 변경
		t.setHeight(14);//높이 14로 변경
		System.out.println("삼각형의 넓이 : "+ t.getArea());
	}

}
