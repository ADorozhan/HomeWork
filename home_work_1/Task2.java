package home_work_1;
//Изучить приоритетность операторов по таблице
public class Task2 {
    public static void main(String[] args) {
        int a=5,b=2,c=8;
        System.out.println( 5 + 2 / 8); //деление выше по приоритету,поэтому 2/8=0+5=5
        System.out.println( (5 + 2) / 8);//Выражение внутри круглых скобок вычисляется первым
                                        //5+2=7/8=0
       // System.out.println( (5 + 2++) / 8);
       // System.out.println((5 + 2++) / --8);
       // System.out.println((5 * 2 >> 2++) / --8);
        //System.out.println((5 + 7 > 20 ? 68 : 22 * 2 >> 2++) / --8);
       // System.out.println( (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> 2++) / --8);
        System.out.println(  6 - 2 > 3 && 12 * 12 <= 119);//возвращает false т.к
                                                         // 12 * 12 <= 119
                                                        // не соответствует условию
        System.out.println( true && false);//если одна часть false,вернет false
        float number=37;
        float result =2 ;
        System.out.println(Math.abs(number));

    }
}
