package day5.shape.shape.ellipse;

import static day5.shape.color.EnumColor.getRandomColor;

/**
 * Круг
 * @author kokotov
 * @version 1.0
 */
public class Circle extends Ellipse {
    public Circle(double radius) {
        super(radius, radius);
    }
}
