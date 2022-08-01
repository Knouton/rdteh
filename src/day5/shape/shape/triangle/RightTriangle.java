package day5.shape.shape.triangle;

/**
 * @author kokotov
 * @version 1.0
 */
public class RightTriangle extends Triangle {


    public RightTriangle(double a, double b, double c) {
        super(a, b, c);
    }

    public RightTriangle(double a, double b, float angle) {
        super(a, b, angle);
    }

    public RightTriangle(double firstCathetus, double secondCathetus) {
        super(firstCathetus, secondCathetus, 90);
    }

    @Override
    public double getArea() {
        return super.getArea();
    }
}
