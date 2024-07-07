package lab01;
// @author 2018111620 주재현

import java.util.Scanner;
public class SumofInt {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input1,input2,input3 = "";
		Integer Sum = 0;
		
		System.out.print("첫 번째 정수를 입력: ");
		input1 = scanner.nextLine();
		int intInput1 = Integer.parseInt(input1);
		
		System.out.print("두 번째 정수를 입력: ");
		input2 = scanner.nextLine();
		int intInput2 = Integer.parseInt(input2);
				
		System.out.print("세 번째 정수를 입력: ");
		input3 = scanner.nextLine();
		int intInput3 = Integer.parseInt(input3);
		
		scanner.close();
		
		
		
		Sum = intInput1 + intInput2 + intInput3;
		System.out.print("결과: " + Sum);
	}

}


/*
 * Lab 01. 2장. 변수와 타입 
 * - 3개의 정수를 화면상에서 입력 받고, 3개 정수의 합을 구하는 프로그램 
 * !!!맨 위에 주석과 프로그램에 대한 정보 적는 습관!!!
 * 적절한 공백, 주석 중요 하나의 코드를 봤을때 책처럼 잘 읽히게
 *
 *
 * import java.util.Scanner;
 * 
 * public class CalculateInt {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x=0;
		int y=0;
		int z=0;
		int result=0;
		
		System.out.print("첫 번째 정수를 입력: ");
		x = scanner.nextInt();	//nextInt()는 정수로 읽는건가? 
								//굳이 nextLine()으로 읽은다음 parseInt로 번거롭게 바꿀필요 없다
		
		System.out.print("두 번째 정수를 입력: ");
		y = scanner.nextInt();
		
		System.out.print("세 번째 정수를 입력: ");
		z = scanner.nextInt();
		
		result = x + y + z;
		System.out.println("결과: " + result);
		
		scanner.close(); //미리 Scanner scanner = new Scanner(System.in);
								scanner.close() 를 만들어 놓고 이 사이에 코드 작성하기
								사용하지 않는 객체는 지워야한다.
	}

}

 * 
 * 
 * 
 * 
 * 
 */
