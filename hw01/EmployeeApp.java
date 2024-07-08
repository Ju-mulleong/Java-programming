package hw01;

// @author 2018111620 주재현

import lab04.Employee;

import java.util.Scanner;

public class EmployeeApp {
    static final int MAXNUM = 3;





    public static void main(String[] args) {

        Employee[] employee = new lab04.Employee[MAXNUM];
        int option = 0; //
        Scanner scanner = new Scanner(System.in);

        //배열 원소마다 객체 생성
        for(int i = 0; i< MAXNUM; i++) {
            employee[i] = new Employee();
            // Employee가 클래스로서 매개변수를 가지니까()가 있는거,
            // 객체 생성이니까 new까지
            // employee는 이미 위에서 타입을 명시했기 떄문에 이번엔 타입 명시 안해도 되는것
        }

        staffs[0].setName("John",	"Smith");
        staffs[0].setAge(25);
        staffs[0].setPosition("Newcomer");
        staffs[0].setSalary(300);
        engineers[0].setName("Bob",	"Lewis");
        engineers[0].setAge(28);
        engineers[0].setPosition("Junior	Engineer");
        engineers[0].setSalary(350);
        engineers[0].setOverWorkingDay(17);


    }









































}


