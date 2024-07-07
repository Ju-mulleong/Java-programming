package lab01;
import java.util.Scanner;
public class Coffee {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input1,input2,input3 ="";
		
		
		System.out.print("아메리카노 판매 수: ");
		input1 = scanner.nextLine();
		int intInput1 = Integer.parseInt(input1);
				
		System.out.print("카페라떼 판매 수: ");
		input2 = scanner.nextLine();
		int intInput2 = Integer.parseInt(input2);
				
		System.out.print("카푸치노 판매 수: ");
		input3 = scanner.nextLine();
		int intInput3 = Integer.parseInt(input3);
		
		scanner.close();
		
		int price = intInput1 * 2000 + intInput2 * 3000 + intInput3 * 3500;
		System.out.printf("총 매출은 %,d 입니다.",price);
		

	}

}


/*import java.util.Scanner;

public class CoffeeShop {

	public static void main(String[] args) {
		int numOfAmericano, numOfCafelatte, numOfCappuccino;
		
		int americanoprice = 2000;
		int cafelatteprice = 3000;
		int cappuccinoprice = 3500;
		int totalSales = 0;
		
		Scanner input = new Scanner(System.in);	
		System.out.print("아메리카노 판매 수: ");
		numOfAmericano = input.nextInt();
		
		System.out.print("카페라떼 판매 수: ");
		numOfCafelatte = input.nextInt();

		System.out.print("카푸치노 판매 수: ");
		numOfCappuccino = input.nextInt();

		totalSales = (numOfAmericano * americanoprice) + (numOfCafelatte * cafelatteprice) + 
					(numOfCappuccino * cappuccinoprice);
		
		System.out.printf("총 매출은 %,d\n", totalSales);
		
		input.close();	//객체 닫아주기
	}

}



*/