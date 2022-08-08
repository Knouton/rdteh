package day5.shape.shape;

/**
 * Интерфейс для клонирования фигуры с увеличениеём её размера кратно переданному числу
 * @author kokotov
 * @version 1.0
 * @param <T>
 */
public interface CloneableShape<T> {
    public T clone(double scale);
}
