package homework.by.TeachMeSkillsHomeWorkLessonFour;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWorkLessonFourMaxMin {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter Number");
        int number1 = number.nextInt();
        int[] arr = new int[number1];
        Random a = new Random();
        int j;
        for (j = 0; j < arr.length; j++) {
            int x = a.nextInt(10);
            arr[j] = x;


            System.out.println(arr[j]);
        }
        Arrays.sort(arr);
        System.out.println("Min" + "=" + arr[0]);
        System.out.println("Max" + "=" + arr[j-=1]);
        int sum1=0;
        for (int  i=0;i<arr.length;i++){
            sum1 += arr[i];}
        System.out.println("Mean" + "=" + sum1/(float)arr.length);
        System.out.println("Length"+"="+arr.length+"Sum"+sum1);

    }
       }

