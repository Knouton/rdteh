package day5.shape.factory.random;

import java.util.Random;


/**
 * получение случайного числа для построяния фигур
 * @author kokotov
 * @version 1.0
 */
public class RandomNumbers {

    public static double getRandomDoubleForShape() {
        double min = 1;
        double max = 100;
        double diff = max - min;
        Random random = new Random();
        return random.nextDouble(diff)+min;
    }
    public static float getRandomAngle(){
        float min = 60;
        float max = 120;
        float diff = max - min;
        Random random = new Random();
        return random.nextFloat(diff)+min;
    }

    public static double getRandomDoubleForTriangle() {
        double min = 6;
        double max = 9;
        double diff = max - min;
        Random random = new Random();
        return random.nextDouble(diff)+min;
    }
}
