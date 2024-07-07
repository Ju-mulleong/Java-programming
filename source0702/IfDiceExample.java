package source0702;

public class IfDiceExample {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6) + 1; //int 형변환!
		
		if(num == 1) {
			System.out.println("1번이 나왔습니다.");
		} else if (num==2) {
			System.out.println("번이 나왔습니다.");
		} else if (num==3) {
			System.out.println("3번이 나왔습니다.");
		} else if (num==4) {
			System.out.println("4번이 나왔습니다.");
		} else if (num==5) {
			System.out.println("5번이 나왔습니다.");
		} else {
			System.out.println("6번이 나왔습니다.");
		}

	}

}


/*
* if 문 작성
* 	파이썬처럼 들여쓰기가 아니라 {}로 블럭 만드는 것 주의
* 	pdf 4장 5p 참고
* 
* 
* 
* 
* 
*/