package day5.shape.shape;
import java.util.UUID;

import static day5.shape.color.EnumColor.getRandomColor;

/**
 * фигура
 * @author kokotov
 * @version 1.0
 */
public abstract class Shape implements CloneableShape {
    private UUID id = UUID.randomUUID();
    private String color = getRandomColorString();

    private double area;
    public abstract  double getArea();


    public UUID getId() {
        return id;
    }
    public String getColor() {
        return color;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRandomColor() {
        setColor(getRandomColor());
    }

    private String getRandomColorString() {
        return getRandomColor();
    }
}
