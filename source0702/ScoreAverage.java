package source0702;

public class ScoreAverage {
	
	public static void addArray(double[][] s) {
		for(int year =0; year <s.length; year ++) { // 행의 길이
			for(int term =0; term < s[year].length; term ++) { //각 행의 열의 길이
				s[year][term] = s[year][term] + 10; // score 배열의 값을 변경
			}
		}
	}
	// static 함수인 main()에서 다른 함수(addArray)를 호출하는 경우
	// 해당 함수는 static 함수로 선언되어야 함

	public static void main(String[] args) {	// static: 객체 생성이전에 사용가능
		double score[][] = {{3.3, 3.4},			// 1학년 1, 2학기 평점
							{3.5, 3.6},			// 2학년 1, 2학기 평점
							{3.7, 4.0},			// 3학년 1, 2학기 평점
							{4.1, 4.2, 4.5}};	// 4학년 1, 2학기 평점, 계절학기 
		double sum = 0;
		System.out.println("score.length: " + score.length);
		System.out.println("score[0].length: " + score[0].length);
		addArray(score); // 배열 이름만 전달: 배열의 주소만 전달
		
		for(int year = 0; year < score.length; year ++)
			for(int term=0; term < score[year].length; term++)
				sum += score[year][term];
		
		int n = score.length; // 행의 길이
		int m = score[0].length; // [0]행의 열의 길이
		System.out.println("평균 평점은 : " + sum/(n*m));				
				
		}

	}


