package homework.by.TeachMeSkillsHomeWorkLesson6;

public class CreditCard {
    private final int account;
    private int amount;

    public CreditCard(int account, int amount) {
        this.account=account;
        this.amount =amount;
    }










    public void addMoney (int sum) {
        amount +=sum;
        System.out.println("Account "+account+" remainder "+ amount);

    }
    public void removeMoney(int sum) {
        if (amount >= sum){
        amount -= sum;
            System.out.println("Account "+account+" remainder "+ amount);}
        else {
            System.out.println("Insufficient funds");
        }
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "account='" + account + '\'' +
                ", amount=" + amount +
                '}';
    }

}
