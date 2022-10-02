package homework.by.HomeWorkLesson8.Doctor;

public class Client {

    private MedicalPlan medicalPlan;
    private String name;

    public Client(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public MedicalPlan getMedicalPlan() {
        return medicalPlan;
    }

    public void setMedicalPlan(MedicalPlan medicalPlan) {
        this.medicalPlan = medicalPlan;
    }



}
