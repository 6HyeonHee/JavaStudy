package ex12inheritance;

//직사각형을 표현한 클래스
class RectangleT {
	// 멤버 변수 : 가로, 세로 길이를 표현
	int width;
	int height;
	
	// 생성자: 멤버변수를 초기화
	public RectangleT(int w, int h) {
		this.width = w;
		this.height = h;
	}
	
	public void showAreaInfo() {
		// 멤버변수 사용 시 this는 항상 붙이도록 하자.
		System.out.println("직사각형 넓이 : " +(this.width * this.height));
	}
}

//정사각형을 표현한 클래스(정사각형은 직사각형의 일종)
class SquareT extends RectangleT {
	
	/*
	 직사각형은 가로, 세로 두변의 길이가 서로 다르므로 2개의 멤버변수가 필요하다.
	 하지만 정사각형은 길이가 동일하므로 1개의 값으로 2개의 멤버변수를 초기화할 수 있다.
	 즉 해당 클래스는 멤버변수의 확장이 필요하지 않다.
	 */
	public SquareT(int i) {
		super(i, i);
	}
	public void showAreaInfo() {
		// 부모의 멤버변수를 통해 사각형의 넓이를 계산한다.
		System.out.println("정사각형 넓이 : " + (super.width * super.height));
	}
} 


public class QuRectangleMainT {

	public static void main(String[] args) {
		
		// 부모클래스의 인스턴스(직사각형)
		RectangleT rec = new RectangleT(4,3);
		rec.showAreaInfo();
		
		// 자식클래스의 인스턴스(정사각형)
		SquareT sqr = new SquareT(7);
		sqr.showAreaInfo();
		
	}

}
