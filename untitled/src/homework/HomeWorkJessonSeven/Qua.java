package homework.HomeWorkJessonSeven;

public class Qua extends Figures{
    int a,b,c,d;
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
