package ex08class;

class ChildProperty {
	// 구슬 개수 정의
	private int marbles;
	
	public ChildProperty(int init) {
		marbles = init;
	}
	
	public void obtainBead(ChildProperty other, int a) {
		// 한명은 플러스 한명은 마이너스
		marbles += a;
		// other : 당사자 말고 다른 어린이를 말함
		other.marbles -= a;
	}
	
	public void showProperty() {
        System.out.println(marbles);
    }
}

public class QuMarbles {

	public static void main(String[] args) {
		ChildProperty child1 = new ChildProperty(20);
		ChildProperty child2 = new ChildProperty(15);

		System.out.println("게임 전 구슬의 보유 개수");
		System.out.print("어린이1 : ");
		child1.showProperty(); 
		System.out.print("어린이2 : ");
		child2.showProperty(); 

		/*1차게임 : 어린이1은 어린이2의 구슬 5개 획득*/
		child1.obtainBead(child2, 5);

		/*2차게임 : 어린이2가 어린이1의 구슬 9개 획득*/
		child2.obtainBead(child1, 9);

		System.out.println("\n게임 후 구슬의 보유 개수");
		System.out.print("어린이1 : ");
		child1.showProperty(); 
		System.out.print("어린이2 : ");
		child2.showProperty();

	}

}
