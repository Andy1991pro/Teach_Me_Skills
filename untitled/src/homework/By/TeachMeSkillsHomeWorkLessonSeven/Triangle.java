package homework.By.TeachMeSkillsHomeWorkLessonSeven;

public class Triangle extends Figures {
final int a;
final int b;
final int c;

public Triangle(int a, int b, int c){
    this.a=a;
    this.b=b;
    this.c=c;
}

    @Override
    public int getPerimetr() {
        return a+b+c;
    }

    @Override
    public int getPl() {
        return a*b*c;
    }
}
