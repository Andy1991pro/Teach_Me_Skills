package classwork.seventeen17.Pattern;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
// Работа с регулярными выражениями, Запоминать не нужно все гуглится //
public class Main {
    public static void main(String[] args) {
        String testString = "1234 this is my string 1234510";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(testString);
        System.out.println(matcher.matches()); // matcher.matches()  Проверяем на наличие чисел

       if (matcher.find()){ // matcher.find() Ищим совпадение по нашему шаблону
           System.out.println(matcher.start()+" "+ matcher.end()); // matcher.start()+" "+ matcher.end() Показывает первый и последний индекс совпадения
           System.out.println(matcher.group()+" "+ matcher.end()); //  matcher.group() Выдели совпадения по группам
            // matcher.end() Показывает позиции на которых есть совпадения
        }
        while (matcher.find()){ // while ищет все совпадения которые есть в строчке
            System.out.println(matcher.group());
        }
        System.out.println(matcher.replaceAll("***"));  //matcher.replaceAll("***") Заменяет все совпадения с шаблоном на заданый символ
        System.out.println(Arrays.asList(testString.split(" "))); // Запихнули масив в строчку и разделили все пробелом
        System.out.println(Arrays.asList(testString.split("\\W+"))); // \\W+ Убирает все символы кроме чисел и букв

        // Регулярные выражения можно использовать с обычной строчке и в потоке " regex "

        matcher.results() // Здесь уже появился поток "stream"
                .toString(); // И можно использовать команды потока "stream"



    }
}
