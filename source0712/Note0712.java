package source0712;

public class Note0712 {
}

/*

Set컬렉션
    저장 순서를 유지하지 않는 데이터 집합
    데이터 중복을 허용하지 않음
    중복된 데이터를 넣어도 알아서 걸러준다

HashSet
    Set인터페이스를 구현한 클래스
    hash: key와 value로 구성 (파이썬에서 딕셔너리와 유사)
    검색 속도 향상을 위해 hash로 검색

hashCode()와 equals()관계
    두 값이 같으면 그 각각의 해쉬코드도 동일하지만
    해쉬코드가 같다고 해서 그 값이 같은건 아님!

    HashMap의 경우
        새로운 데이터를 저장할 위치를 찾기 위해 key를 사용
        HashMap은 하나의 bucket에 LinkedList 형태로 저장됨
        딕셔너리와 마찬가지로, key는 중복될수 없다
        hashCode(key)의 값이 같은 경우, 중복 데이터를 검사하기 위해 equals(key)를 사용


HashSet 예제3
    set.add(E) -> hashCode() -> equals()
        hashCode()와 equals()로 중복 체크

Set 컬렉션 반복자
    for-each문 또는 iterator()메소드 사용

        for-each문은 for in list 와 비슷했다. 하나씩 뽑아서 쓰는거

    중복된 값이 있으면 제거
    간단하게 출력만 할거같으면 for-each가 가장 간단하고 직관적

    HashSetExample2로 바꿔서 코드 작성

데이터베이스 강의?
실제 업계에서 쓰는 깊이있는 것들은 따로 공부해야됨

=========================================
Map 컬렉션
    키(key)와 값(value)의 쌍으로 구성된 엔트기(Entry)객체를 다루는 컬렉션
    키와 값은 모두 객체
        키는 중복 저장 x
        기존 키에 새로운 값을 저장하면, 새로운 값으로 대치
            Set이랑 뭐가 다른겨?

Map 인터페이스 메소드
    V get(Object key)
        주어진 키와 연결된 값을 리턴
        해당 키가 없으면 null 리턴

    그 외..
    Map에서는 뭐든지 key를 사용하여 한다

HashMap<K,V>
    키와 값 쌍으로 구성되는 요소를 다루는 컬렉션

    값을 검색하기 위해서는 반드시 키를 이용

    요소 삽입시 map.put("홍길동",90);
        앞에 있는 리터럴이 키

    업데이트 기능이 따로 없고, 같은 키에 다른 값을 대입하면 수정됨

HashMap 순회방법
    방법1이 가장 쉽다, key를 이용하여 value찾음
    방법2는 키와 밸류값을 전부 (Entry)가져온다
    방법3 방법 1과 같다. 그냥 Iterator로도 가능하단 것만 알기


9p가 과제랑 가장 유사하다
    키를 객체의 특정 멤버로 지정할 수 있다


Hashtavle
    과거의 잔재

Properties
    Hashtable의 자식 클래스로 key와 value를 String 타입으로 제한한 컬렉션
    확장자가 .properties인 프로퍼티 파일을 읽을 때 사용
        key = value 형태의 텍스트파일
        프로퍼티 파일은 클래스 파일들과 함께 저장


TreeSet
    이진 트리(Binary tree)를 기반으로 한 Set 컬렉션
        이진 트리: 모든 노드들의 자식노드가 두 개 이하인 트리

    TreeSet에 객체 저장 방식
        부모 노드의 객체와 비교해서 낮은것은 왼쪽 노드, 높은 것은 오른쪽에 저장
        오름차순으로 정렬되어 저장

TreeSet 메소드
    pop대신 poll

TreeSet 예제
    headSet은 기준값보다 작은것(노드상 왼쪽 )
    tailSet은 기준값보다 큰것(노드상 오른쪽)

TreeMap
    이진 트리를 기반으로 한 Map 컬렉션
    key와 value가 저장된 Entry 저장

    부모의 'key'값과 비교해서 낮은 것은 왼쪽, 높은 것은 오른쪽 자식 노드에 Entry 객체 저장

Comparable 정렬 기준 설정
    java.lang패키지
    Comparable 인터페이스를 구현한 클래스는 정렬이 가능
        기본 오름차순 정렬

    Comparable 인터페이스 구현
        compareTo() 메소드 재정의
        같은 타입의 객체끼리 서로 비교
            기본 정렬: 오름차순
                기본  if(this.member < o.member) return -1 : 오름차순
                변형  if(this.member > o.member) return -1 : 내림차순

        주어진 객체보다 적으면 음수 리턴
        주어진 객체와 같으면 0 리턴
        주어진 객체보다 크면 양수 리턴







오름차순/내림차순 부등호 바꾸기

Multiple Comparator 활용 예제 #3
이게 제일 중요 작년 시험문제였다.

    익명 클래스
        클래스 정의와 객체 생성을 한 번에 작성
        GUI 프로그램에서 많이 사용
        원래는 클래스 만들면 ();로 끝나지만, 구현을 동시에 하므로
        (){};로 끝난다

    정렬할려면 hashMap을 list로 바꿔야됨.
    Collection.sort는 list만 들어간다(arraylist, linkedlist, vector)
    데이터만 뽑아와서 list로 바꿔야됨.
    map인터페이스 메소드 values가 최상위이므로 이것 이용해서 list로 바꿀 수 있다
    고민을 해봐 다 안떠먹여줍니다 그래야 여러분게 됩니ㅏㄷ


~~동기화된 컬렉션 까지 빠르게 스킵

수정할 수 없는 컬렉션 예제 한번씩 해보기

Collections 클래스 활용
    컬렉션에 대해 연산을 수행하고 결과로 컬렉션을 리턴
    Collections.shuffle(cardList); -> 자동으로 섞임

binarySearch()
    반드시 오름차순으로 정렬 후 binarySearch() 사용

Comparotor
    오늘 했던 것 중에 제일 중요 (23p)
    내가 만든 클래스, 어떤 특정한 필드를 기준으로 정렬을 어떻게 하는가




!!src 고치기!!
인터페이스를 구현하다

과제hw04
    데이터는 직접 집어넣기
    1000단위 콤마 %,d





 */