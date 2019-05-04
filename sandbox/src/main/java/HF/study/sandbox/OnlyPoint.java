package HF.study.sandbox;

public class OnlyPoint {

  public static void main(String[] args) {
    Point AB = new Point(2, 3, 7, 8);
    System.out.println("Расстояние между точкой A(" + AB.x1 + "," + AB.y1 + ") и B(" + AB.x2 + "," + AB.y2 + ") = " + AB.distance());
  }
}
