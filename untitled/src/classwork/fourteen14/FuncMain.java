package classwork.fourteen14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FuncMain {
    public static void main(String[] args) {
        Predicate<Integer> myPredicate = velue -> velue > 3;  // Predicate<Integer> Возвращает тру или фолс и может принимать значение
        System.out.println(myPredicate.test(5));
        System.out.println(myPredicate.test(2));

        Consumer<String> myConsumer = str -> System.out.println(str); //  Consumer принимает что-то, и ничего не возвращает
        myConsumer.accept("my first phase");
        myConsumer.accept("secend phase");

        Supplier<Integer> mySupplier = () -> 5; // Ничего не принимает но что-то возвращает

        Function<String, Integer> myFunction = str -> str.length(); // Принимает строчку (str), возвращает число ( str.length() ) и на оборот

        printValues(str->str.length()<5); // Задали параментр меньше пяти и соут выведет строчки короче пяти
        System.out.println("-------------------------------------");
        printValues(str-> str.length()==6); // !!! Мы передаем сразу условие !!! str-> str.length()==6 говорим что строчка равная шест символам
        System.out.println("-------------------------------------");
        printValues(str-> str.startsWith("go"));

        // convertValues(str->str); Печатает все без изменений
        convertValues(str->str);
        System.out.println("--------------");
        convertValues(str-> str+str);           // Склеим строчку
        System.out.println("--------------");
        convertValues(str->str.substring(0,2)); // Вернет первые два символа строчки

        fileAndConvertValue(str -> str.length() <5, str -> str.substring(0,2)); //  fileAndConvertValue фильтруем (str -> str.length() <5) а во второй части говорим что ходим сделать ( str -> str.substring(0,2))
        System.out.println("|||||||||||");
        fileAndConvertValue(str -> str.startsWith("go"), str -> str+str);

    }

    private static void printValues(Predicate<String> predicate) { // Добавили предикат (Он пнимимает значение которое мы передвли выше)
        List<String> myElements = new ArrayList<>();
        myElements.addAll(Arrays.asList("dog", "good", "print", "google"));
        for (String current : myElements) {
            if (predicate.test(current)){
            System.out.println(current);}
        }
    }

    private static void print(String print) {

    }
    private static void convertValues(Function <String, String> function){ // Function <String, String> function
        List<String> myElements = new ArrayList<>();
        myElements.addAll(Arrays.asList("dog", "good", "print", "google"));
        for (String element:myElements){
            System.out.println(function.apply(element)); // apply(element) Выполняет действие (в данном случае склеивает строчки)
        }

    }
    private static void fileAndConvertValue (Predicate<String> predicate,Function <String, String> function) {     // Склеили сразу два метода
        List<String> myElements = new ArrayList<>();
        myElements.addAll(Arrays.asList("dog", "good", "print", "google"));
        for (String current : myElements) {
            if (predicate.test(current)) {
                System.out.println(function.apply(current));
            }
        }
    }
}
