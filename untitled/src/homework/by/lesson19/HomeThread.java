package homework.by.lesson19;

public class HomeThread {
    public static void main(String[] args) throws InterruptedException {
        MyHomeThread T1 = new MyHomeThread();
        MyHomeThread T2 = new MyHomeThread();
        MyHomeThread T3 = new MyHomeThread();
        T3.start();
        T3.join();
        T2.start();
        T2.join();
        T1.start();

    }
}
