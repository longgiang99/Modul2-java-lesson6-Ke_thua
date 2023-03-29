package bai_6_ke_thua.he_cac_doi_tuong_hinh_hoc;

public class Rectanger extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectanger() {
    }

    public Rectanger(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectanger(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length =length;
    }

    public Rectanger(double side, String color, boolean filled) {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return width * this.length;
    }
    public double getPerimeter() {
        return 2 * ( this.length + width);
    }

    @Override
    public String toString() {
        return "Rectanger{" +
                "width=" + getWidth() +
                ", length=" + getLength() +
                "}" + super.toString();
    }
}
