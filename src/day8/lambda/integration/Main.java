package day8.lambda.integration;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import static java.lang.Math.atan;

public class Main {
    public static void main(String[] args) {

        Integration integrationTrapezoid = ((x0, h, x1) -> { //Метод трапеций
            Function<Double, Double> func = (a) -> a*a*atan(a);
            double x;
            double s;
            s=(func.apply(x0)+func.apply(x1))/2;
            for (x=x0+h; x<x1; x+=h) {
                s+=func.apply(x);
            }
            return s*h;
        });

        System.out.println(integrationTrapezoid.CalcIntegral(2, 2, 2));

        Integration integrationSimpson = ((x0, h, x1) -> { //Метод Симпсона
            Function<Double, Double> func = (a) -> a*a*atan(a);
            double x;
            double s;
            double i;
            double n;
            n=(x1-x0)/h;
            s=(func.apply(x0)+func.apply(x1))/2+2*func.apply(x0+h/2);
            x=x0;
            for (i=0; i<n-1; i++) {
                x+=h;
                s+=(2*func.apply(x+h/2)+func.apply(x));
            }
            return s*h/3;
        });

        System.out.println(integrationSimpson.CalcIntegral(2, 2, 2));
    }
}
