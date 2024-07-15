package source0715;

class SharedBoard {
    private int sum = 0; // 집계판의 합
    synchronized public void add() {
        int n = sum;
        Thread.yield(); //현재 실행중인 스레드 양보(없어도 됨, 교재에있어서 넣은것)
        n += 10;
        sum = n; // 증가한 값을 집계함에 기록
        System.out.println(Thread.currentThread().getName() +
                            " : " + sum);

    }
    public int getSum() {return sum;}
}

class StudentThread extends Thread {
    private SharedBoard board;

    public StudentThread(String name, SharedBoard board) {
        super(name);
        this.board = board;

    }
    public void run() {
        for(int i = 0; i<10; i ++) {
            board.add();
        }
    }
}



public class SynchronizedEx {
    public static void main(String[] args) {

        SharedBoard board = new SharedBoard();
        Thread s1 = new StudentThread("student1", board);
        Thread s2 = new StudentThread("student2", board);

        s1.start();
        s2.start();
    }
}
