package classwork.ten;
//Тема строки
public class Main {
    public static void main(String[] args) {


    //String str; String str=a; String+=b;
    String str = "a"; // Строчка сохранится в месте для хранения строк
    String str2 ="a"; // Строчка дает ссылку на тот же объект
        System.out.println(str == str2);
        String str3 =new String("a");
        System.out.println(str == str3);// Строчка не равна
        System.out.println(str.equals(str3)); // Метод для сравнения строчек по содержанию а не по расположению
        System.out.println(str.length()); // Показывает количество символов в строчке
        String nextStr = str + str2; //Метод склеивает строчки (выведет аа или 11 если заменить на число
        System.out.println(nextStr);
        String nextStr2 = str.concat(str2);//Склеивает строчки и понимает сразу, что это строчки
        System.out.println(nextStr2);
        String nextStr3 = String.join("/",str,str2,str3); // Метод позваляет вставить символ между строчками
        System.out.println(nextStr3);

        int newInt = 5;
        String mixString = newInt +str;               //Складывает строчку с числом
        String mixString2 = str + newInt;
        System.out.println(mixString2+mixString);

        String mixString3 = (newInt + newInt) + str; //Складывает два числа и строчку
        System.out.println(mixString3);


    }}
