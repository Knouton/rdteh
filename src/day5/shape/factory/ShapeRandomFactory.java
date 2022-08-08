package day5.shape.factory;

import day5.shape.shape.Shape;

import java.util.Random;


/**
 * Получение случайной фигуры
 * @author kokotov
 * @version 1.0
 */
public class ShapeRandomFactory implements ShapeFactory {
    ShapeFactory[] factories;
    Random r = new Random();

    public ShapeRandomFactory(ShapeFactory[] factories) {
        this.factories = factories;
    }

    @Override
    public Shape create() {
        int ind = r.nextInt(factories.length);
        return factories[ind].create();
    }
}
