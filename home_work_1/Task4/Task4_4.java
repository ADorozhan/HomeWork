package home_work_1.Task4;

import java.util.Scanner;

//4.4 Перевести байты в килобайты или наоборот
public class Task4_4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите число");
        double result=scanner.nextInt();// ввод числа,маленькое число в килобайт=0,поэтому double
        if(result>0){ //если вводимое число больше 0
            System.out.println("Перевести число в килобайты введите 1 если в байты введите 2");
            int number=scanner.nextInt();
    switch (number){//выбор нужного case
        case 1:result= result/1024;// килобайты
            System.out.println(result);
            break;
        case 2:
            result= result*1024;//байты
            System.out.println(result);
            break;
        default:
            System.out.println("Не правильный ввод!!!!");// не выбран нужный case
            break;
    }
        } else System.out.println("Число меньше либо равно 0");//если число>=0 выводит сообщ

    }

}
