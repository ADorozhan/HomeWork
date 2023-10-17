package home_work_3.calcs.additional;

public class CalculatorWithCounterAutoAgregation {
    CalculatorWithCounterAutoSuper cwa;
    private int count=0;

    public CalculatorWithCounterAutoAgregation(CalculatorWithCounterAutoSuper cwa) {
        this.cwa = cwa;
        this.count=0;
    }
    private int a=15;
    private int b=7;
    private int c=28;
    private int d=5;
    private double e=4.1;


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


