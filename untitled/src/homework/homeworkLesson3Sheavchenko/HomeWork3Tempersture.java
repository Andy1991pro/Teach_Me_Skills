package homework.homeworkLesson3Sheavchenko;

import java.util.Random;

public class HomeWork3Tempersture {
    public static void main(String[] args) {
        int t =new Random().nextInt(60)-30;
        System.out.println(t);
        if (t >-5){
            System.out.println("Warm");}
        else if (t==-5) {System.out.println("Norma");}
        else if (t>-20) {System.out.println("Norma");}
        else if (t<-20) {System.out.println("Cold");}



    }
}
