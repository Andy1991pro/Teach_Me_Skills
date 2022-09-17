package homework.by.TaechMeSkills.HomeWorkLesson8.Phone;

import java.util.Arrays;

public class Phone1 {
   private String number = "+375 (25) 534-74-69";
   private String model = "Samsung";
   private String name = "Andrey";
   private int weight = 135;


    public Phone1(String number,String model, int weight) {
        this(number,model);
        this.weight=weight;
        System.out.println("Number :"+number);
        System.out.println("Model :"+model);
        System.out.println("Weight :"+weight);

    }
    public Phone1(String number,String model){
        this.number=number;
        this.model=model;
    }
    void receiveCall(String name){
        System.out.println("Ringing "+ name+" "+ number);

    }
    void sendMessage(String... number) {
        System.out.println("Message sent to subscribers :"+ Arrays.toString(number));
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
