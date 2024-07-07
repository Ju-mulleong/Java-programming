package source0628;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x 값 입력: ");
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);
		
		System.out.print("y 값 입력: ");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
		
		int result = x + y;
		System.out.println("x + y: " + result);
		System.out.println();
		
		while(true) {
			System.out.print("입력 문자열: ");
			String data = scanner.nextLine();
			if(data.equals("q")) {
				break;
			}
			System.out.println("출력 문자열: " + data);
			System.out.println();
		}
		
		System.out.println("종료");
		scanner.close();

	}

}


/*
*  if (data == "g")
*	 break;
*
* Java에서는 ==로 '문자열' 비교 불가능(숫자는 가능), equals로 한다.
* data.equals("q") data의 문자열이 "q"와 같은지
* 
* 산술계산 정확히 할려면 정수로
* 
*  비트 이동연산자까지는 굳이
*  
*  
*  대입연산자도 내가 그렇게 작성할 필요는 없다
*  보고 어떤건지 이해할수있으면됨
*  
*  삼항연산자도 쉽게 쓰는게 낫다 줄여서쓰는건 나중에 , 디버깅하기도 더 어려움
*  
* 우선순위 중요한 것
* 	1. 괄호는 최우선순위
* 	2. *,/,%는 +,- 보다 높다
* 	3. 우선순위가 동일한 경우에는 왼쪽에서 오른쪽으로 연산
* 	4. 괄호로 우선순위 보기쉽게 표기하기
* 
* 
*
* 
* 
* 
*/