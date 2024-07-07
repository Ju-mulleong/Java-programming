package source0628;

import java.util.Scanner;

public class ScannerNextLineEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = ""; // 빈 문자열(String 변수 초기화)
		// char ch = ' '; char는 공백이라도 있어야함.
		
		System.out.println("원하는 내용을 입력하세요: ");
		input = scanner.nextLine(); // 한 라인 입력
		// input = scanner.next(); 공백 기준으로 입력
		System.out.println("입력 내용:" + input);
		
		scanner.close();
		System.out.println("프로그램 종료");

	}

}


/* 디버깅 순서
 * 
 * 1.숫자옆에 파란색 부분에 더블클릭으로 브레이크포인트 설정
 * 
 * ex)input 변수에 어떤값이 들어왔는지 확인
 * 2.run에 debug 선택
 * 
 * 3. 이동
 * 	F6 : step over (한 라인씩 실행)
 * 	F5 : step into (함수 내부로 이동)
 * 
 * 	continue : 다음 breakpoint까지
 * 	resume : 실행
 * 
 * 
 * 
 * 
 */
