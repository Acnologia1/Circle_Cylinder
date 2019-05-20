package Lession4;

public class Cylinder01 extends Circle01 {
    private double h = 1.0;

    public Cylinder01() {
    }

    public Cylinder01(double h) {
        this.h = h;
    }

    public Cylinder01(double h, double radius, String color) {
        super(radius, color);
        this.h = h;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double thetichhinhtru(){
        return getRadius() *getRadius()*this.h *Math.PI;
    }
    @Override
    public String toString() {

        return " h = " + getH()
                +" ,radius = "+getRadius()
                +" ,color = " +getColor()
                +",the tich = "+thetichhinhtru();
    }
}
