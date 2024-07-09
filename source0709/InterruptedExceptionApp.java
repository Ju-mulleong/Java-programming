package source0709;

public class InterruptedExceptionApp {

    public static void main(String[] args) {
        for(int i = 0; i<10; i++){
            System.out.print( i + " ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // exception이 여러개일 경우,
                // 그냥 Exception으로 처리하는게 낫다.
                e.printStackTrace();
            }
        }
    }
}
