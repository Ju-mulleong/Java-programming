package lab04;

public class Employee {
	//필드값 설정?
	// Employee 객체 배열에 저장할 정보가 필드값이지
	int age;
	int salary;
	String position;
	String fullname;

	// 필드값 아래에 생성자
	public Employee() {
		fullname = "";
		age = 0;
		position = "";
		salary = 0;
	}
	
	
	
	// 나이 입력 메소드 나이 출력메소드여야 되는거아니야?
	// ㄴㄴ 입력 메소드 따로, 반환 메소드 따로, 출력 메소드 따로
	public void setAge(int age) { 
		this.age = age;
		// 이 객체의 age값을 매개변수 age로 설정
	}
	
	// 이름 입력 메소드
	// First name과 last name을 하나의 문자열 변수 String fullName에 저장
	public void setName(String firstname, String lastname) {	
		/*
		 매개변수 firstname과 lastname을 문자열로 받아서
		 둘을 합친 문자열 생성
		*/

		this.fullname = firstname + " " + lastname;
		// 이 객체의 fullname값을 
		// 매개변수 firstname + " " + 매개변수 lastname 으로 설정
		
		
	}
	
	// 직위 입력 메소드
	public void setPosition(String position) {	
		this.position = position;
		// 이 객체의 position값을 매개변수 position으로 설정
	}
	
	// 월급 입력 메소드: 정수형
	public void setSalary(int salary) {
		this.salary = salary;
		// 이 객체의 salary값을 매개변수 salary로 설정
	}
	
	// 직원 한 명의 나이 반환 메소드: 화면 출력에 사용
	public int getAge() {
		return this.age;
		// 이 객체의 age값을 반환
	}
	
	// 직원 한 명의 fullName 반환 메소드: 화면 출력에 사용
	public String getName() {
		return this.fullname;
		// 이 객체의 fullname값을 반환
	}
	
	// 직원 한 명의 월급 반환 메소드: 화면 출력에 사용
	public int getSalary() {
		return this.salary;
		// 이 객체의 salary값을 반환
	}
	
	// 직원 한 명의 직위 출력 메소드: 화면 출력에 사용
	public String getPosition() {
		return this.position;
		//이 객체의 position값을 반환
	}

	// 직원 한 명의 모든 정보 출력: 이름, 나이, 직위, 월급 순으로 출력
	// 아래의 getXXX() 메소드 활용
	public void printEmployee() {

		System.out.printf("%-20s %4d %22s %,12d\n",
				getName(), getAge(), getPosition(), getSalary());
	}
	
}

/*
this의 역할 확실히 알기
	this는 객체 자기 자신을 의미.
	즉 이 class에서 사용된 모든 this는 
	이 class로 인해 생성될 객체 자기 자신을 의미
	this.필드 형태로 사용!!








 */