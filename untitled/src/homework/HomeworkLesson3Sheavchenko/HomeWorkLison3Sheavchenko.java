package homework.HomeworkLesson3Sheavchenko;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkLison3Sheavchenko {
    public static void main(String[] args) {
        System.out.println("Ugaday chislo");
        Scanner username = new Scanner(System.in);
        int x = username.nextInt();
        int i = new Random().nextInt(10);
        while (x != i) {
            if (x > i) {
                System.out.println("Mnogo");
            } else {
                System.out.println("Malo");
            }
            x = username.nextInt();
        }
        System.out.println("Verno");
    }
}

