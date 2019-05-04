package HF.study.sandbox;

public class StudyProgram {

  public static void main(String[] args) {
    hello("life");
    hello("morning");
    hello("spring");

    Square s = new Square(3);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + area(s));

    Rectangle r = new Rectangle(4,6);
       System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + area(r));
     }

  public static void hello(String somebody) {
        System.out.println("What a wonderful " + somebody + "!");
  }

  public static double area(Square s) {
    return s.l * s.l;
  }

  public static double area(Rectangle r) {
    return r.a * r.b;
  }
}