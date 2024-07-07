package source0702;

public class Grading {

	public static void main(String[] args) {
		int score = 75;
		
		if(score>=90) {
			System.out.println("점수가 100~90입니다.");
			System.out.println("등급은 A입니다.");
		} else if(score>=80) {
			System.out.println("점수가 80~89입니다.");
			System.out.println("등급은 B입니다.");
		} else if(score>=70) {
			System.out.println("점수가 70~79입니다.");
			System.out.println("등급은 C입니다.");
		} else {
			System.out.println("점수가 70 미만입니다.");
			System.out.println("등급은 D입니다.");

			
			
		}

	}

}


/* switch문
 * 
 * 	break 적기
 * 	default 생략가능하지만 왠만하면 적기
 * 	case문의 값은 정수, 문자열만 가능(변수, 수식등 불가능)
 *  yield를 사용하여 switch결과값을 return할수있다.
 */

