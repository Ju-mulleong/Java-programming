/**
 * Lab #04. 직원 관리 프로그램 
 * - EmployeeApp.java
 * - main() 함수가 있는 클래스 
 * - 기능 
 * 		. Employee 객체 배열 생성 
 * 		. Employee 객체 배열에 Employee 객체 정보 저장 
 * 		. 저장된 객체 배열의 내부 데이터 출력 함수 
 */

package lab04;

import java.util.Scanner;

public class SolEmployeeApp {
	final static int MAXNUM = 5;
	
	/**
	 * 화면상에서 Employee 객체의 정보 입력 함수 
	 * @param solEmployee
	 */
	public static void inputEmployeeInfo(SolEmployee[] solEmployee)
	{
		int age=0;
		String firstname = "";
		String lastname = "";
		String position = "";
		int salary = 0;
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i < MAXNUM; i++)
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
			
			solEmployee[i].setName(firstname, lastname);
			solEmployee[i].setAge(age);
			solEmployee[i].setPosition(position);
			solEmployee[i].setSalary(salary);
		}
		scanner.close();
	}
	
	public static void displayPositions(SolEmployee[] solEmployee)
	{
		for(int i=0; i < MAXNUM; i++) {
			System.out.printf("%-20s: %s\n", 
					solEmployee[i].getName(), solEmployee[i].getPosition());
		}
	}
	
	public static void displaySalaries(SolEmployee[] solEmployee)
	{
		for(int i=0; i < MAXNUM; i++) {
			System.out.printf("%-20s: %,d\n", 
					solEmployee[i].getName(), solEmployee[i].getSalary());
		}
	}
	
	public static void displayNames(SolEmployee[] solEmployee)
	{
		for(int i=0; i < MAXNUM; i++) {
			System.out.printf("%-20s\n", solEmployee[i].getName());
		}
	}
		
	// display all information about employees
	public static void displayAllInfo(SolEmployee[] solEmployee)
	{
		for(int i=0; i < MAXNUM; i++)
			solEmployee[i].printEmployee();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SolEmployee[] solEmployee = new SolEmployee[MAXNUM];
		int option = 0;
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i< MAXNUM; i++) {
			solEmployee[i] = new SolEmployee();
		}
		
		solEmployee[0].setAge(34);
		solEmployee[0].setName("Alan", "Cooper");
		solEmployee[0].setPosition("Senior Engineer");
		solEmployee[0].setSalary(6500000);
		
		// Employee #2
		solEmployee[1].setAge(26);
		solEmployee[1].setName("Brendan", "Eich");
		solEmployee[1].setPosition("Junior Engineer");
		solEmployee[1].setSalary(5000000);
		
		// Employee #3
		solEmployee[2].setAge(38);
		solEmployee[2].setName("Dennis", "Richie");
		solEmployee[2].setPosition("Chief Engineer");
		solEmployee[2].setSalary(7800000);
		
		// Employee #4
		solEmployee[3].setAge(42);
		solEmployee[3].setName("Larry", "Wall");
		solEmployee[3].setPosition("Team Leader");
		solEmployee[3].setSalary(8200000);
		//employee[3].printEmployee();

		// Employee #5
		solEmployee[4].setAge(46);
		solEmployee[4].setName("Richard", "Stallman");
		solEmployee[4].setPosition("Project Manager");
		solEmployee[4].setSalary(9000000);

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
				displayPositions(solEmployee);
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
				displaySalaries(solEmployee);
				
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
				displayAllInfo(solEmployee);
				
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
