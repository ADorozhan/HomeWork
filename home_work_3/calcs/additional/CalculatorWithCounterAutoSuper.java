package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    int a=15;
    int b=7;
    int c=28;
    int d=5;
    double e=4.1;
    private int count=0;
    @Override
    public int addition(double number, double numberTwo) {
        ++count;
        return super.addition(number, numberTwo);
    }

    @Override
    public double sqrt(double number) {
        ++count;
        return super.sqrt(number);
    }

    @Override
    public int subtraction(double number, double numberTwo) {
        ++count;
        return super.subtraction(number, numberTwo);
    }

    @Override
    public double abs(double number) {
        ++count;
        return super.abs(number);
    }


    @Override
    public double pow(double number, int value) {
        ++count;
        return super.pow(number, value);
    }


    @Override
    public int multiplication(double number, double numberTwo) {
        ++count;
        return super.multiplication(number, numberTwo);
    }

    @Override
    public int division(double number, double numberTwo) {
        ++count;
        return super.division(number, numberTwo);
    }

    long getCountOperation(){
          return (count);

    }

}
