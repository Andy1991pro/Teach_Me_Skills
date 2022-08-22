package homework.By.TeachMeSkillsHomeWorkLessonSix.ATM;

import java.util.Scanner;

public class ATM2 {
    int bill20=20;
    int bill50=50;
    int bill100=100;
    int coins20;
    int coins50;
    int coins100;
    int allsum;


    public void addatm(int coins20, int coins50, int coins100){
        this.coins20=coins20;
        this.coins50=coins50;
        this.coins100=coins100;
        allsum=coins20*=bill20+=coins50*=bill50+=coins100*=bill100;
        System.out.println("All sum"+allsum);

    }
    public boolean cashWithdrawal(int sum){
        if (sum>allsum||sum<20){
            System.out.println("Insufficient funds");}
        else;
        return false;
    }}
