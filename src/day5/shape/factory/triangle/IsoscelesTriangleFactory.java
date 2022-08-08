package day5.shape.factory.triangle;

import day5.shape.factory.ShapeFactory;
import day5.shape.factory.random.RandomNumbers;
import day5.shape.shape.Shape;
import day5.shape.shape.triangle.IsoscelesTriangle;

public class IsoscelesTriangleFactory implements ShapeFactory {
    @Override
    public Shape create() {
        return new IsoscelesTriangle(RandomNumbers.getRandomAngle(), RandomNumbers.getRandomAngle());
    }
}
