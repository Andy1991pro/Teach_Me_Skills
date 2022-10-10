package homework.by.lesson19;

public class MyHomeThread extends Thread {
@Override
public void run(){
        System.out.println("Thread :"+ this.getName()+" -> "+getClass());
    }
}
