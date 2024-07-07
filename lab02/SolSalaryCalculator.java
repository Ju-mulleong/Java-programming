/**
 * Lab 02. 3,4장. 조건, 반복문  
 * - 한 달 동안 근무시간에 따른 월급 계산 프로그램 
 * - 기본급 + 초과근무 비용 계산  
 *  . 반복문 및 break 사용: 무한반복  
 *  . 조건문 사용: 해당 조건에 따른 연산 결과 출력  
 *  . Scanner() 객체 사용 
 * 
 * ==========================================================================
 */
package lab02;

		
import java.util.Scanner;

public class SolSalaryCalculator {
	public static void main(String[] args) {
		final int HOUR_PAYMENT = 9860;
		final int BASE_HOUR = 160;
		final double OVERTIME_RATE = 1.5;
		
		int workingHour = 0;
		int overtime = 0;
		int salary = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("한달 동안 근무한 시간을 입력하세요: ");
			workingHour = sc.nextInt();
			
			if(workingHour == -1)
				break;
			
			if(workingHour <= BASE_HOUR) {
				salary = workingHour * HOUR_PAYMENT;
				overtime = 0;
			}
			//else if(workingHour > BASE_HOUR) {
			else {
				overtime = workingHour - BASE_HOUR;
				salary = (BASE_HOUR * HOUR_PAYMENT) + 
						(int)(overtime * HOUR_PAYMENT * OVERTIME_RATE);
			}
			
			System.out.printf("총 근무시간: %d시간, 초과 근무시간: %d시간, 월급: %,d원 \n",
					workingHour, overtime, salary);

		}
		System.out.println("프로그램 종료");
		sc.close();
	}
}
