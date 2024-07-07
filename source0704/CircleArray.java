package source0704;

public class CircleArray {

	public static void main(String[] args) {
		Circle[] c = new Circle[5]; // 배열 생성
		
		for(int i = 0; i<c.length; i++) {
			c[i] = new Circle(i); // 배열 원소 생성
			System.out.print((int)(c[i].getArea()) + " ");
		}

	}

}
