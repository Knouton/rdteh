package day5.shape.shape.triangle;

/**
 * прямоугольный треугольник
 * @author kokotov
 * @version 1.0
 */
public class RightTriangle extends Triangle {
    private double sideA;

    private double sideB;

    public RightTriangle(double sideA, double sideB, double sideC) {
        super(sideA, sideB, sideC);
    }

    public RightTriangle(double sideA, double sideB, float angle) {
        super(sideA, sideB, angle);
    }

    public RightTriangle(double firstCathetus, double secondCathetus) {
        super(firstCathetus, secondCathetus, 90);
        this.sideA = firstCathetus;
        this.sideB = secondCathetus;
    }

    /**
     * посчитать площадь через форумлу для прямоугольного треугольника (т.к. треугольник прямоугольный, то его сторона(катет) это высота)
     * @return
     */
    @Override
    public double getArea() {

        return sideA * sideB * 1/2;
        //return super.getArea();
    }
}
