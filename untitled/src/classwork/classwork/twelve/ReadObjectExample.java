package classwork.classwork.twelve;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

                            // Читаем файл который создали ранее  //

public class ReadObjectExample {
    public static void main(String[] args) {
        Person LastPerson = null; // Создаем нулевое значение персоны, чтоб потом записать последнее значение
        try (FileInputStream fis = new FileInputStream("objsample.txt")) { // Принимаем файл который создали раньше
            ObjectInputStream ois = new ObjectInputStream(fis);                   //  Принимаем файл
            while (true){                             // Делаем цикл чтоб забрать все строчки
                LastPerson = (Person) ois.readObject(); // ois.readObject() {Читает объект}
                System.out.println(LastPerson); // Выводим на печат строчки которые приняли из файла
            }
        } catch (IOException e) {
            System.out.println("here");              // Ловим ошибку
        } catch (ClassNotFoundException e) {
            System.out.println("here 2");            // Ловим вторую ошибку
        } LastPerson.setAge(40); // Задаем новое значение возраста
        System.out.println(LastPerson);
    }
}
