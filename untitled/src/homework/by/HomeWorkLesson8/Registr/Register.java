package homework.by.HomeWorkLesson8.Registr;

public class Register {
    private int Register;
    private int Position;
    private final Document[] arr;

    /**
     * Задаем длину массива
     */
    public Register(int size ){
        Position = 0;
        arr=new Document[size];
    }

    /**
     * Проверяем длину массива
     */
    public void addDocument (Document document){
       if (Position< arr.length){
           arr[Position]= document;    
       }
               Position++;
    }

    /**
     * Заполняем массив и выводим на печать
     */
    public void printDocument(){
        for (int i=0;i<Position; i++){
            arr[i].print();}
        }


}

