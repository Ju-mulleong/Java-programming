package lab01;
import java.util.Scanner;
import java.lang.Math;


public class CalculateCircle {
	/**
	 * main() 메소드
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String radious = ""; //string이라 가능, chr이었으면 ' ' 했어야함
	
		
		System.out.print("원의 반지름 길이 입력: ");
		radious = scanner.nextLine();
		
		int Intr = Integer.parseInt(radious);
		
		double circumference = 2*Math.PI*Intr; 
		double area = Math.PI*Intr*Intr;
		//자바는 float보다 double이 디폴트
		
		scanner.close();
		System.out.printf("반지름 : %d, 원의 둘레: %.2f, 원의 넓이: %.2f",Intr,circumference,area);
		
		
	}

}


/*
 * import java.util.Scanner; //java.lang.Math 안쓰나?

public class Circle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int r;
		
		System.out.print("원의 반지름 길이 입력: ");
		r = scanner.nextInt();
		System.out.printf("반지름: %d, 원의 둘레: %.2f, 원의 넓이: %.2f", 
						r, 2*Math.PI*r, Math.PI*r*r);
						
						//세밀하게 출력형식을 조절할때 사용하는게 printf
		
		scanner.close();

	}

}

 * 
 * 
 * 
 */
