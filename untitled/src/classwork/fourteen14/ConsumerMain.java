package classwork.fourteen14;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;


// Балуемся //


public class ConsumerMain {
    public static void main(String[] args) {
        consumeElement(list-> System.out.println(list));
        consumeElement(list->{
            Collections.sort(list);
            System.out.println(list);
        });
        consumeElement(list-> {
            if (list.size()>3){
                System.out.println(list.subList(0,2));
            }
        });
        printOneElement(()-> 0); // Попросили вывести нулевой элемент
        Random r =new Random();
        printOneElement(()-> r.nextInt(4)); // Попросили вывести случайное значение
        printOneElement(()-> r.nextInt(4)); // () Пустые скобки по тому, что он ничего не принимает - имитация пустого значения
        printOneElement(()-> r.nextInt(4));
        printOneElement(()-> r.nextInt(4));
        printOneElement(()-> r.nextInt(4));
    }
    private static void consumeElement (Consumer<List<String>> consumer) { // Принимает что-нибудь и ничего не возвращает
        List<String> myElements = new ArrayList<>();
        myElements.addAll(Arrays.asList("dog", "good", "print", "google"));
        consumer.accept(myElements);

    }
    private static void printOneElement (Supplier<Integer> supplier) { // Принимает что-нибудь и ничего не возвращает
        List<String> myElements = new ArrayList<>();
        myElements.addAll(Arrays.asList("dog", "good", "print", "google"));
        System.out.println(myElements.get(supplier.get()));
}}
