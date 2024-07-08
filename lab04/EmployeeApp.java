package lab04;

import java.util.Scanner;

public class EmployeeApp {
	static final int NUM_EMPLOYEE = 5; //직원 수 설정
	
	/*
	화면상에서 Employee 객체의 정보 입력 함수
	 */

	public static void inputEmployeeInfo(Employee[] employee) {
		Scanner scanner = new Scanner(System.in);

		int age = 0;
		String firstname = "";
		String lastname = "";
		String position = "";
		int salary = 0;

		for(int i=0; i < NUM_EMPLOYEE; i++)
		{
			System.out.println("Input employee information" + (i+1));

			System.out.print("First Name: ");
			firstname = scanner.nextLine();

			System.out.print("Last Name: ");
			lastname = scanner.nextLine();

			System.out.print("Age: ");
			age = scanner.nextInt();

			System.out.print("Position: ");
			position = scanner.nextLine();

			System.out.print("Salary: ");
			salary = scanner.nextInt();

			employee[i].setName(firstname, lastname);
			employee[i].setAge(age);
			employee[i].setPosition(position);
			employee[i].setSalary(salary);
		}
		scanner.close();
	}

	public static void displayPositions(Employee[] employee) {

		for(int i=0; i < NUM_EMPLOYEE; i++) {
			System.out.printf("%-20s: %s\n",
					employee[i].getName(), employee[i].getPosition());
					// Employee배열의 i인덱스의 객체의 getName 메소드
					// Employee배열의 i인덱스의 객체의 getPosition 메소드
		}
	}

	public static void displaySalaries(Employee[] employee)
	{
		for(int i=0; i < NUM_EMPLOYEE; i++) {
			System.out.printf("%-20s: %,d\n",
					employee[i].getName(), employee[i].getSalary());
		}
	}

	public static void displayNames(Employee[] employee)
	{
		for(int i=0; i < NUM_EMPLOYEE; i++) {
			System.out.printf("%-20s\n", employee[i].getName());
		}
	}

	// display all information about employees
	public static void displayAllInfo(Employee[] employee)
	{
		for(int i=0; i < NUM_EMPLOYEE; i++)
			employee[i].printEmployee();
	}


	public static void main(String[] args) {
		
		//객체 배열 선언 및 생성
		//Employee는 사용자 정의 클래스 그래서 Employee 클래스 만들라고 한것
		// String은 자바에서 기본적으로 제공하는 클래스, int는 자바의 기본 타입
		Employee[] employee = new Employee[NUM_EMPLOYEE];
		int option = 0; // 입력값에 따른 선택지 구분
		Scanner scanner = new Scanner(System.in);
		
		//배열 원소마다 객체 생성
		for(int i = 0; i< NUM_EMPLOYEE; i++) {
			employee[i] = new Employee();
			// Employee가 클래스로서 매개변수를 가지니까()가 있는거, 
			// 객체 생성이니까 new까지
			// employee는 이미 위에서 타입을 명시했기 떄문에 이번엔 타입 명시 안해도 되는것
		}

		// Employee #1
		employee[0].setAge(34);
		employee[0].setName("Alan", "Cooper");
		employee[0].setPosition("Senior Engineer");
		employee[0].setSalary(6500000);

		// Employee #2
		employee[1].setAge(26);
		employee[1].setName("Brendan", "Eich");
		employee[1].setPosition("Junior Engineer");
		employee[1].setSalary(5000000);

		// Employee #3
		employee[2].setAge(38);
		employee[2].setName("Dennis", "Richie");
		employee[2].setPosition("Chief Engineer");
		employee[2].setSalary(7800000);

		// Employee #4
		employee[3].setAge(42);
		employee[3].setName("Larry", "Wall");
		employee[3].setPosition("Team Leader");
		employee[3].setSalary(8200000);
		//employee[3].printEmployee();

		// Employee #5
		employee[4].setAge(46);
		employee[4].setName("Richard", "Stallman");
		employee[4].setPosition("Project Manager");
		employee[4].setSalary(9000000);


		do {
			System.out.println("========================================");
			System.out.println("1. Display all positions");
			System.out.println("2. Display all salaries");
			System.out.println("3. Display all information");
			System.out.println("0. Quit");
			System.out.println("========================================");
			System.out.print("-> ");

			option = scanner.nextInt();

			if(option == 1) {
				displayPositions(employee);
				/*
				System.out.println("----------------------------------------");
				System.out.printf("%-20s %-22s \n", "Name", "Position");
				System.out.println("----------------------------------------");

				for(int i=0; i < MAXNUM; i++) {
					System.out.printf("%-20s: %s\n",
							employee[i].getName(), employee[i].getPosition());
				}
				*/
			}
			else if(option == 2) {
				displaySalaries(employee);

				/*
				System.out.println("----------------------------------------");
				System.out.printf("%-20s %-12s\n", "Name", "Salary");
				System.out.println("----------------------------------------");

				for(int i=0; i < MAXNUM; i++) {
					System.out.printf("%-20s: %,d\n",
							employee[i].getName(), employee[i].getSalary());
				}
				*/
			}
			else if(option == 3) {
				displayAllInfo(employee);

				/*
				System.out.println("---------------------------------------------------------------");
				System.out.printf("%-20s %4s %22s %12s\n", "Name", "Age", "Position", "Salary");
				System.out.println("---------------------------------------------------------------");
				for(int i=0; i < MAXNUM; i++)
					employee[i].printEmployee();
				*/
			}
			else if(option == 0){
				System.out.println("Bye!");
				scanner.close();
			}
			else {
				System.out.println("Wrong number. Type again!");
			}
		} while(option != 0);


	}



}





/*
 *  데이터를 메인에서 입력하여서 객체 배열에 저장
 */
 
