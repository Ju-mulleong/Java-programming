// @author 2018111620 주재현
package midterm;

import java.util.Scanner;
public class BankAccount {
	//필드값 초기 금액, 요청한금액(입금, 출금) 현재 잔액
	int iniAccount = 0;
	int callMoney = 0;
	int nowAccount = 0;
	Scanner scanner = new Scanner(System.in);
	
	public BankAccount(int iniAccount){
		
		this.iniAccount = iniAccount;
		nowAccount = iniAccount;
	}
	
	
	public void printmenu() {
		int inputValue;
		System.out.println("---------------------------------");
		System.out.println("KNU Bank 현금 입출금 프로그램");
		System.out.printf("현재 통장 잔액: %,d", nowAccount);
		System.out.println("---------------------------------");
		System.out.println("1.입금\n2.출금\n3.계좌조회\n4.종료");
		System.out.println("---------------------------------");
		
		chooseCase();
			
		
	}
	
	public void chooseCase() {
	// 잘못된 입력: 입력값이1,2,3,4가 아닐때
		int inputValue;
		System.out.println("");
		inputValue = scanner.nextInt();
		
		
		swith(inputValue);{ //?? 정수아닌가?
			case 1 :
				//입금 메소드 실행
				inAccount();
				
				//printmenu 실행
				printmenu();
			case 2 :
				//출금 메소드 실행
				outAccount();
				
				printmenu();
				//printmenu 실행
			case 3:
				//nowAccount 출력
				System.out.printf(" %,d",nowAccount);
				
				//printmenu 실행
				printmenu();
				
			case 4:
				//프로그램 종료
				System.out.println("Exit Program!");
				break;
				
			default :
				System.out.println("잘못된 메뉴 입력입니다. 다시 입력하세요.");
				
		}
		
	}

	// 입금 처리 메소드
	public void inAccount() {
		System.out.print("입금금액: ");
		callMoney = scanner.nextInt();
		
		if ((callMoney != 0)&&(callMoney % 10000 == 0)) {
			
			nowAccount += callMoney;
			System.out.println(nowAccount);
			
			
		}else {
			System.out.println("오류: 10,000원 단위의 금액을 입력하세요");
		}
	}
	
	
	// 출금 처리 메소드
	public void outAccount() {
		System.out.print("출금금액: ");
		callMoney = scanner.nextInt();
		
		if ((nowAccount>callMoney)&&(callMoney != 0)&&(callMoney % 10000 == 0)) {
			
			nowAccount -= callMoney;
			System.out.println(nowAccount);
		}else if(nowAccount<callMoney) {
			
			System.out.println("잔액이 모자랍니다. 다시 입력하세요.");
			
		}else {
			System.out.println("오류: 10,000원 단위의 금액을 입력하세요");
		}
			
		
	}
	
	
	

}
