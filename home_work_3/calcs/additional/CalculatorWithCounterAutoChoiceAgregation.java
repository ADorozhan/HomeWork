package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {
    CalculatorWithOperator cwo;
    CalculatorWithMathCopy cwc;
    CalculatorWithMathExtends cwe;
    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends cwe) {
        this.cwe = cwe;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy cwc) {
        this.cwc = cwc;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator cwo) {
        this.cwo = cwo;
    }
    private int a=15;
    private int b=7;
    private int c=28;
    private int d=5;
    private double e=4.1;
    private int count=0;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }

    public double getE() {
        return e;
    }



    public int addition(double number,double numberTwo) {
        count();
        double result = number + numberTwo;
        return (int) result;
    }

    public int subtraction(double number, double numberTwo) {
        count();
        double result = number - numberTwo;
        return (int) result;
    }

    public int multiplication(double number, double numberTwo) {
        count();
        double result = number * numberTwo;
        return (int) result;
    }

    public int division(double number,double numberTwo) {
        count();
        double result = number / numberTwo;
        return (int) result;
    }

    public double sqrt(double number) {
        count();
        double result = Math.sqrt(number);
        return (result);
    }

    public double abs(double number) {
        count();
        double result = Math.abs(number);
        return (result);

    }

    public double pow(double number, int value) {
        count();
        double result=Math.pow(number,value);
        return (result);
    }
    public void  count(){
        count++;
    }

    long getCountOperation(){
        return (count);
    }

}
