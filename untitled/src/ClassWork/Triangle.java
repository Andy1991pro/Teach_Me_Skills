package ClassWork;

  public class Triangle {
   private double a;
   private double b;
   private double c;

   private int cofficient;
      public double getA() {
          return a;
      }

      public void setA(double a) {
          this.a = a;
      }

      public double getB() {
          return b;
      }

      public void setB(double b) {
          this.b = b;
      }

      public double getC() {
          return c;
      }

      public void setC(double c) {
          this.c = c;
      }

      public int getCofficient() {
          return cofficient;
      }

      public void setCofficient(int cofficient) {
          this.cofficient = cofficient;
      }
      @Override
      public String toString() {
          return "Triangle{" +
                  "a=" + a +
                  ", b=" + b +
                  ", c=" + c +
                  ", cofficient=" + cofficient +
                  '}';
      }

      /**
       * место для коментария
       */
      public Triangle(){
     this.a=8;
     this.b=2;
     this.c=3;
     this.incrementA();
   }
      public double getPerimeter(){
       return this.a+this.b+this.c;
      }



   public Triangle(double a, double b, double c){
this.a=a;
this.b=b;
this.c=c;}
  private void incrementA(){
          this.a ++;
          this.b ++;
          this.c ++;}}


