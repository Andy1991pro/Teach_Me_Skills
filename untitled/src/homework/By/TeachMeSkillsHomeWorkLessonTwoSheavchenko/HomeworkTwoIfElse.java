package homework.By.TeachMeSkillsHomeWorkLessonTwoSheavchenko;

import java.util.Random;

public class HomeworkTwoIfElse {
    public static void main(String[] args) {
        int random = new Random().nextInt(12);
        random++;
        System.out.println(random);
        if (random <=2)
        { System.out.println("Winter");}
        else if(random <=5)
        { System.out.println("Spring");}
        else if(random <=8)
        { System.out.println("Summer");}
        else if(random <=11)
        { System.out.println("Autumn");}
        else if(random ==12)
        { System.out.println("Winter");}}}










