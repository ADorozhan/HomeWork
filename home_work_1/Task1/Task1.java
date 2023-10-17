package home_work_1.Task1;

import java.util.Scanner;
//1.1 Создать класс и написать код с вводом двух чисел через консоль и применением
// побитовых операций И и ИЛИ к этим двум числам. Результат операций распечатать.
//	1.2 В комментариях напротив каждого ввода значений написать пример выбранного числа
//	в двоичном коде (8 бит), также написать комметарии напротив каждой операции
//	на примере этих двух чисел.
//	1.3 В отдельном классе попробуйте сделать побитовую операцию с литералом 42.5,
//	опишите результат в комментариях в классе с заданием.
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number;
        int number1;

        for (int i=0;i<1;i++){
            System.out.println("Enter two numbers separated by a space");
            number=scanner.nextInt();//12-1100
            number1=scanner.nextInt();//23-10111
            System.out.println(number|number1);//31
            System.out.println(number&number1);//4
            while (number>0){ //12-преобразовываем в двоичное число
                int x=number%2;//Делит левый операнд на правый операнд и возвращает
                              // остаток
                number=number/2;//Делит левый операнд на 2
                System.out.print(x);//выводит в обратном порядке
            }                       // //как его перевернуть????
            System.out.println();
            while (number1>0){//23-преобразовываем в двоичное число
                int y=number1%2;
                number1=number1/2;
                System.out.print(y);//выводит в обратном порядке
                                    //как его перевернуть????
            }

        }

    }
}
