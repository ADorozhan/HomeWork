package home_work_3.calcs.additional;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper cwa=new CalculatorWithCounterAutoSuper();
        System.out.println("Количество использований калькулятора"+" "+cwa.getCountOperation());
        double result=cwa.pow(cwa.division(cwa.c, cwa.d)+cwa.addition
                (cwa.multiplication(cwa.a, cwa.b), (int) cwa.e),2);
        System.out.println(result);
        System.out.println("Количество использований калькулятора"+" "+cwa.getCountOperation());
    }
}
