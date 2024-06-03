package ex05method;

public class QuSymmetry {

	public static void main(String[] args) {
		System.out.println("while문을 사용한 회전대칭 모양:");
        rotationSymmetryWhile();

        System.out.println("\nfor문을 사용한 회전대칭 모양:");
        rotationSymmetryFor();
	}
    // while문
    public static void rotationSymmetryWhile() {
        int i = 0;
        while (i < 4) {
            int j = 0;
            while (j < 4) {
                if (j == 3 - i) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }

    // for문
    public static void rotationSymmetryFor() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 3 - i) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}