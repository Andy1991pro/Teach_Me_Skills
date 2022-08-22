package homework.By.TeachMeSkillsHomeWorkLessonSeven;

public class Circle extends Figures{
    int radius;
    public Circle(int radius){
        this.radius=radius;
    }
    public int getPerimetr(){
        return 0;
    }

    @Override
    public int getPl() {
        return  2*3*radius;
    }
}
