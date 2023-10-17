package home_work_3.calcs.simple;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends cwe=new CalculatorWithMathExtends();
        double result=cwe.pow(cwe.division(cwe.c,cwe.d)
                +cwe.addition(cwe.multiplication(cwe.a,cwe.b), (int) cwe.e),2);
        System.out.println(result);

    }
}
