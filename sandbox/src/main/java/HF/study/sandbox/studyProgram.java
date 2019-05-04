package HF.study.sandbox;

public class StudyProgram {

  public static void main(String[] args) {
    hello("life");
    hello("morning");
    hello("spring");

    double l = 3;
    System.out.println("������� �������� �� �������� " + l + " = " + area(l));

    double a = 3;
    double b = 4;
    System.out.println("������� �������������� �� ��������� " + a + " � " + b + " = " + area(a, b));
     }

  public static void hello(String somebody) {
        System.out.println("What a wonderful " + somebody + "!");
  }

  public static double area(double l) {
    return l * l;
  }

  public static double area(double a, double b) {
    return a * b;
  }
}