class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

abstract class Quadrilateral {
    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;

    public Quadrilateral(Point p1, Point p2, Point p3, Point p4) {
        point1 = p1;
        point2 = p2;
        point3 = p3;
        point4 = p4;
    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public Point getPoint4() {
        return point4;
    }

    public abstract double calculateArea();
}

class Trapezoid extends Quadrilateral {
    public Trapezoid(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    @Override
    public double calculateArea() {
        double height = Math.abs(getPoint1().getY() - getPoint4().getY());
        double base1 = Math.abs(getPoint1().getX() - getPoint2().getX());
        double base2 = Math.abs(getPoint3().getX() - getPoint4().getX());
        return 0.5 * (base1 + base2) * height;
    }
}

class Parallelogram extends Quadrilateral {
    public Parallelogram(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    @Override
    public double calculateArea() {
        double base = Math.abs(getPoint1().getX() - getPoint2().getX());
        double height = Math.abs(getPoint1().getY() - getPoint4().getY());
        return base * height;
    }
}

class Rectangle extends Parallelogram {
    public Rectangle(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    @Override
    public double calculateArea() {
        return super.calculateArea();
    }
}

class Square extends Rectangle {
    public Square(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    @Override
    public double calculateArea() {
        double side = Math.abs(getPoint1().getX() - getPoint2().getX());
        return side * side;
    }
}

public class Q10 {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 0);
        Point p3 = new Point(4, 3);
        Point p4 = new Point(0, 3);

        Trapezoid trapezoid = new Trapezoid(p1, p2, p3, p4);
        Parallelogram parallelogram = new Parallelogram(p1, p2, p3, p4);
        Rectangle rectangle = new Rectangle(p1, p2, p3, p4);
        Square square = new Square(p1, p2, p3, p4);

        System.out.println("Trapezoid Area: " + trapezoid.calculateArea());
        System.out.println("Parallelogram Area: " + parallelogram.calculateArea());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Square Area: " + square.calculateArea());
    }
}
