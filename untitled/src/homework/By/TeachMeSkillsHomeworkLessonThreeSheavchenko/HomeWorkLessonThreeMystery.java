package homework.By.TeachMeSkillsHomeworkLessonThreeSheavchenko;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkLessonThreeMystery {
    public static void main(String[] args) {

        int x,i = 0;
    Scanner input = new Scanner(System.in);
    i = new Random().nextInt(10);
    do{
        System.out.println("Enter number");
        x= input.nextInt();
        if (x > i) System.out.println("My number litle");
        else if (x < i) System.out.println("My number more"); else System.out.println("True");}
    while (x!=i);}}