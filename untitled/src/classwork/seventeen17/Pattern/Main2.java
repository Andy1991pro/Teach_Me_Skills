package classwork.seventeen17.Pattern;


import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// То, что обязвтельно  нужно знать //


public class Main2 {
    public static void main(String[] args) {

        List<String> testList = Arrays.asList("12345", "1a1", "11a",  "11 ");

        // "^a" - ^ Начинается точно с а и только на а
        // "a$" - $ заканчивается точно на а и только на а
        // "\\d" - \\d Значить только числа \\D (Большая - значит не числа)
        // "s" - s ищим пробелы
        // "+" - +  Значить хотябы один раз подряд идёт число и до бесконечности
        // "." - . (точка) Любые символы вообще
        // "*" - * Сколько угодно раз от 0 до бесконечности
        // "?" - ? Не важно есть ли там нужное значение или нет но
        // "[^25]+$ - [^ ]" Не должно быть совпадения 2 или 5
        // Павел думает - Так ищем не совпадение 25
        // "[a-zA-Z0-9]+$" - проверяем на отсутствие символов (Совпадет все что буквы и числа без учета РеГиСтРа)
        // "[A-Z0-9]+$", Pattern.CASE_INSENSITIVE - проверяет без учета РеГиСтРа
        // "[25]$" - [] показывают, что совпасть должно любое из чисел 2 или 5
        // ([A-Z] | [3-5])$ - ищем от A-Z или если кончается на 3,4,5


        // Создаем Pattern и for для прохода по всей длине List //

        Pattern pattern = Pattern.compile("^\\d+$");
        // Pattern pattern =Pattern.compile("^\\d+?$");
        // ^ начало с числа, \\d числа в середине, + один и больше раз , $ в конце только число
        for (String current : testList){
            Matcher matcher = pattern.matcher(current);
            if (matcher.find()){
                System.out.println(matcher.group());
            }
    }
}}
