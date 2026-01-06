package jan06.thread;

public class ThreadClass2 implements Runnable {
    @Override
    void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread is running");
        }
    }
}
