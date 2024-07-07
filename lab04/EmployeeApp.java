package lab04;

public class EmployeeApp {
	static final int NUM_EMPLOYEE = 5; //직원 수 설정
	
	
	public static void main(String[] args) {
		
		//객체 배열 선언 및 생성
		//Employee는 사용자 정의 클래스 그래서 Employee 클래스 만들라고 한것
		// String은 자바에서 기본적으로 제공하는 믈래스, int는 자바의 기본 타입
		Employee employee[] = new Employee[NUM_EMPLOYEE]; 
		
		//배열 원소마다 객체 생성
		for(int i = 0; i<employee.length; i++) {
			employee[i] = new Employee();
			// Employee가 클래스로서 매개변수를 가지니까()가 있는거, 
			// 객체 생성이니까 new까지
			// employee는 이미 위에서 타입을 명시했기 떄문에 이번엔 타입 명시 안해도 되는것
		}
	}

}



/*
 *  데이터를 메인에서 입력하여서 객체 배열에 저장
 */
 
