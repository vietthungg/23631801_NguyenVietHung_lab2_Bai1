package iuh.fit.ktpm;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println("width: " + r1.getWidth());
        System.out.println("leght" + r1.getLength());

        r1.setWidth(3);
        r1.setLength(10);

        System.out.println("width: " + r1.getWidth());
        System.out.println("leght: " + r1.getLength());
        Rectangle r2 = new Rectangle(10, 6);
        System.out.println("area : " + r2.getArea());
        System.out.println("perimeter: " + r2.getPerimeter());
    }
}