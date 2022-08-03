package day5.shape.shape.tetragon;

import day5.shape.shape.Shape;

public class Tetragon extends Shape {
    double diagonalX;
    double diagonalY;
    double angle;
    public Tetragon (double diagonalX, double diagonalY, double angle) {
        this.diagonalX = diagonalX;
        this.diagonalY = diagonalY;
        this.angle = angle;
    }
    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public Object clone(double scale) {
        return null;
    }
}
