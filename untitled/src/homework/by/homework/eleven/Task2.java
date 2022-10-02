package homework.by.homework.eleven;

// Находим самое маленькое слово в строку //

public class Task2 {
    public static void main(String[] args) {
        String str = "dog cat look";
        String[] element =str.split(" ");
        int count = 0;
        String first = element[0];
        for (int i= 0; i <element.length;i++){
            if (element[i].length()<=first.length()){
                count=i;
                first=element[i];
            }
        }
        System.out.println(first);
    }
    }
