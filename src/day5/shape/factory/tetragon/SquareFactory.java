package day5.shape.factory.tetragon;

import day5.shape.factory.ShapeFactory;
import day5.shape.factory.random.RandomNumbers;
import day5.shape.shape.Shape;
import day5.shape.shape.tetragon.Square;

public class SquareFactory implements ShapeFactory {
    @Override
    public Shape create() {
        return new Square(RandomNumbers.getRandomDoubleForShape());
    }
}
