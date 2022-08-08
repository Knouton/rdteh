package day5.shape.shape.triangle;

import day5.shape.shape.Shape;

/**
 * @author kokotov
 * @version 1.0
 */
public class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    private float angle;

    /**
     *
     * @param sideA - сторона a
     * @param sideB - сторона b
     * @param sideC - сторона c
     */
    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    /**
     *
     * @param sideA - сторона a
     * @param sideB - сторона b
     * @param angle - угол
     */
    public Triangle(double sideA, double sideB, float angle) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.angle = angle;
    }

    /**
     * Получить площадь
     * @return
     */
    @Override
    public double getArea() {
        return calcArea(this.sideA, this.sideB, this.sideC, this.angle);
    }

    /**
     * Посчитать площадь в зависимости от переданных параметров, если сторона c неизвестна, то через синус угла,
     * иначе через полупериметр
     * @param a - сторона a
     * @param b - сторона b
     * @param c - сторона c
     * @param angle - угол
     * @return
     */
    private double calcArea(double a, double b, double c, float angle) {
        if (c == 0.0) {

            return 0.5 * a * b * Math.sin(Math.toRadians(angle));
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
        if (sideC != 0.0) {
            return new Triangle(this.sideA * scale, this.sideB * scale, this.sideC * scale);
        } else {
            return new Triangle(this.sideA * scale, this.sideB * scale, this.angle);
        }
    }

    public boolean isTriangleExits() {
        return (this.sideA + this.sideB > this.sideC
                && this.sideA + this.sideC > this.sideB
                && this.sideB + this.sideC > this.sideA);
    }
}
