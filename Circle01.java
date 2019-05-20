package Lession4;

public class Circle01 {
    private double radius = 1.0;
    private String color = "blue";

    public Circle01() {
    }

    public Circle01(double radius, String color) {
        this.radius = radius;
        this.color = color;

    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double Area() {
        return this.radius * this.radius * Math.PI;
    }
    @Override
    public String toString() {
        return "radius = " + getRadius()
                + ", color = " + getColor()
                + ", Area = " + Area();
    }
}
