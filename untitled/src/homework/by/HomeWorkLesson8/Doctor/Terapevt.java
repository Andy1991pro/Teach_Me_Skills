package homework.by.HomeWorkLesson8.Doctor;

public class Terapevt extends Doctor {
    @Override
    public void heal(Client client) {
        System.out.println("I am looc "+client.getName());
    }
}
