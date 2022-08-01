package day5.shape.color;

import java.util.Random;

public enum EnumColor {
    red,
    blue,
    yellow,
    black,
    white;

    private static final EnumColor[] VALUES = values();
    private static final int SIZE = VALUES.length;
    private static final Random RANDOM = new Random();

    public static String getRandomColor()  {
        return VALUES[RANDOM.nextInt(SIZE)].toString();
    }
}
