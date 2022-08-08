package day5.shape.shape.ellipse;


import day5.shape.shape.CloneableShape;
import day5.shape.shape.Shape;

/**
 * Эллипс
 * @author kokotov
 * @version 1.0
 */
public class Ellipse extends Shape implements CloneableShape {
    private double smallSemiAxis;
    private double majorSemiAxis;
    private double pi = Math.PI;

    public Ellipse (double smallSemiAxis, double majorSemiAxis) {
        this.smallSemiAxis = smallSemiAxis;
        this.majorSemiAxis = majorSemiAxis;
    }

    @Override
    public double getArea() {
        return smallSemiAxis * majorSemiAxis * pi;
    }

    @Override
    public Object clone(double scale) {
        return new Ellipse(this.smallSemiAxis * scale, this.majorSemiAxis * scale);
    }
}
