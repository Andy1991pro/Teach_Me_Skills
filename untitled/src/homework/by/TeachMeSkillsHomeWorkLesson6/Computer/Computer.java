package homework.by.TeachMeSkillsHomeWorkLesson6.Computer;


    public class Computer {
        public Computer(){
            int price=100;
        System.out.println("Computer default");
        String model= "ASUS";
        System.out.println("Price"+": "+price+ "; " +"Model"+": "+ model);
        System.out.println("RAM:");
        System.out.println("HDD:");
        new HDD();
        }
        int price=100;
        String model= "ASUS";
        public Computer(int price, String  model){
            System.out.println("Computer user");
            this.price=price;
            this.model=model;
            System.out.println("Price"+": "+price+ "; " +"Model"+": "+ model);
            System.out.println("RAM:");
            new RAM("Ritmix",8);
            System.out.println("HDD:");
            new HDD ("Philips",500,"Inside");
        }

    }




