package day5.shape.factory.ellipse;

import day5.shape.factory.ShapeFactory;
import day5.shape.factory.random.RandomNumbers;
import day5.shape.shape.Shape;
import day5.shape.shape.ellipse.Circle;

public class CircleFactory implements ShapeFactory {
    @Override
    public Shape create() {
        return new Circle(RandomNumbers.getRandomDoubleForShape());
    }
}
