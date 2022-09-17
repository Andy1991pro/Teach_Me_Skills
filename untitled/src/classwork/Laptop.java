package classwork;

public class Laptop  extends Computer {
    public Laptop(int batteryLife){
        super("model");
        this.batteryLife = batteryLife;
    }
    final int batteryLife;

    @Override
    public  void setCost(int cost){
        super.setCost(cost +5);
    }
    public void test(){
        this.setCost(5);
        super.setCost(10);
       // System.out.println(.setOst);
    }
}
