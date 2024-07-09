package source0709;

public class FeaturePhone implements PhoneInterface {


    @Override
    public void sendCall() {

    }

    @Override
    public void receiveCall() {

    }

    public void flash(){
        System.out.println("플래쉬가 켜졌습니다.");
    }

    //object의 메소드도 자동 추가하는법 인텔리j 알아오기
}
