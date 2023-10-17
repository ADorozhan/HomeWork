package home_work_3.calcs.additional;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

//1.1 4.1 + 15 * 7 + (28 / 5) ^ 2
public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic cwcc=new CalculatorWithCounterClassic();
      double div=  cwcc.division(cwcc.c,cwcc.d);
       cwcc.incrementCountOperation();
      double mult= cwcc.multiplication(cwcc.a,cwcc.b);
        cwcc.incrementCountOperation();
     double add=cwcc.addition(div,mult);
        cwcc.incrementCountOperation();
        double add1=cwcc.addition(add, cwcc.e);
        cwcc.incrementCountOperation();
      int result= (int) cwcc.pow(add1,2);
        cwcc.incrementCountOperation();
        System.out.println(result);
        System.out.println( cwcc.getCountOperation()+"qwe");

    }
}
