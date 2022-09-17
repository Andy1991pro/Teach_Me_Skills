package classwork.eleven11;

import java.io.IOException;

public class Eleven2 {
    public static void main(String[] args) {
        try {                                         // Показывает что в коде может быть ошибка
            System.out.println(getDivision(2,0));
        } catch (MySuperException | IOException e) {  // (| IOException e) для решения нескольких ошибок одинаковым методом
            System.out.println("Need to exit");
            System.out.println(e.getMessage());       // При ошибке выводит зарание заданон сообщение
            System.out.println(e.toString());         // При ошибке выдает название класса и заранее заданное сообщение
            e.printStackTrace();                      // Показывает место где есть ошибка
            throw  new RuntimeException();
        }   finally {                                 // Выполняется всегда для того, чтоб выполнить обязательное условие
            System.out.println("We done it");
        }
        System.out.println("Hello world");
    }
        private static int getDivision (int a, int b) throws MySuperException, IOException { // Предупреждаем о возможности ошибки
        if(b==0) throw  new MySuperException();
        return a/b;
    }
           // На собеседовании часто спрашивают какие ошибки бывают (в презинтации нужно выучить 1-5 ошибок)
    }

