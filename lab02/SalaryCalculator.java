package lab02;

import java.util.Scanner;

public class SalaryCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sumtime = 0;
		int overtime =0;
		int minpay = 9860;
		
		
		while(true) {
			System.out.print("한달 동안 근무한 시간을 입력하세요: ");
			sumtime = scanner.nextInt();
			
			if (sumtime == -1) {
				break;
			}
			
			overtime = sumtime-160;
			if (overtime < 0) 
				overtime = 0;
			int sumpay = (int) ((sumtime - overtime) * minpay + overtime * minpay * 1.5);
			
			System.out.printf("총 근무시간: %d시간, 초과 근무시간: %d시간, 월급: %,d원", sumtime, overtime, sumpay);
			System.out.println();
		}	
			
		System.out.println("프로그램 종료");
		scanner.close();

	}

}
