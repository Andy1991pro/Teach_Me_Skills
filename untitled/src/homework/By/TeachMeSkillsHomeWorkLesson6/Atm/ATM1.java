package homework.By.TeachMeSkillsHomeWorkLesson6.Atm;

import java.util.Scanner;

public class ATM1 {
    public static void main(String[] args) {
        ATM2 j = new ATM2();
        j.addAtm(10,10,10);
        Scanner sum =new Scanner(System.in);
        System.out.println("Amount available for withdrawal :"+j.getAllSum());
        System.out.println("Enter sum :");
        int x = sum.nextInt();
        j.cashWithdrawal(x);
    }
}
