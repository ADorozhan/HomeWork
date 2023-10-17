package home_work_3.calcs.simple;

public class CalculatorWithMathCopy {
    public int addition(double number,double numberTwo) {
        double result = number + numberTwo;
        return (int) result;
    }

    public int subtraction(double number, double numberTwo) {
        double result = number - numberTwo;
        return (int) result;
    }

    public int multiplication(double number, double numberTwo) {
        double result = number * numberTwo;
        return (int) result;
    }

    public int division(double number,double numberTwo) {
        double result = number / numberTwo;
        return (int) result;
    }

    public double sqrt(double number) {
        double result = Math.sqrt(number);
        return (result);
    }

    public double abs(double number) {

        double result = Math.abs(number);
        return (result);

    }

    public double pow(double number, int value) {
       double result=Math.pow(number,value);
       return (result);
    }
}