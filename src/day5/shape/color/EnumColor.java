package day5.shape.color;

import java.util.Random;

/**
 * Цвета фигур
 * @author kokotov
 * @version 1.0
 */
public enum EnumColor {
    RED,
    BLUE,
    YELLOW,
    BLACK,
    WHITE;

    private static final EnumColor[] VALUES = values();
    private static final int SIZE = VALUES.length;
    private static final Random RANDOM = new Random();

    public static String getRandomColor()  {
        return VALUES[RANDOM.nextInt(SIZE)].toString();
    }
}
