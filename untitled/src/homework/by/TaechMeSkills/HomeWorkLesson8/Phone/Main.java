package homework.by.TaechMeSkills.HomeWorkLesson8.Phone;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("+375 25 8674564","Samsung", 150);
        phone.receiveCall("Andrey");
        phone.sendMessage("+375 25 8674564","+375 44 6931538");

        Phone1 phone1 = new Phone1("+375 25 6984532","Iphone",280);
        phone1.receiveCall("Victor");
        phone.sendMessage("+375 25 8674564","+375 25 6984532","+375 44 6931538");

        Phone2 phone2 = new Phone2("+375 44 6931538","Redme",160);
        phone2.receiveCall("Ira");
        phone.sendMessage("+375 25 6984532","+375 44 6931538");



    }
}
