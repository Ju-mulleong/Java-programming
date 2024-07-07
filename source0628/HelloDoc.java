package source0628;

/**
 * 	javadoc 사용 예제
 * 		@author Ju Jaehyeon
 * 		@version 1.0 
 * 		@since 1.8
 * 
 */

public class HelloDoc {
	// '/** enter' 입력!
	/**
	 * 두 정수의 합을 구하는 메소드
	 * @param i: 첫 번째 정수형 인자 (파라미터)
	 * @param j: 두 번째 정수형 인자
	 * @return: 두 정수의 합
	 */
	public static int sum(int i, int j) {
		return i + j;
		
		
	}

	/**
	 * main() 메소드 
	 * @param args
	 */
	// 컴파일 에러있으면 document 생성 안됨
	public static void main(String[] args) {
		int i;
		int j;
		char a;
		String b;
		final int TEN = 10;
		
		i = 1;
		j = sum(i, TEN);
		a = '?';
		b = "source0628.Hello";
		
		java.lang.System.out.println(a);
		System.out.println(b);
		System.out.println(TEN);
		System.out.println(j);
	}
}