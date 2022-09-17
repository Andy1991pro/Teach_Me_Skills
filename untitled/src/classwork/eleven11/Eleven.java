package classwork.eleven11;

public class Eleven {
    public static void main(String[] args) {
//        Error a;//Серьезная ошибка не связанная с кодом
//        Exception ex; // Исключения которые возможно были ожидаемы (Дает код)
//        RuntimeException exb; // Ошибка которую не нужно чинить
        int first =2;
        int second=0;
        try {
            System.out.println(first/second);
            int [] arr = new int[1];
            System.out.println(arr[2]);
        } catch (ArithmeticException e){     // Ловит ошибку
            e.printStackTrace();             // Показывает где упала ошибка
            System.out.println(first/1);     // Лечит ошибки
        }
        catch (ArrayIndexOutOfBoundsException e){ // Ловит вторую ошибку
            System.out.println("Index out of array"); //Лечит вторую ошибку
        }


    }

}
