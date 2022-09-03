package homework.By.TaechMeSkills.HomeWorkLesson8.Doctor;

public class DoctorFactory {
    public static Doctor getDoctorByMedicalPlan(MedicalPlan medicalPlan){
        if (medicalPlan.getCode()>2){
        return new Terapevt();
        }
        if(medicalPlan.getCode()==2){
            return new Dentist();
        }
        return new Surgeon();

    }
}
