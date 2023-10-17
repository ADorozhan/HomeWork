package home_work_3.calcs.simple;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        int a=15;
        int b=7;
        int c=28;
        int d=5;
        double e=4.1;
        CalculatorWithMathCopy cwc = new CalculatorWithMathCopy();
        double result=cwc.pow(cwc.division(c,d)+cwc.addition(cwc.multiplication(a,b), (int) e),2);
        System.out.println(result);

    }
}
