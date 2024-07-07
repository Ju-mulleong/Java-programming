package source0702;

public class GradingError {

	public static void main(String[] args) {
		int score = 95;
		
		if(score>=90) {
			System.out.println("점수가 100~90입니다.");
			System.out.println("등급은 A입니다.");
		} 
		if(score>=80) {
			System.out.println("점수가 80~89입니다.");
			System.out.println("등급은 B입니다.");
		} 
		if(score>=70) {
			System.out.println("점수가 70~79입니다.");
			System.out.println("등급은 C입니다.");
		} 
		else {
			System.out.println("점수가 70 미만입니다.");
			System.out.println("등급은 D입니다.");
		}

	}

}

/* 이렇게 하면 95점인데 c등급된다. 
*/