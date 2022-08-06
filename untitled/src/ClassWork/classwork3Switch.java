package ClassWork;

import java.util.Random;

public class classwork3Switch {
//    public static void main(String[] args) {
//        System.out.println("Hello World");
//        int randomValue = new Random(2).nextInt();
//        System.out.println(randomValue);
//       //randomValue = r.nextInt();
//        System.out.println(randomValue);
//    }
//Использование if else


/*
    public static void main(String[] args) {
        System.out.println("Hello World");
        int randomValue = new Random().nextInt(12);
        System.out.println(++randomValue);

        int random = new Random().nextInt(12);
        random++;
        System.out.println(random);
        if (random <= 2) {
            System.out.println("zima");
        } else if (random <= 5) {
            System.out.println("vesna");
        } else if (random <= 8) {
            System.out.println("leto");
        } else if (random <= 11) {
            System.out.println("osen");
        } else if (random <= 12) {
            System.out.println("zima");
        }
    }*/

    public static void main(String[] args) {
        int random = new Random().nextInt(12);
        random++;
        System.out.println(random);
        switch (random){
            case 1,2,12:
                System.out.println("zima");
                break;
            case 3,4,5:
                System.out.println("vesna");
                break;
            case 6,7,8:
                System.out.println("leto");
                break;
            case 9,10,11:
                System.out.println("osen");
                break;

        }}

    }




