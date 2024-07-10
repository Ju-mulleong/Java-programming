package source0710;

public class Note0710 {
}

/*
Object 모듈 위주

    java.lang
        import문 없이 사용 가능한 자바언어의 기본 클래스를 제공
        ex)String,System,Integer 등

    java.util
        자료 구조와 관련된 컬렉션 클래스 제공
        ex) Scanner


java.base
    java.lang
        Object: 최상위 클래스
                자바의 모든 클래스는 Object의 자식이거나 자손 클래스

            equals: 원래대로라면 Object의 equals는 객체의 번지만 비교
                    (String은 오버라이딩 한것)
                    이처럼 다른 클래스에서 재정의하여 사용

            hashCode:   객체의 해시코드를 리턴

            toString: 객체 자신의 정보를 문자열로 리턴(객체를 출력할 때 사용)

            Object의 메소드는 기본적으로 사용자의 클래스에서 재정의하여 사용.

equals(Object obj)
    기본적으로는 단순히 두 객체의 주소만 비교(==)

    일반적으로 Object의 equals는 각 클래스에서 재정의(override)해서 사용
    ex)String의 equals()
    이클립스에서는 open 디클레이션? 누르면 클래스 내부 확인 가능

    String에서 재정의:
        두 객체의 주소가 같은 경우 true 반환
        두 객체의 주소가 서로 다른 경우, 문자열의 길이와 내부의 데이터가 같은 지 비교

객체 해시코드(Hash code)
    객체를 식별하는 상수

    Object 클래스의 hashCode() 메소드
        객체의 메모리 번지를 이용해서 해시코드를 생성
        객체마다 다른 정수값을 리턴

    두 객체의 동등함 비교 방식
        hashCode()와 equals() 메소드를 같이 사용
        hashCode()가 리턴하는 정수값이 같은지 비교
        hashCode 리턴값이 같은데도 equals비교하는 이유:
            클래스마다 hashCode를 구현하는 방식이 달라서 우연히
            hashCode값이 같을 수도 있기 때문에

중요한 건 필요에따라 equals(), hashCode()를 재정의해서 사용할 수 있다.

toString()
    객체의 정보를 문자열로 리턴(객체를 문자열로 표현)

    Object 클래스의 toString() 메소드
        객체의 문자 정보를 리턴
        '클래스명@16진수해시코드'

    !!System.out.println(객체) : 객체의 toString() 메소드를 자동 호출

break point 걸어서 println확실하게 확인하기

레코드(record)
Database에서는 배열에서 한 행을 레코드 라고한다.
데이터 전달을 위한 객체

record 선언
    class 키워드 대신에 record 사용
    클래스 이름 뒤에 저장할 데이터 종류를 변수로 선언

    ex) public recode Person(String name, int age) {}
    record소스 컴파일
        private final 필드 자동 생성
        위의 예시를 사용하면, name과 age에 private final 적용
        생성자 및 Getter 메소드 자동 추가
        hashCode(), equals(), toString() 메소드 자동 추가

    인텔리제이에서 record 생성 찾기

키보드 입력
    잘 안씀 한번 보기만


시스템 속성(System Property) 읽기
    파이썬의 딕셔너리와 유사
    키와 밸류의 한 쌍으로 이루어짐

문자열 관련 클래스 계층도 중요
    직렬화: 객체 또는 데이터를 외부에서 사용할 수 있도록 바이트 형태로 데이터 변환(직렬화)
    객체를 파일로 저장

문자열 클래스
    CharSequence 인터페이스

    문자열 관련 주요 클래스
        String.split()과 StingTokenizer 유사
        .split을 좀 더 자주 씀

String 클래스
    상속이 불가능한 final 클래스이며, 변경이 불가능한 immutable 클래스

String -> CharSequence 변환
    단순히 upcasting만 해주면된다! 중요

CharSequence -> String 변환
    Type casting 방식이 가장 일반적

String 객체는 원천적으로 수정이 불가능 (final 사용했으므로)
    따라서 문자열 변경 시 기존 문자열을 변경하지 않고,
    새로운 문자열이 생성되는 방식(새로운 객체 생성, 기존 객체는 garbage)
    concat 과 +는 동일한 기능


과제: row만 다르다, column은 같.
    scanner close는 전체 메뉴 종료할때(0번 눌렀을때만) close

concat() 메소드
    문자열 연결 메소드
    기존 String 객체에 연결되지 않고, 새로운 String 객체를 리턴(새로운 문자열 생성)

"+" 연산자: 문자열 연결
    피연산자에 문자열이나 객체가 포함되어 있는 경우
        객체는 자동으로 객체.toString()을 호출하여 문자열로 변환하여 연결
        기본 타입 값은 자동으로 문자열로 변환하여 연결

compareTo() 메소드: 문자열 비교
    리턴값
        단순하게 빼기 연산이라고 생각
        모든 문자는 숫자와 매핑되어있다.

문자열 공백 제거
    String.trim() 보다
    String.strip() 사용, 중간 공백은 replace(" ", "")사용하여 제거

StringBuffer 클래스
    가변 크기의 문자열 저장 클래스
    String 클래스와는 달리 문자열 '변경'이 가능
    멀티 쓰레드 환경에서 '동기화 기능' 제공

    39p 그림
        첫번째 그림: 인덱스를 말 그대로 밀어내는 것

        delete는 end 포함 안됨, sb.delete(0,2)면 [0], [1]만 삭제

StringTokenizer 클래스
    하나의 문자열을 여러 문자열로 분리
    token: 구분 문자로 분리된 문자열
    String 클래스의 split()메소드를 이용하여 동일한 기능 구현 가능, 그래서 많이 안씀

포장 클래스(Wrapper class)
    자바의 기본 타입의 값을 가지는 객체
    그때 배웠던 것- int같은 값은 기본 자료형이었다.
    이걸 감싸서 객체로 만들수 있는 것

    boxing and unboxing
        옛날에는 함수 써서했지만, JDK 1.5 부터는 대입하듯이 하면 자동 처리
        Inerger ten = 10;
        int n = ten;
        쓰는 이유
            컬렉션 등에서 정수등을 저장하더라도 객체로 저장할수밖에없어서
            또는 parseInteger
            보통 문자열과 기본자료형을 서로 변환할때 사용

Math 클래스
    Math.abs();형태로 사용

    Math.random()
        기본적으로 0.0이상 1.0 미만의 임의의 double 값 반환
        여기서 상수 붙이고 곱하고 해서 우리가 원하는 범위 만드는 것

    java.util.Random 클래스
        seed 값이 같으면 동일한 랜덤값 얻음
            -마크 맵 시드 같은느낌?

        int nextInt(int n);
            제일 많이 사용
            int 타입의 랜덤값 리턴( 0 <= 랜덤값 < n)

중요한 것
    5p



 */