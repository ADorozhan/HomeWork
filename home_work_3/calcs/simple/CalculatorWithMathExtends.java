package home_work_3.calcs.simple;

public class CalculatorWithMathExtends extends CalculatorWithOperator {
    int a=15;
    int b=7;
    int c=28;
    int d=5;
    double e=4.1;
    @Override
    public double sqrt(double number) {
        double result = Math.sqrt(number);
        return (result);
    }

    @Override
    public double abs(double number) {
        double result = Math.abs(number);
        return (result);
    }

    @Override
    public double pow(double number, int value) {
        double result=Math.pow(number,value);
        return (result);
    }

}
