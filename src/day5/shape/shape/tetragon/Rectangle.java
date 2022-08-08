package day5.shape.shape.tetragon;

/**
 * Прямоугольник
 * @author kokotov
 * @version 1.0
 */
public class Rectangle  extends Parallelogram {
    private double sideA;
    private double sideB;
    public Rectangle(double diagonalX, double diagonalY, double angle) {
        super(diagonalX, diagonalY, angle);
    }

    public Rectangle(double sideA, double sideB) {
        super(sideA, sideB, 90.00, 90.00);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }
}
