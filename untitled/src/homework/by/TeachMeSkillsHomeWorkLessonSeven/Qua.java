package homework.by.TeachMeSkillsHomeWorkLessonSeven;

public class Qua extends Figures{
    final int a;
    final int b;
    final int c;
    final int d;
    public Qua(int a, int b, int c,int d){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
    }

    @Override
    public int getPerimetr() {
        return a+b+c+d;
    }

    @Override
    public int getPl() {
        return a*b*c*d;
    }
}
