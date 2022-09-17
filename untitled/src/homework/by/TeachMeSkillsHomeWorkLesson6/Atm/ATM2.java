package homework.by.TeachMeSkillsHomeWorkLesson6.Atm;

public class ATM2 {
    int coins20;
    int coins50;
    int coins100;
    int allSum;
    public int getAllSum() {
        return allSum;
    }
    public void addAtm(int coins20, int coins50, int coins100){
        this.coins20=coins20;
        this.coins50=coins50;
        this.coins100=coins100;
        allSum=coins20*20+coins50*50+coins100*100;
        }
    public void cashWithdrawal(int sum){
        int x=0;
        int y=0;
        int r=0;
        for (int i = 1; i <= coins100 && sum >= 100; i++) {
            sum -= 100;
            x=i;
            }
        System.out.println("Bill 100 :"+x );
        for (int j=1;j<=coins50&&sum>=50;j++){
        sum-=50;
        y=j;
            }
        System.out.println("Bill 50  :"+y);
        for (int g=1;g<=coins20&&sum>20;g++){
        sum-=20;
        r=g;
        }
        System.out.println("Bill 20  :"+r);
        System.out.println("Account balance :"+sum);
    }
}


