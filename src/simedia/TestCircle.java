package simedia;

public class TestCircle {

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(3,"yellow");
        System.out.println(circle1.getRadius());
        System.out.println(circle2.getArea());
    }
}
