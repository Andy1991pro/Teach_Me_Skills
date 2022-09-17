package classwork.classwork.twelve12;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

                                   // Сохраняем объек в файл  //

public class WriteObjectsExample {
    public static void main(String[] args) {
        Person firstPerson = new Person("first",20);   // Создали персону
        Person secondPerson = new Person("second",30);

        try (FileOutputStream fos = new FileOutputStream("objsample.txt")) { //Создаем поток который будет записывать файл
            ObjectOutputStream outputStream = new ObjectOutputStream(fos);  // ObjectOutputStream {Поток который передает объект fos
            outputStream.writeObject(firstPerson);                          // outputStream.writeObject(firstPerson) {Говорим какой объект передаем
            outputStream.writeObject(secondPerson);                         // outputStream.writeObject(secondPerson) {Говорим какой объект передаем
        }  catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
