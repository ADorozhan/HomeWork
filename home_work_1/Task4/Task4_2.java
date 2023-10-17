package home_work_1.Task4;

import java.util.Random;

/*
Разбираемся с операторами ветвления. Каждую задачу в отдельном классе.
Пояснения по задачам сотреть в презентации и на сайте по ссылке в презентации.
	4.2 Среди трёх чисел найти среднее
 */
public class Task4_2 {
    public static void main(String[] args) {
                Random rand=new Random();
              int []number=new int[3];//создаем массив на 3 элемента
        for (int i=0;i<number.length;i++){     //заполняем рандомными числами
          number[i]=rand.nextInt(20);
            System.out.print(number[i]+" ");//выводим заполненый массив

        }
        boolean flag = false;
        int temp;
        while(!flag) { //сортируем массив"пузырек"
            flag = true;
            for (int i = 0; i < number.length - 1; i++) {
                if (number[i] > number[i+1]) {
                    temp = number[i];
                    number[i] = number[i+1];
                    number[i+1] = temp;
                    flag = false;
                }
            }
    }
        System.out.println();
        for(int i=0;i<1;i++)
                 System.out.println(number[1]);//выводим значение под индексом 1,т.е
                                              //среднее между 2 элементами массива
}
}
