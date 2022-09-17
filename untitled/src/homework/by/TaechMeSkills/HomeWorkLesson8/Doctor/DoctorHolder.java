package homework.by.TaechMeSkills.HomeWorkLesson8.Doctor;

public class DoctorHolder <T extends  Doctor> {
    T value;

    public DoctorHolder (T value){
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
