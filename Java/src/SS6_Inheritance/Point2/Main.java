package SS6_Inheritance.Point2;

public class Main {
    public static void main(String[] args) {
        Point p = new Point(2,3);
        MovablePoint m = new MovablePoint(3,4,5,6);
        System.out.println(p.toString());
        System.out.println(m.toString());
    }
}
