package homework.by.homework17;


import java.util.Scanner;

public class Main extends FailReader{
    public static void main(String[] args) {
        System.out.println("Enter path: ");
        Scanner path1 = new Scanner(System.in);
        String path = path1.nextLine();
        SortList(path);

    }
}
