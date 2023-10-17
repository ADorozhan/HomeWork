package home_work_1.Task4;
import java.util.Scanner;
//Определить високосный год или нет
public class Task4_6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите год");
        int year=scanner.nextInt();//ввод года
        if(year%4==0&&year%100!=0||year%400==0){//проверка является год високосным
            System.out.println(year + " " + "високосный год");
        } else System.out.println(year + " "+"не високосный год");// если не високосный

    }
}
