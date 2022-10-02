package homework.by.HomeWorkLesson8.Phone;

import java.util.Arrays;

public class Phone {
    private String number;
    private String model;
    private int weight;
    public Phone (String number,String model, int weight) {
        this(number,model);
        this.weight=weight;
        System.out.println("Number :"+number);
        System.out.println("Model :"+model);
        System.out.println("Weight :"+weight);

    }
    public Phone (String number,String model){
        this.number = number;
        this.model = model;
    }

    public Phone(){
            }
    void receiveCall(String name){
        System.out.println("Ringing "+ name+" "+ number);

    }
    void sendMessage(String... number) {
        System.out.println("Message sent to subscribers :"+Arrays.toString(number));
        System.out.println(" ");
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
