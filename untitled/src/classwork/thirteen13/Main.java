package classwork.thirteen13;

import homework.by.HomeWorkLesson8.Doctor.Dentist;
import homework.by.HomeWorkLesson8.Doctor.Doctor;
import homework.by.HomeWorkLesson8.Doctor.DoctorHolder;

public class Main {
    public static void main(String[] args) {
        KeyHolder <String> keyHolder = new KeyHolder <> ("myKey");  // <String> и <> Объявляем тип переменной
        keyHolder.setValue("myKey");
        System.out.println(keyHolder.getValue());

        KeyHolder <Integer> keyHolder1 = new KeyHolder<>(11); // <Integer>  Для объявления переменной числом
        keyHolder1.setValue(11);
        System.out.println(keyHolder1);

        KeyHolder <Doctor> keyHolder2 = new KeyHolder<>(new Dentist()); // Можем работать со своими классами
        keyHolder2.setValue(new Dentist());

        DoctorHolder<Dentist> dentistDoctorHolder = new DoctorHolder<>(new Dentist()); // Можем вставить только класс доктора

//        int a;
//        double b;
//        boolean c;
//        long f;
//        char e;
//        byte g;

// Integer aint;
// Double bDouble;
// Character eChar;
// Boolean bool;
// Float fl;
// Byte bVal;
// Long Lval;
    }
}
