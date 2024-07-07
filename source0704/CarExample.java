package source0704;

public class CarExample {

	public static void main(String[] args) {
		// Car 객체 생성
		Car myCar = new Car(); 	// 객체 생성; Car 클래스의 생성자 호출
								/* new 사용하는 형식이
								 * 호출할 클래스명 객체명 = new 생성자명  이런 형식인가? ㄴㄴ
								 * 		  클래스 변수  = new 클래스()->생성자 호출
								 * 
								 * Car myCar; 만으로는 myCar.model 사용 불가능
								 */
		
		
		// Car 객체의 필드값 읽기
		System.out.println("모델명: " + myCar.model);
		System.out.println("시동여부: " + myCar.start);
		System.out.println("현재속도: " + myCar.speed);
		
		
		Car secondCar = new Car("Hyundai", true, 20); //파라미터 개수로 구분? 오버로딩 참고
		
		
		System.out.println("모델명: " + secondCar.model);
		System.out.println("시동여부: " + secondCar.start);
		System.out.println("현재속도: " + secondCar.speed);
		
		
		
	}

}
