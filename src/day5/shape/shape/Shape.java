package day5.shape.shape;

import day5.shape.color.EnumColor;

import java.util.Arrays;

import static day5.shape.color.EnumColor.getRandomColor;

/**
 * @author kokotov
 * @version 1.0
 */
public abstract class Shape implements CloneableShape {
    private int id;
    private String color;
    private double area;
    abstract public double getArea();

    public int getId() {
        return id;
    }
    public String getColor() {
        return color;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void seRandomtColor() {
        setColor(getRandomColor());
    }
}
