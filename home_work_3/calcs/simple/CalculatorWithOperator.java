package home_work_3.calcs.simple;

public class CalculatorWithOperator {
    public int addition(double number, double numberTwo) {
        int result = (int) (number + numberTwo);
        return (result);
    }

    public int subtraction(double number, double numberTwo) {
        int result = (int) (number - numberTwo);
        return (result);
    }

    public int multiplication(double number, double numberTwo) {
        double result = number * numberTwo;
        return (int) result;
    }

    public int division(double number, double numberTwo) {
        double result = number / numberTwo;
        return (int) result;
    }

    public double sqrt(double number) {
        double result = Math.sqrt(number);
        return (result);
    }

    public double abs(double number) {
        if(number<0){
            number*=-1;
        }return (number);

    }
    public double pow(double number,int value) {
        int result=1;
        if(number<0){
         number= (int) abs(number);
        }
       for (int i=1;i<=value;i++){
                result*=number;
        }return(result);
    }
}

