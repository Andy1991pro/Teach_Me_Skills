package homework.by.TeachMeSkillsHomeworkLessonThreeSheavchenko;


import java.util.Scanner;

public class HomeWorkLessonThreeScannerIn {
    public static void main(String[] args) {
        System.out.println("Enter the number from 1 to 100");
        Scanner Name = new Scanner(System.in);
        int usernambe =Name.nextInt();
        int sum = 0;
        if  ((usernambe < 101) && (usernambe > 1)) {for (int i = 1; i<=usernambe; i++){sum += i;}
            System.out.println("summa "+sum);}

        else {System.out.println("Enter another number");}}}






