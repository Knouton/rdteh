package day5.shape.factory.triangle;

import day5.shape.Main;
import day5.shape.factory.ShapeFactory;
import day5.shape.factory.random.RandomNumbers;
import day5.shape.shape.Shape;
import day5.shape.shape.triangle.Triangle;

public class TriangleFactory implements ShapeFactory {
    @Override
    public Shape create() {
        double a = RandomNumbers.getRandomDoubleForTriangle();
        double b = RandomNumbers.getRandomDoubleForTriangle();
        double c = RandomNumbers.getRandomDoubleForTriangle();
        return new Triangle(a, b, c);
    }
}