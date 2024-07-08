package hw01;

// @author 2018111620 주재현

// 사무실 직원 관리 클래스
public class Staff extends Employee {
    int annualSalary;

    public Staff() {
        annualSalary = 0;
    }

    // 연봉 계산 함수(월급*12)
    public int getAnnualSalary() {
        annualSalary = this.getSalary() * 12;
        return annualSalary;
        // 연봉 계산하여 반환
    }

    // 메소드 오버라이딩
    // 이름, 나이, 직위, 월급, 연봉 순서로 화면 출력
    public void printEmployee() {

        System.out.printf("%-20s %4d %22s %,12d %,20d\n",
                getName(), getAge(), getPosition(), getSalary(), getAnnualSalary());
    }




}
