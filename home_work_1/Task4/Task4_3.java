package home_work_1.Task4;

import java.util.Scanner;
/*
 Проверка делимости одного числа на другое
 */
public class Task4_3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите два числа, через Enter ");
        int number=scanner.nextInt();// вводим 1 число
        int number1=scanner.nextInt();// вводим 2 число
        int result;//переменная для сохранения значения
        if(number%number1==0){//если при делении остаток 0
            result=number/number1;//выполняем деление
            System.out.println("Делится"+" "+result);//выводим результат
        }else if(number%number1!=0){//если остаток не равен 0
            result=number%number1;//производим деление
            System.out.println("Не делится"+" "+"остаток "+result);} //выодим на результат

    }

}
