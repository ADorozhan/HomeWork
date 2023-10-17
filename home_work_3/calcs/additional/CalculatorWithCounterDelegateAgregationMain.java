package home_work_3.calcs.additional;

public class CalculatorWithCounterDelegateAgregationMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper cwcs=new CalculatorWithCounterAutoSuper();
        CalculatorWithCounterAutoAgregation cwca=new CalculatorWithCounterAutoAgregation(cwcs);
        System.out.println("Количество использований калькулятора"+" "+cwca.getCountOperation());
        double result=cwca.pow(cwca.division(cwcs.c, cwcs.d)+cwca.addition
                (cwca.multiplication(cwcs.a,  cwcs.b), (int) cwcs.e),2);
        System.out.println(result);
        System.out.println("Количество использований калькулятора"+" "+cwca.getCountOperation());
    }
}
