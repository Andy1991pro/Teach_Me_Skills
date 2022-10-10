package homework.by.homework17;


import java.util.Map;
import java.util.Scanner;
// D:\\Teach_Me_Skills\\my_file.txt Путь для быстрой проверки
public class Main  {
    public static void main(String[] args) {
        System.out.println("Enter path :");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        FileNumber.sortList(path);
    }
}
