package home_work_3.calcs.additional;
//5.3 В классе должен быть метод void incrementCountOperation()
// который должен увеличивать внутренний счётчик (поле) в калькуляторе.
//	5.4 В классе должен быть метод long getCountOperation() который
//	должен возвращать количество использований данного калькулятора (поле).
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    private int count=0;
    int a=15;
    int b=7;
    int c=28;
    int d=5;
    double e=4.1;
    void incrementCountOperation(){
       count++;
        getCountOperation();
    }
    long getCountOperation(){
        return (count);
    }
}
