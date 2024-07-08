package hw01;

// @author 2018111620 주재현

// 개발자 관리 클래스
public class Engineer extends Employee {
    int overWorkingPay;
    int overWorkingDay;
    int annualSalary;

    public Engineer() {
        overWorkingDay = 0;
        overWorkingDay = 0;
        annualSalary = 0;
    }


    // 매 달 초과 근무 일수 저장
    public void setOverworkingDay(int day) {
        this.overWorkingDay = day;

    }

    // 초과 근무 비용 계산 (1일당 3만원)
    public int getOverworkingPay() {
        this.overWorkingPay = overWorkingDay*30000;
        return overWorkingPay;
    }

    // 연봉 계산 함수(월급 + 초과근무수당)*12
    public int getAnnualSalary() {
        annualSalary = (this.getSalary() + overWorkingPay) * 12;
        return annualSalary;
        // 연봉 계산하여 반환
    }


    // 메소드 오버라이딩
    // 이름, 나이, 직위, 초과 근무 비용, 월급, 연봉 순서로 화면 출력
    public void printEmployee() {

        System.out.printf("%-20s %4d %22s %17d %,12d %,20d\n",
                getName(), getAge(), getPosition(), getOverworkingPay(), getSalary(), getAnnualSalary());
    }






}
