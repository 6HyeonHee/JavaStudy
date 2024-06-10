package ex13interface;

/*
 추상클래스
 - 상속을 목적으로 제작되므로 인스턴스 생성은 허용되지 않는다.
 - 추상 클래스는 대부분 추상 메서드를 포함하고 있으므로, 이를 상속받는 클래스는
   반드시 추상메서드를 오버라이딩 해야한다.
 - 클래스의 상속관계에서 설계도와 같은 역할을 한다.
 - 인스턴스 생성은 할 수 없지만 그 외 참조변수선언, 상속등의 모든 기능을 사용할 수 있다.
 
 추상메서드
 - 오버라이딩을 목적으로 선언한다.
 - 메서드의 실행부가 없으므로 중괄호 대신 세미콜론으로 마무리한다.
 */

// 추상 클래스1 : 추상 메서드를 포함하지 않은 클래스
abstract class AbsClass1 {
	// int 형으로 표현할 수 있는 최대값을 표현한 정적 상수
	public static final int MAX_INT = Integer.MAX_VALUE;
	// 인스턴스 멤버메서드
	void instanceMethod() {}
	// 정적 메서드
	static void staticMethod() {}
}
/*
 추상 메서드를 포함하지 않은 추상클래스를 상속하면 오버라이딩은 강제사항이
 아닌 선택사항이 된다. 즉 필요한 경우에만 오버라이딩 하면 된다.
 현재 오버라이딩 된 메서드는 삭제해도 에러가 발생하지 않는다.
 */
class AbsClassChild1 extends AbsClass1 {
	@Override
	void instanceMethod() {
		System.out.println("선택적 오버라이딩");
	}
}

/*
 추상 클래스2 : 추상 메서드를 포함한 클래스. 추상메서드를 멤버로 포한한 클래스는
 	반드시 abstract로 선언해야한다. 그러지 않으면 에러가 발생한다. (Java 규칙)
 */
abstract class AbsClass2 {
	/*
	 추상메서드는 실행부가 없으므로 {}를 기술하지 않는다.
	 오버라이딩을 목적으로 생성한다.
	 */
	abstract void absMethod(int number);
}
/*
 위 클래스를 상속하면 부모가 가진 추상메서드를 그대로 상속받게 되므로
 해당 클래스도 abstract로 선언해야한다. 단, 이경우 해당 클래스로도
 인스턴스를 생설할 수 없게 된다. 따라서 인스턴스 생성을 위해서는 부모의
 추상 메서드를 자식쪽에서 오버라이딩을 필수로 해야한다.
 */
class AbsClassChild2 extends AbsClass2 {
	/*
	 오버라이딩은 부모쪽의 메서드를 가리고, 새로운 기능을 재정의 하는 것이므로
	 자식 클래스는 추상메서드를 포함하지 않는 상태가도니다.
	 따라서 인스턴스 생성을 할 수 있다.
	 오버라이딩 된 메서드를 삭제하면 에러가 발생한다.
	 */
	@Override
	void absMethod(int number) {
		System.out.println("필수 오버라딩");
	}
	void newMethod() {
		System.out.println("확장한 메소드");
	}
}

public class E01AbstractMain {
	
	public static void main(String[] args) {
		// 추상클래스는 인스턴스 생성을 할 수 없다.
//		AbsClass1 absClass1 = new AbsClass1();
		
		// 추상클래스를 상속한 하위클래스는 인스턴스를 생성할 수 있다.
		AbsClassChild1 absClassCild1 = new AbsClassChild1();
		
		/*
		 추상클래스는 인스턴스 생성은 할 수 없지만 참조변수로 사용할 수 있다.
		 부모타입의 참조변수로 자식 인스턴스를 참조한다.
		 */
		AbsClass2 absClass2 = new AbsClassChild2();
		/* 부모쪽의 멤버메서드를 호출할 수 있다.
		하지만 오버라이딩 되었으므로 자식쪽의 메서드가 동작하게 된다. */
		absClass2.absMethod(100);
		/*
		 하지만 부모타입의 참조변수로 자식영역에 접근은 붉능하므로,
		 접근을 위해 자식 타입으로 다운캐스팅 해야한다.
		 */
		((AbsClassChild2)absClass2).newMethod();
		
		/*
		 추상 클래스내에 선언된 정적메서드는 오버라이딩의 대상이 될 수 없으므로
		 static의 기본규칙을 따른다. 인스턴스 생성없이 단지 클래스명으로
		 접근하여 호출할 수 있다.
		 */
		AbsClass1.staticMethod();
		AbsClassChild1.staticMethod();
		System.out.println("int형의 최대값:" + AbsClass1.MAX_INT);
	}
}
