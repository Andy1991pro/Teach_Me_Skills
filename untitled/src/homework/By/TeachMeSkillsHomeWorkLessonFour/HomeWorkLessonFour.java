package homework.By.TeachMeSkillsHomeWorkLessonFour;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkLessonFour {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random i=new Random();
        for(int a=0;a<arr.length;a++){
            int x=i.nextInt(10);
            arr[a]=x;
            System.out.println(arr[a]);}
        System.out.println("Enter number");
        int number = new Scanner(System.in).nextInt();
        for(int y=0;y<arr.length;y++){
            if(arr[y]==number){
                System.out.println("There is coincidence");}
                else{
                    System.out.println("No coincidence");
                }


        }}}





