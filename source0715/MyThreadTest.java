package source0715;

class MyThread extends Thread {
    @Override
    public void run() {
        for(int i = 10; i>=0; i--) {
            System.out.println(i + " ");
            try {
                sleep(1000);
            }catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MyThreadTest{
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();
    }

}