package day2.first.algebra.elementary.calc.squareRoot;


import day2.first.Exceptions.AmountOfVariablesException;
import day2.first.algebra.elementary.calc.interfaceRoot.IRoot;

public class SquareRoots implements IRoot {

    final static int amountOfVariables  = 3;

    public static double[] getRoots(double[] doubleArr) throws AmountOfVariablesException {
        if (doubleArr.length != amountOfVariables) {
            throw new AmountOfVariablesException("not enough variables to calculate the root");
        }
        final double a = doubleArr[0];
        final double b = doubleArr[1];
        final double c = doubleArr[2];
        final double discriminant = getDiscriminant(a, b, c);
        double[] roots = new double[0];
        if (discriminant >= 0) {
            roots = calcRoots(a, b, discriminant);
        }

        return roots;
    }

    private static double getDiscriminant(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    private static double[] calcRoots(double a, double b, double discriminant) {
        double[] roots;
        if (discriminant > 0) {
            roots = new double[]{(-b - Math.sqrt(discriminant) / 2 * a),
                    (-b + Math.sqrt(discriminant) / 2 * a)};
        } else {
            roots = new double[]{-b/ (2 * a)};
        }
        return roots;
    }

    /*private static int CheckDiscriminantResult(double discriminant){

    }*/
}
