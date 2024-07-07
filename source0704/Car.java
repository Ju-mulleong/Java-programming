package source0704;

public class Car {
	// 필드 선언
	String model;
	boolean start;
	int speed;
	
	// 생성자
	public Car() { //파라미터 없음-기본 생성자
		model = "";
		start = false;
		speed = 0;
	}
	
	public Car(String modelname, boolean tf, int defaultspeed) {
		model = modelname;
		start = tf;
		speed = defaultspeed;
	}
}
