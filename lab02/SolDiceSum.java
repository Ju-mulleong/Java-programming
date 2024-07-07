/**
 * Lab 2.2 
 *    
 * - 두 주사위 눈의 합 계산 프로그램 : 
 *   . 눈의 합이 5이면 출력 후 종료, 눈의 합이 5가 아니면 계속 던짐
 * - 내용 
 *  . 랜덤값 생성
 *  . 조건문 사용 
 *  . 반복문 및 break 사용  
 * 
 * ==========================================================================
 */
package lab02;

public class SolDiceSum {
	
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int sum = 0;
		
		while(true) {
			num1 = (int)(Math.random() * 6) + 1;
			num2 = (int)(Math.random() * 6) + 1;
			sum = num1 + num2;
			
			System.out.printf("주사위(%d, %d) = %2d -> ", num1, num2, sum);
			if(sum == 5) {
				System.out.println("주사위의 합은 5입니다.");				
				break;
			}
			else {
				System.out.println("다시 주사위를 던집니다.");				
			}
		}
		System.out.println("프로그램 종료");
	}

}
