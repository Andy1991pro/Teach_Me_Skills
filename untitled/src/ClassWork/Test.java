package ClassWork;

import homework.By.TeachMeSkillsHomeWorkLessonSeven.Circle;
import homework.By.TeachMeSkillsHomeWorkLessonSeven.Figures;
import homework.By.TeachMeSkillsHomeWorkLessonSeven.Qua;
import homework.By.TeachMeSkillsHomeWorkLessonSeven.Triangle;

public class Test {
    public static void main(String[] args) {



    Figures[] arr2 = new Figures[3];
    arr2 [0] = new Circle(3);
    arr2 [1] = new Triangle(2,2,3);
    arr2[2]= new Qua(4,5,3,2);
    for (Figures figures:arr2){
        //System.out.println(figures.getPl());
        System.out.println(figures.getPerimetr());
    }
}}
