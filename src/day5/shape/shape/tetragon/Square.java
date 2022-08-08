package day5.shape.shape.tetragon;

/**
 * Квадрат
 * @author kokotov
 * @version 1.0
 */
public class Square extends Rectangle {
    private double sideA;
    public Square(double diagonalX, double diagonalY, double angle) {
        super(diagonalX, diagonalY, angle);
    }

    public Square(double sideA) {
        super(sideA, sideA);
        this.sideA = sideA;
    }

    @Override
    public double getArea() {
        return sideA * sideA;
    }
}
