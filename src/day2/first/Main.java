package day2.first;

import day2.first.algebra.Calculator;

public class Main {

    public static void main(String[] args) {
        /*double[] doublesArr = new double[3];
        String outConsoleStringStart = "enter the number ";
        String outConsoleStringEnd = " : ";
        outString(outConsoleStringStart + enumVariables.A + outConsoleStringEnd);
        doublesArr[0] = fromConsole.getDouble();
        outString(outConsoleStringStart + enumVariables.B + outConsoleStringEnd);
        doublesArr[1] = fromConsole.getDouble();
        outString(outConsoleStringStart + enumVariables.C + outConsoleStringEnd);
        doublesArr[2] = fromConsole.getDouble();

        try {
            double[] resultDoubleArr = squareRoots.getRoots(doublesArr);
            if (resultDoubleArr == null || resultDoubleArr.length == 0) {
                outString("equation has no roots");
            } else {
                for (int i = 0; i < resultDoubleArr.length; i++) {
                    outString("x" + i + " = " + resultDoubleArr[i]);
                }
            }

        } catch (amountOfVariablesException e) {
            System.out.println(e.getMessage());
        }*/
        Calculator calculator = new Calculator();
        calculator.calcSqueareRoot();
    }
}