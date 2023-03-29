package bai_6_ke_thua.he_cac_doi_tuong_hinh_hoc;

public class Square extends Rectanger {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
super(side,color,filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }


}
