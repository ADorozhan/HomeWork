package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {
        CalculatorWithOperator cwo=new CalculatorWithOperator();
        CalculatorWithMathCopy cwc=new CalculatorWithMathCopy();
        CalculatorWithMathExtends cwe=new CalculatorWithMathExtends();


        CalculatorWithCounterAutoChoiceAgregation cwaa=new CalculatorWithCounterAutoChoiceAgregation(cwo);
        System.out.println("Количество использований калькулятора"+" "+cwaa.getCountOperation());
        double result=cwaa.cwo.pow(cwaa.cwo.division(cwaa.getC(), cwaa.getD())+cwaa.cwo.addition
                (cwaa.cwo.multiplication(cwaa.getA(), cwaa.getB()), (int) cwaa.getE()),2);
        System.out.println(result);
        System.out.println("Количество использований калькулятора"+" "+cwaa.getCountOperation());

        System.out.println("----------------------------------------------------------------------");
        CalculatorWithCounterAutoChoiceAgregation cwa=new CalculatorWithCounterAutoChoiceAgregation(cwe);
    System.out.println("Количество использований калькулятора"+" "+cwaa.getCountOperation());
    double result1=cwa.cwe.pow(cwa.cwe.division(cwa.getC(), cwa.getD())+cwa.cwe.addition
            (cwa.cwe.multiplication(cwa.getA(), cwa.getB()), (int) cwa.getE()),2);
        System.out.println(result1);
        System.out.println("Количество использований калькулятора"+" "+cwaa.getCountOperation());

 System.out.println("----------------------------------------------------------------------");
        CalculatorWithCounterAutoChoiceAgregation cwac=new CalculatorWithCounterAutoChoiceAgregation(cwc);
    System.out.println("Количество использований калькулятора"+" "+cwac.getCountOperation());
    double result2=cwac.cwc.pow(cwac.cwc.division(cwac.getC(), cwac.getD())+cwac.cwc.addition
            (cwac.cwc.multiplication(cwac.getA(), cwac.getB()), (int) cwac.getE()),2);
        System.out.println(result2);
        System.out.println("Количество использований калькулятора"+" "+cwac.getCountOperation());

}}
