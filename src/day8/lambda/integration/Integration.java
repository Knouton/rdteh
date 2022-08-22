package day8.lambda.integration;

@FunctionalInterface
interface Integration {
    double CalcIntegral(double x, double h, double x1);
}
