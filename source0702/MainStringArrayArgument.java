package source0702;

public class MainStringArrayArgument {

	public static void main(String[] args) {
		if(args.length !=2) {
			System.out.println("프로그램 입력값이 부족");
			System.exit(0);
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);

	}

}

/* 터미널로 사용
 * cd(change directory) 사용한다
 * cd 내소스코드 주소 복붙
 * 실습 pdf 그대로 치면된다.
 * package없이 default package에서 한다면 이대로 하면됨, package사용은 명령어 다른가보다
 * dir 입력시 파일, 폴더 다 나옴
 * 
 * 터미널에서 java source0702.MainStringArrayArgument 10 20
 * 	으로 입력하면, args배열에 10과 20이 문자열로 각각(공백 기준) 저장됨.
 * 	그 다음은 코드대로, 각 인덱스의 값을 strNum1, strNum2에 문자열 변수로 할당?하고
 * 	문자열 변수를 정수형 변수로 parseInt 사용하여 바꾼뒤, 둘을 더한 값을 result에 할당한다.
 * 
 */
