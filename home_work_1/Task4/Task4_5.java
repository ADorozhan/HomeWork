package home_work_1.Task4;

import java.util.Scanner;

// Буква или иной символ
public class Task4_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char c = scan.next().charAt(0);//charAt- ввод только тип данных char
        if(c >= 'a' && c <= 'z'||c >= 'A' && c <= 'Z'){//являится символ буквой
                   System.out.println("Буква");
        }
        else if(c >= '0' && c <= '9'){//является символ цифрой
            System.out.println("Цифра");
        }
    }
}
