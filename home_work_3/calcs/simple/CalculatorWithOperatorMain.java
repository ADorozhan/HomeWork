package home_work_3.calcs.simple;

import home_work_3.calcs.WithoutCalculatorMain;
import home_work_3.calcs.simple.CalculatorWithOperator;

//4.1 + 15 * 7 + (28 / 5) ^ 2
public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        int a=15;
        int b=7;
        int c=28;
        int d=5;
        double e=4.1;
        CalculatorWithOperator cwo=new CalculatorWithOperator();
       double result=cwo.pow(cwo.division(c,d)+cwo.addition(cwo.multiplication(a,b), (int) e),2);
        System.out.println(result);

    }
}
