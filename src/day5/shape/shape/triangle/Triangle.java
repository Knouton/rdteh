package day5.shape.shape.triangle;

import day5.shape.shape.Shape;

/**
 * @author kokotov
 * @version 1.0
 */
public class Triangle extends Shape {

    private double a;
    private double b;
    private double c;

    private float angle;

    /**
     *
     * @param a - сторона a
     * @param b - сторона b
     * @param c - сторона c
     */
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     *
     * @param a - сторона a
     * @param b - сторона b
     * @param angle - угол
     */
    public Triangle(double a, double b, float angle) {
        this.a = a;
        this.b = b;
        this.angle = angle;
    }

    @Override
    public double getArea() {
        return calcArea(this.a, this.b, this.c, this.angle);
    }

    private double calcArea(double a, double b, double c, float angle) {
        if (c == 0.0) {
            return 0.5 * a * b * Math.sin(angle);
        } else {
            double semiPerimeter = (a + b + c) /2 ;
            double high = 2 * Math.sqrt(semiPerimeter
                    * (semiPerimeter - a)
                    * (semiPerimeter - b)
                    * (semiPerimeter - c))
                    /a;
            return 0.5 * a * high;
        }

    }

    @Override
    public Object clone(double scale) {
        return null;
    }
}
