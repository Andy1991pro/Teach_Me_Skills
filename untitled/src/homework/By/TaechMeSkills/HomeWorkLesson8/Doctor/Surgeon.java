package homework.By.TaechMeSkills.HomeWorkLesson8.Doctor;

public class Surgeon extends Doctor{

    @Override
    public void heal(Client client) {
        System.out.println("I am eporezal "+client.getName());
    }
    }

