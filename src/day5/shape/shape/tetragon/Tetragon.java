package day5.shape.shape.tetragon;

import day5.shape.shape.Shape;
import day5.shape.shape.triangle.Triangle;

/**
 * Четырехугольник
 * @author kokotov
 * @version 1.0
 */
public class Tetragon extends Shape {
    double diagonalX;
    double diagonalY;
    double angleA;
    double angleB;

    double angleC;

    double angleD;

    double sideA;
    double sideB;
    double sideC;
    double sideD;

    /**
     *
     * @param diagonalX - диагональ X
     * @param diagonalY - диагональ Y
     * @param angle - угол
     */
    public Tetragon (double diagonalX, double diagonalY, double angle) {
        this.diagonalX = diagonalX;
        this.diagonalY = diagonalY;
        this.angleA = angle;
    }
    public Tetragon (double sideA, double sideB, double sideC, double sideD, double angleA, double angleB, double angleC, double angleD) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;

        this.angleA = angleA;
        this.angleB = angleB;
        this.angleC = angleC;
        this.angleD = angleD;
    }
    @Override
    public double getArea() {
        double angle = angleA != 0.0 ? angleA : angleB;
        if (diagonalX == 0.0 || diagonalY == 0.0) {
            diagonalX = getdDiagonal();
            diagonalY = getdDiagonal();
        }
        return diagonalX * diagonalY * Math.sin(Math.toRadians(angle)) * 1/2;
    }

    @Override
    public Object clone(double scale) {
        return new Triangle(this.diagonalX * scale, this.diagonalY * scale, angleA);
    }

    private double getdDiagonal(){
        return 0.0;
    }
}
