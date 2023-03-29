package bai_6_ke_thua.circle_va_cylinder;

public class test_Circle {
    public static void main(String[] args) {
        Circle circle = new Circle(2, "blue");
        System.out.println(circle.getArea());
        System.out.println(circle);

        circle.setRadius(3.4);
        circle.setColor("pink");
        System.out.println(circle.getArea());
        System.out.println(circle);
        Cylinder cylinder = new Cylinder(2.3, "blue", 5.0);
        System.out.println(cylinder);

    }


}
