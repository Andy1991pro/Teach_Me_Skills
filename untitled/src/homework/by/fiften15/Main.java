package homework.by.fiften15;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        for (int i=0; i<20; i++){
            int a = new Random().nextInt(20);
           list.add(a);
        }
        System.out.println(list);
        Stream <Integer> intStream = list.stream();
        List <Integer> list2 = list.stream().distinct().collect(Collectors.toList());
        List <Integer> list3 = list.stream().filter(x-> x>7).filter(x-> x<17).filter(x-> x%2==0).collect(Collectors.toList());
        List <Integer> list4 = list.stream().limit(4).sorted().collect(Collectors.toList());
        int result = (int) list.stream().count();
        double list5 = list.stream().mapToDouble(x-> x).average().getAsDouble(); //getAsDouble Возвращает число, так как мы не знаем есть число вообще или нет
        System.out.println(list2);
        System.out.println(list3);
        System.out.println(list4);
        System.out.println(result);
        System.out.println(list5);
    }
}
