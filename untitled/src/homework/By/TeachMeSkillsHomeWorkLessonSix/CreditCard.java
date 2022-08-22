package homework.By.TeachMeSkillsHomeWorkLessonSix;

import java.util.Scanner;

public class CreditCard {
    private int accout;
    private int amout;

    public CreditCard(int acciut, int amout) {
        this.accout=acciut;
        this.amout=amout;
    }

    public int getAccout() {
        return accout;
    }

    public void setAccout(int accout) {
        this.accout = accout;
    }

    public int getAmout() {
        return amout;
    }

    public void setAmout(int amout) {
        this.amout = amout;
    }


    public void addMoney (int summ) {
        amout+=summ;
        System.out.println("Accaut "+accout+" remainder "+amout);

    }
    public void rehoveMoney (int summ) {
        if (amout >= summ){
        amout -= summ;
            System.out.println("Accaut "+accout+" remainder "+amout);}
        else {
            System.out.println("Insufficient funds");
        }
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "accout='" + accout + '\'' +
                ", amout=" + amout +
                '}';
    }
//    public void creditCard(){
//       Scanner accout = new Scanner(System.in);
//        System.out.println("Enter user name");
//    }
}
