package source0711;

import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        //시작 시간과 끝 시간을 저장할 변수 선언
        long startTime;
        long endTime;

        //ArrayList 컬렉션 객체 생성 및 컬렉션 저장 시간 측정
        List<String> stringArray = new ArrayList<String>();

        startTime = System.nanoTime();
        for(int i = 0; i<10000; i++) {
            //ArraList의 0번 인덱스에 객체 추가
            stringArray.add(0,String.valueOf(i));
            //stringArray.add(String.valueOf(i));
        }
        endTime = System.nanoTime();

        System.out.printf("%-17s %8d ns \n", "ArrayList 걸린 시간: ",
                (endTime - startTime));
        /*---------------------------------------------------------*/
        //LinkedList 컬렉션 객체 생성 및 컬렉션 저장 시간 측정
        List<String> stringList = new LinkedList<String>();

        startTime = System.nanoTime();
        for(int i = 0; i<10000; i++) {
            //0번 인덱스에 객체 추가
            stringList.add(0,String.valueOf(i));
            //stringList.add(String.valueOf(i));
        }
        endTime = System.nanoTime();

        System.out.printf("%-17s %8d ns \n", "LinkedList 걸린 시간: ",
                (endTime - startTime));


    }


}

