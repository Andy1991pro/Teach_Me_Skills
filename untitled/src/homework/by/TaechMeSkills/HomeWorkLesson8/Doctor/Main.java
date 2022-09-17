package homework.by.TaechMeSkills.HomeWorkLesson8.Doctor;

import org.jetbrains.annotations.NotNull;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Client[] clients = getClients();

        for (Client client : clients){
        Doctor doctor = DoctorFactory.getDoctorByMedicalPlan(client.getMedicalPlan());
        doctor.heal(client);
    }
}

    @NotNull
    private static Client[] getClients() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter user: ");
        int size = scanner.nextInt();
        Client client = getClient();
        Client [] clients = new Client[size];
        for (int i=0; i<size; i++){

        clients[i] = getClient();}
        return clients;
    }

    @NotNull
    private static Client getClient() {
        Random r= new Random();
        int nextVale = r.nextInt(4);
        Client client = new Client("Andy"+ nextVale);
        MedicalPlan medicalPlan = new MedicalPlan(nextVale);
        client.setMedicalPlan(new MedicalPlan(nextVale));
        client.setMedicalPlan(medicalPlan);
        return client;
    }
}
