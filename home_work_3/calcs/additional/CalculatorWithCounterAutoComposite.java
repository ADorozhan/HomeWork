package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoComposite {
    CalculatorWithCounterAutoSuper cwa;
   private int a=15;
   private int b=7;
   private int c=28;
   private int d=5;
   private double e=4.1;
    private int count;

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

    public CalculatorWithCounterAutoComposite() {
        this.cwa = new  CalculatorWithCounterAutoSuper();
        this.count=0;
    }
    public int addition(double number, double numberTwo) {
        ++count;
        return cwa.addition(number, numberTwo);
    }


    public double sqrt(double number) {
        ++count;
        return cwa.sqrt(number);
    }

    public int subtraction(double number, double numberTwo) {
        ++count;
        return cwa.subtraction(number, numberTwo);
    }

    public double abs(double number) {
        ++count;
        return cwa.abs(number);
    }

    public double pow(double number, int value) {
        ++count;
        return cwa.pow(number, value);
    }



    public int multiplication(double number, double numberTwo) {
        ++count;
        return cwa.multiplication(number, numberTwo);
    }


    public int division(double number, double numberTwo) {
        ++count;
        return cwa.division(number, numberTwo);
    }

    long getCountOperation(){
        return (count);
}}
