package day5.shape.factory;

import day5.shape.shape.Shape;

/**
 * Интерфейс для создания фабрики
 * @author kokotov
 * @version 1.0
 */
public interface ShapeFactory {
    Shape create();
}
