package source0703;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";	// strArray[0]과 리터럴(데이터 자체)이 동일, 메모리 공유
		strArray[2] = new String("Java"); 
		
		System.out.println( strArray[0] == strArray[1] ); // true: 같은 객체 참조
		System.out.println( strArray[0] == strArray[2] ); // false: 다른 객체를 참조
		System.out.println( strArray[0].equals(strArray[2]) ); // true: 문자열이 동일
		
		System.out.printf("strArray[0] 주소: 0x%x\n", System.identityHashCode(strArray[0]));
		System.out.printf("strArray[0] 주소: 0x%x\n", System.identityHashCode(strArray[1]));
		System.out.printf("strArray[0] 주소: 0x%x\n", System.identityHashCode(strArray[2]));


	}

}
