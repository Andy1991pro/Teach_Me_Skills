package homework.homeworkLesson2Sheavchenko;

import java.util.Scanner;

public class HemeWorkLesson2HelloUser {
    public static void main(String[] args) {
        Scanner Name = new Scanner(System.in); //Ввод имени в сканер
        System.out.println("Enter username");// Вывод на терминал запрос ника

        String username = Name.nextLine();//Назначаем Name из сканера
        System.out.println("Your username is" + username);
        System.out.println("Ysur usernaem is" + Name.nextLine());
    }
    }

