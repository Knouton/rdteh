package day5.shape.shape.triangle;

/**
 * равнобедренный треугольник
 * @author kokotov
 * @version 1.0
 */
public class IsoscelesTriangle extends Triangle {

    public IsoscelesTriangle(double a, double b, double c) {
        super(a, b, c);
    }

    public IsoscelesTriangle(double a, double b, float angle) {
        super(a, b, angle);
    }

    public IsoscelesTriangle(double a, float angle){
        super(a, a, angle);
    }
    @Override
    public double getArea() {
        return super.getArea();
    }
}
