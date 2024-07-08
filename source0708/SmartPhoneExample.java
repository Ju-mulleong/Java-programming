package source0708;

public class SmartPhoneExample {

	public static void main(String[] args) {
		//SmartPhone 객체 생성
		SmartPhone mySmartPhone = new SmartPhone("갤럭시", "은색");
		// Phone으로부터 상속받은 필드 읽기 (SmartPhone이 Phone으로부터 상속받았으니까)
		System.out.println("모델: " + mySmartPhone.model);
		System.out.println("색상: " + mySmartPhone.color);
		
		// SmartPhone의 필드 읽기
		System.out.println("와이파이 상태: " + mySmartPhone.wifi);
		// Phone으로부터 상속받은 메소드 호출
		mySmartPhone.bell();
		mySmartPhone.sendVoice("여보세요. ");
		mySmartPhone.receiveVoice("안녕하세요! 저는 홍길동인데요.");
		mySmartPhone.sendVoice("아~ 네, 반갑습니다.");
		mySmartPhone.hangUp();
		
		//SmartPhone의 메소드 호출
		mySmartPhone.setWifi(true);
		mySmartPhone.internet();
		
		// 다른 클래스의 메서드 호출할때는 그 객체.method명 인듯?
		
	}

}
