package source0715;

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for(int i=10; i>=0; i--) {
            System.out.println(i + " Runnable");
            try {
                Thread.sleep(1000);
            }catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MyRunnableThread {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();


    }

}