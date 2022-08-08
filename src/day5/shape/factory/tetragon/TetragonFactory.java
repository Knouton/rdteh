package day5.shape.factory.tetragon;

import day5.shape.factory.ShapeFactory;
import day5.shape.factory.random.RandomNumbers;
import day5.shape.shape.Shape;
import day5.shape.shape.tetragon.Tetragon;

public class TetragonFactory implements ShapeFactory {
    @Override
    public Shape create() {
        return new Tetragon(RandomNumbers.getRandomDoubleForShape(),
                RandomNumbers.getRandomDoubleForShape(),
                RandomNumbers.getRandomAngle());
    }
}
