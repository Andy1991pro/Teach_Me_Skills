package ClassWork;

import java.util.Arrays;

@SuppressWarnings("ALL")
public class ClassWorkLessonFour {

    public static void main(String  [] args) {
        int [] arr =new int[10];// Объявления размера массива
        int[] arr2 =new int []{1,1};// Объявление значений массива
        // int []arr ={1;1}; Второй метод объявления значений массива
        System.out.println(arr2[0]+" ");//Вывод массива
        arr2 [0]=3;//Изменение значения части массива
        System.out.println(arr2[0]);//Проверка значения части массива
        System.out.println("srr length:" + arr.length+" ");// Узнать длину массива
        System.out.println("srgs length:" + args.length+" ");// Узнать длину аргумента(массива)
        Arrays.sort(arr);// Сортировка чисел в массиве по порядку(по возростанию) ctrl+R(Варианты сортировки)
for (int i=0; i<arr.length;i++){
    arr[i]=i*2;//arr [i] Порядковый номер масива; i значение из for
    //arr3[i]=arr[2-i]; Для заполнения массива в обратном порядке
    System.out.println("arr["+i+"]"+"=" + arr[i]+" ");}
System.arraycopy(arr2,0,arr,1,1);//копирование значений из массива в массив(из какого массива, из какой ячейки, в какой массив, в какую ячейку, сколько ячеек)
        System.out.println("arr["+0+"]"+"=" + arr[1]+" ");
        System.out.println("arr2["+0+"]"+"=" + arr2[0]+" ");
        for(int element : arr2) {
            System.out.println(element);// Вывод всех ячеек масива(нелься изменять значение ячеек)
        }
    }


//    public static int testMetod(int value) {
//                testMetod(value -1);
//    }
//
//    public static int fid (int position){
//        if (position==0){
//            return 0;
//        }
//        if(position==1){
//            return 1;
//        }
//        return fid (position-1)+fid(position-2);}

    }