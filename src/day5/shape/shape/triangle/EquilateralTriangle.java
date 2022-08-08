package day5.shape.shape.triangle;

/**
 * равносторонний треугольник
 * @author kokotov
 * @version 1.0
 */
public class EquilateralTriangle extends IsoscelesTriangle {
    /**
     * @param a - сторона a
     * @param b - сторона b
     * @param c - сторона c
     */
    public EquilateralTriangle(double a, double b, double c) {
        super(a, b, c);
    }

    /**
     *
     * @param a - сторона a
     * @param b - сторона b
     * @param angle - угол между ними
     */
    public EquilateralTriangle(double a, double b, float angle) {
        super(a, b, angle);
    }

    public EquilateralTriangle(double a, float angle) {
        super(a, angle);
    }

    public EquilateralTriangle (double a) {
        super(a, 60);
    }
}
