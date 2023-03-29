package bai_6_ke_thua.circle_va_cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder() {

    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getTheTich(){
        return  height * getArea();
    }

    @Override
    public String toString() {
        return "Cylinder the tich la: " + getTheTich();
    }
}
