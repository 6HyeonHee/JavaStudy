package ex12inheritance;

class Rectangle {
	int width, height;
	public Rectangle(int a, int b) {
		width = a;
		height = b;
	}
	public void showAreaInfo() {
		int result = width * height;
		System.out.println("직사각형 면적 : " + result);
	}
	
	
}

/*
class Square extends Rectangle {
	
	public Square(int c) {
		super(a,b);
		a = c;
		b = c;
	}
	
	public void showAreaInfo(int c) {
		int result = c * c;
		System.out.println("정사각형 면적 : " + result);
	}
}
*/

public class QuRectangleMain {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle(4,3);
		rec.showAreaInfo();
		
		//Square sqr = new Square(7);
		//sqr.showAreaInfo();
		
	}

}
