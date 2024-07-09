package source0709;

public class ExceptionHandlingExample2 {
    public static void printLength(String data) {
        try {
            int result = data.length();
            System.out.println("문자 수: " + result);
        } catch(NullPointerException e) {
            //System.out.println(e.getMessage()); //1번
            //System.out.println(e.toString()); //2번
            e.printStackTrace(); //3번
        } finally {
            System.out.println("[마무리 실행]");
        }
    }

    public static void main(String[] args) {
        System.out.println("[프로그램 시작]");
        printLength("ThisisJava");
        printLength(null);
        System.out.println("[프로그램 종료]");
    }


}

