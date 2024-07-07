package source0702;
/* 구구단 출력 비교하는 소스 코드
 * 
 */

public class NestedLoop {

	public static void main(String[] args) {
		for (int i=1; i<10; i++) {
			for(int j=2; j<10; j++) {
				System.out.printf("%2d *%2d = %2d\t", i, j, j*i);
			}
			System.out.println();
		}

	}

}


/*
public class NestedLoop {

	public static void main(String[] args) {
		for (int i=1; i<10; i++) {
			for(int j=2; j<10; j++) {
				System.out.printf("%2d * %2d = %2d\t", j, i, j*i);
			}
			System.out.println();
		}
	
	}

}
*/