package day2.first.algebra;


import day2.first.Exceptions.AmountOfVariablesException;
import day2.first.algebra.elementary.calc.squareRoot.SquareRoots;
import day2.first.in.FromConsole;
import day2.first.out.strategies.IOutStrategy;
import day2.first.variables.EnumVariables;

import static day2.first.out.ToConsole.outString;

public class Calculator {
    private IOutStrategy _outStrategy;
    public void Calculator(IOutStrategy outStrategy){
        _outStrategy = outStrategy;
    }
    public void calcSqueareRoot(){
        //_outStrategy.outString("dasda");
        double[] doublesArr = new double[3];
        String outConsoleStringStart = "enter the number ";
        String outConsoleStringEnd = " : ";
        outString(outConsoleStringStart + EnumVariables.A + outConsoleStringEnd);
        doublesArr[0] = FromConsole.getDouble();
        outString(outConsoleStringStart + EnumVariables.B + outConsoleStringEnd);
        doublesArr[1] = FromConsole.getDouble();
        outString(outConsoleStringStart + EnumVariables.C + outConsoleStringEnd);
        doublesArr[2] = FromConsole.getDouble();

        double[] resultDoubleArr = new double[0];
        try {
            resultDoubleArr = SquareRoots.getRoots(doublesArr);
        } catch (AmountOfVariablesException e) {
            throw new RuntimeException(e);
        }
        if (resultDoubleArr == null || resultDoubleArr.length == 0) {
            outString("equation has no roots");
        }
        else {
            for (int i = 0; i < resultDoubleArr.length; i++) {
                outString("x" + i + " = " + resultDoubleArr[i]);
            }
        }
    }
}
