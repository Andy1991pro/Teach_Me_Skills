package homework.homeworkLesson3Sheavchenko;


import java.util.Scanner;

public class HomeWorkLisson3ScanerIn {
    public static void main(String[] args) {
        System.out.println("Enter the number from 1 to 100");
        Scanner Name = new Scanner(System.in);
        int UserNambe =Name.nextInt();
        int sum = 0;
        if  ((UserNambe < 101) && (UserNambe > 1)) {for (int i = 1; i<=UserNambe; i++){sum += i;}
            System.out.println("summa "+sum);}

        else {System.out.println("Enter another number");}}}






