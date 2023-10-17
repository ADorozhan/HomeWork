package home_work_3.calcs.additional;

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;


public class CalculatorWithCounterDelegateCompositeMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoComposite cwac=new CalculatorWithCounterAutoComposite();
        System.out.println("Количество использований калькулятора"+" "+cwac.getCountOperation());
        double result=cwac.pow(cwac.division(cwac.getC(),
                cwac.getD())+cwac.addition
                (cwac.multiplication(cwac.getA(), cwac.getB()), (int) cwac.getE()),2);
        System.out.println(result);
        System.out.println("Количество использований калькулятора"+" "+cwac.getCountOperation());
    }
}
