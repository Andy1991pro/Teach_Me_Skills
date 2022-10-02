package homework.by.fiften15;

import java.util.*;
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
        List<Integer> list6 = list.stream().map(x-> x*2).collect(Collectors.toList());
        List <Integer> list4 = list.stream().limit(4).sorted().collect(Collectors.toList());
        var result = (double) list.stream().count();
        var list5 = list.stream().mapToInt(x-> x).average().getAsDouble(); //getAsDouble Возвращает число, так как мы не знаем есть число вообще или нет
        System.out.println(list2);
        System.out.println(list3);
        System.out.println(list4);
        System.out.println(result);
        System.out.println(list5);
        System.out.println(list6);
// Дополнительное задание
        ArrayList<String> list10 = new  ArrayList<>(Arrays.asList("Gleb","Andrey","andrey"));
        var andrey = list10.stream().filter(x-> x.equalsIgnoreCase("andrey")).count();
        var a = list10.stream().filter(x-> x.startsWith("a")||x.startsWith("A")).count();
        var ferst =list10.stream().limit(1).collect(Collectors.toList());
        System.out.println(andrey);
        System.out.println(a);
        System.out.println(ferst);
    }
}
