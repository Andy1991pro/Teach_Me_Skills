package homework.by.twelve;

import java.util.*;

public class MainScanner {
    public static void main(String[] args) {


        Map<String, List<String>> product = new HashMap<>();
        Map<String, List<String>> product1 = new HashMap<>();
        Map<String, List<String>> product2 = new HashMap<>();
        for (int i=0;i<10;i++){
            System.out.println("Enter a number to select a category\n1-berries: 2-vegetables: 3-fruits: 0-EXIT");
        Scanner a = new Scanner(System.in);
        int category = a.nextInt();
        if (category==0)break;
        if (category==1){
            System.out.println("Категория ягоды\n"+ "press (Enter) to confirm");
            ArrayList <String> berries = new ArrayList<>();
            product.put("Berries",berries);
            while (true){
                Scanner scan = new Scanner(System.in);
            String berries1 = scan.nextLine();
            if (berries1.equals(""))break;
            berries.add(berries1);}

            }
        if (category==2){
            System.out.println("Категория овощи\n"+ "press (Enter) to confirm");
            ArrayList <String> vegetables = new ArrayList<>();

            product1.put("Vegetables",vegetables);
            while (true){
                Scanner scan = new Scanner(System.in);
                String vegetables1 = scan.nextLine();
                if (vegetables1.equals(""))break;
                vegetables.add(vegetables1);}
        }
        if (category==3){
            System.out.println("Категория фрукты\n"+ "press (Enter) to confirm");
            ArrayList <String> fruit = new ArrayList<>();
            product2.put("Fruit",fruit);
            while (true){
                Scanner scan = new Scanner(System.in);
                String fruit1 = scan.nextLine();
                if (fruit1.equals(""))break;
                fruit.add(fruit1);
            }
    }
}
        System.out.println(product);
        System.out.println(product1);
        System.out.println(product2);
    }
}
