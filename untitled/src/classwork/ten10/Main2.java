package classwork.ten10;

public class Main2 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("MyString:");
        builder.append("This").append("my");//Можем дописвать слова в строчку (Сколько хотим через точку)


        if (true){
            builder.append(3);
        }
        String result = builder.toString(); // Позваляет склеивать строчку и не сохраняет предыдущие версии
        System.out.println(result);
       // System.out.println(builder.reverse().toString());//Перезаписывает строчку задом на перед

        builder.insert(11,"Oops"); // Всталяет часть строки в основную строчку
        String result1 = builder.toString();
        System.out.println(result1);

        builder.delete(0,8);// Удаляем часть строчки
        result1 = builder.toString();
        System.out.println(result1);
    }
}
//