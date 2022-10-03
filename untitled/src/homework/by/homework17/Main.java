package homework.by.homework17;


import java.util.Scanner;
// D:\\Teach_Me_Skills\\my_file.txt Путь для быстрой проверки
public class Main extends FileReader {
    public static void main(String[] args) {
        System.out.println("Enter path: ");
        Scanner path1 = new Scanner(System.in);
        String path = path1.nextLine();
        sortList(path);

    }
}
