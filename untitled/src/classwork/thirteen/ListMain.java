package classwork.thirteen;

import java.util.*;

public class ListMain {
    // List  //  Листы  //
    // ArrayList [1,2,3,4,5];   Значкения всегда в одном порядке
    // LinkedList 1-> 2 -> 3    Значения всегда знают соседа без индекса

    public static void main(String[] args) {
        ArrayList<Integer> arrayList =new ArrayList<>(); // Старая запись
        // Новый формат записи
        arrayList.add(1); // add(1) Добавляем в лист одно значение
        arrayList.add(10);
        arrayList.addAll(Arrays.asList(8,2,3,4,5,6,8) ); // asList(8,2,3,4,5,6,8) Добавляем все необходимые значения в лист
        System.out.println(arrayList);
        arrayList.add(2,5); // add(2,5) Так вставляем значение на определенную позицию, без перезаписи 2 это индекс
        arrayList.set(2,6); // set(2,6) Перезаписываем значение с индексом 2
        System.out.println(arrayList);
        System.out.println(arrayList.get(2)); // arrayList.get(2) Дает один элемент листа с указанным индексом
        System.out.println(arrayList.size()); //  arrayList.size() Показывает размер листа
        System.out.println(arrayList.isEmpty()); // arrayList.isEmpty() Показывает пестой лист или нет
        System.out.println(arrayList.contains(5));// contains(5) Ищет совпадения в листе с заданым символом
        System.out.println(arrayList.subList(2,5)); // subList(2,5) Берет подлист от 2-го до 4-го индекса
        System.out.println(arrayList.indexOf(8)); // indexOf(8) Показывает где запрашиваемый индек
        System.out.println(arrayList.lastIndexOf(8)); // lastIndexOf(8) Показывает индекс 7-ки с конца
        System.out.println(arrayList.remove(5));      // remove(5) Удаляет число по индексу
        System.out.println(arrayList.remove(Integer.valueOf(8))); // remove(Integer.valueOf(8)) Удалит все 8-ки из листа

        int sum =0;
        for (int value: arrayList){ // Так мы складываем все значения листа
            sum+=value;}

            Iterator<Integer> iterator = arrayList.iterator(); // Удаляем часть листа
            int counter =0;
        while (iterator.hasNext()){
            if(counter==0){
                iterator.next();
                iterator.remove();
                counter++;
            }
                System.out.println(iterator.next());
        }
        Collections.sort(arrayList);  // sort(arrayList) Сортирует лист
        System.out.println(arrayList);
        Collections.reverse(arrayList);  // reverse(arrayList) Сортирует лист в обратную сторону
        System.out.println(arrayList);
        Collections.shuffle(arrayList, new Random(4));  // shuffle(arrayList, new Random(4)) Сортирует рандомом
        System.out.println(arrayList);
;        }
}
