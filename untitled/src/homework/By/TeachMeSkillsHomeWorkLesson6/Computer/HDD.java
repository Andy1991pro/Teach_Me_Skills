package homework.By.TeachMeSkillsHomeWorkLesson6.Computer;

public class HDD {
    public HDD(){
        String name="Ritmix";
        int volume=4;
        String type = "Inside";
        System.out.println("Name"+": "+ name+"Volume"+"; "+ volume+"Type"+": "+type);
    }
        String name;
        int volume;
        String type;

            public HDD(String name,int volume,String type){
            this.name= name;
            this.volume=volume;
            this.type = type;
            System.out.println("Name"+": "+ name+"Volume"+"; "+ volume+"Type"+": "+type);
        }
}
