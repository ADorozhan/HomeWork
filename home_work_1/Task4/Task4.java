package home_work_1.Task4;

import java.util.Scanner;

/*
Разбираемся с операторами ветвления.
 Каждую задачу в отдельном классе.
 Пояснения по задачам сотреть в презентации и на сайте по ссылке в презентации.
4.1 Определить нечётное число
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите число");
        int number=scanner.nextInt();
        if(number%2!=0){
            System.out.println("Нечетное число");
        }else {
            System.out.println("Четное число");
        }

    }
}
