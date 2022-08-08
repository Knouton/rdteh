package day5.shape.factory.ellipse;

import day5.shape.factory.ShapeFactory;
import day5.shape.factory.random.RandomNumbers;
import day5.shape.shape.Shape;
import day5.shape.shape.ellipse.Ellipse;

public class EllipseFactory implements ShapeFactory {
    @Override
    public Shape create() {
        return new Ellipse(RandomNumbers.getRandomDoubleForShape()
                ,RandomNumbers.getRandomDoubleForShape());
    }
}
