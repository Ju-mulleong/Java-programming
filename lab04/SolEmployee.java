/**
 * Lab #04. 직원 관리 프로그램 
 * - Employee.java 
 * - 기능
 * 		. setter methods: 이름, 나이, 직위, 월급 입력 메소드 
 * 		. getter methods: 이름, 나이, 직위, 월급 출력 메소드 
 * 		. 전체 직원 정보 출력 메소드 
 */
package lab04;

public class SolEmployee {
	String fullName;
	int age;
	String position;
	int salary;
	
	public SolEmployee() {
		fullName = "";
		age = 0;
		position = "";
		salary = 0;
	}
	
	/**
	 * 직원의 나이 입력 메소드 
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * 직원의 직원 입력 메소드 
	 * @param pos
	 */
	public void setPosition(String pos) {
		this.position = pos;
	}
	
	/**
	 * 직원의 first name과 last name을 입력 받아서 fullName에 저장하는 메소드   
	 * @param fname
	 * @param lname
	 */
	public void setName(String fname, String lname) {
		this.fullName = fname + " " + lname;
	}
	
	/**
	 * 직원의 월급 입력 메소드 
	 * @param salary
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	/**
	 * 직원의 나이 반환 
	 * @return
	 */
	public int getAge() {
		return this.age;
	}
	
	/**
	 * 직원의 전체 이름(Full name) 리턴 
	 * @return
	 */
	public String getName()
	{
		return this.fullName;
	}
	
	/**
	 * 직원의 직위를 반환 
	 * @return
	 */
	public String getPosition()
	{
		return this.position;
	}
	
	/**
	 * 직원의 월급 반환 
	 * @return
	 */
	public int getSalary()
	{
		return this.salary;
	}
	
	/**
	 * 직원의 모든 정보를 화면에 출력하는 메소드 
	 */
	public void printEmployee()
	{		
		System.out.printf("%-20s %4d %22s %,12d\n", 
				getName(), getAge(), getPosition(), getSalary());
		
	}
}
