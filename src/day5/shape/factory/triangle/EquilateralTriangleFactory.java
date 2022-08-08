package day5.shape.factory.triangle;

import day5.shape.factory.ShapeFactory;
import day5.shape.factory.random.RandomNumbers;
import day5.shape.shape.Shape;
import day5.shape.shape.triangle.EquilateralTriangle;

public class EquilateralTriangleFactory implements ShapeFactory {
    @Override
    public Shape create() {
        return new EquilateralTriangle(RandomNumbers.getRandomDoubleForShape());
    }
}
