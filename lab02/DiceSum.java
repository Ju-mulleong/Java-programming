package lab02;

// @author 2018111620 주재현
public class DiceSum {

	public static void main(String[] args) {
		
		while (true) {
			
			int num1 = (int)(Math.random() * 6) + 1;
			int num2 = (int)(Math.random() * 6) + 1;
			int sum = (num1+num2);
			
			System.out.printf("주사위(%d, %d) = %2d -> 다시 주사위를 던집니다.", num1, num2, sum);
			System.out.println();
			
			if (sum == 5) {
				break;			
			}
		}
		
		System.out.print("프로그램 종료");
	}
}




