package ClassWork;

import java.util.Arrays;

public class ClassWorkFive {
    public static void main(String[] args) {



    int[][]arr=new int[4][]; // Первый способ создания двухмерного масива.
    //int[][ srr ={{1,2}{3,4}} Второй метод создание двухмерного масива.
    int []arr1=arr[0];
    arr[0]=new int[1];
    arr[1]=new int[2];
    arr[2]=new int[3];
    arr[3]=new int[4];
    for(int i=0;i<arr.length;i++){
        for (int x=0;x<arr[i].length;x++){
            arr[i][x]=x;}} //Заполняет масив
    System.out.println(Arrays.deepToString(arr));//Arrays.deepToString(arr) выводит значения ячеек двухмерного цикла

    }
}
//(Arrays.) для работы с одномерными масивами
//(arrays.fill(arr[5],[10]) для заполнения масива одинаковыми числами
//boolean iaEqual = arrays.equals(arr[0],arr[3]); для сравнивния масивов
// Arrays.toString(arr[]) Выврдит каждую строчку
//Arrays.sort[] для сортировки масивов

