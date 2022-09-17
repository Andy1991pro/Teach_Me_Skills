package classwork.classwork.twelve;

import java.io.FileWriter;
import java.io.IOException;

                                      // Записываем файл//

public class FileWriterExample {
    public static void main(String[] args) {
        try {   // FileWriter file = new FileWriter("sample.txt"); {Нужно оборачивать try/catch всегда}
            FileWriter file = new FileWriter("sample.txt"); // {Создаем новый файл. Он создался в корневой папке}
            file.write("This is first line\n");                 // .write {Создаем в нем строчку где \n перенос на новую строчку}
            file.write("This is second line\n");                // .write {Создаем вторую строчку где \n перенос на новую строчку}
            file.flush();                                           // .flush() {Записывает файл так же как и close()}
            file.close();                                           // .close() {Закрываем файл (Завершаем создание)}
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // try (FileWriter file = new FileWriter("sample.txt")) {если так, то файл закроется и сохранится сам.}
        // FileWriter file = new FileWriter("sample.txt", true); {true Говорит что мы дозаписывае файл (без нерго файл просто перезапишется)}
    }
}
