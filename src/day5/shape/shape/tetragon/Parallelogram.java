package day5.shape.shape.tetragon;


/**
 * Параллелограмм
 * @author kokotov
 * @version 1.0
 */
public class Parallelogram extends Tetragon{


    public Parallelogram(double diagonalX, double diagonalY, double angle) {
        super(diagonalX, diagonalY, angle);
    }

    public Parallelogram(double sideA, double sideB, double angleA, double angleB) {
        super(sideA, sideB, sideA, sideB, angleA, angleB, angleA, angleB);
    }

}
