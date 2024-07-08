package source0708;

public class SmartPhone extends Phone {
	//필드 선언
	public boolean wifi;
	
	//생성자 선언
	public SmartPhone(String model, String color) {
		// 2) 부모 생성자 호출(내부적으로 호출)
		// super()를 호출하지 않아도 자동으로 호출됨
		
		this.model = model;
		this.color = color;
		System.out.println("ShmartPhone(String model, String color) 생성자 실행됨");
	}
	
	//메소드 선언
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경했습니다.");
	}
	
	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}

}
