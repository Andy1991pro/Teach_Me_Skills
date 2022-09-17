package homework.by.TaechMeSkills.HomeWorkLesson8.Doctor;

public class Dentist extends Doctor{

    @Override
    public void heal(Client client) {
        System.out.println("I am dreling " + client.getName());

    }
}
