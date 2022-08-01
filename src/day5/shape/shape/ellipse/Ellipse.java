package day5.shape.shape.ellipse;


import day5.shape.shape.Shape;

public class Ellipse extends Shape {
    private double smallSemiAxis;
    private double majorSemiAxis;
    final private double pi = Math.PI;

    public Ellipse (double smallSemiAxis, double majorSemiAxis) {
        this.smallSemiAxis = smallSemiAxis;
        this.majorSemiAxis = majorSemiAxis;
    }

    @Override
    public String getColor() {
        return null;
    }

    @Override
    public double getArea() {
        return smallSemiAxis * majorSemiAxis * pi;
    }
}
