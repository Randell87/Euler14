/*Следующая повторяющаяся последовательность определена для множества натуральных чисел:
n → n/2 (n - четное)
n → 3n + 1 (n - нечетное)
Используя описанное выше правило и начиная с 13, сгенерируется следующая последовательность:
13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
Получившаяся последовательность (начиная с 13 и заканчивая 1) содержит 10 элементов. Хотя это до сих пор и не доказано (проблема Коллатца (Collatz)), предполагается, что все сгенерированные таким образом последовательности оканчиваются на 1.
Какой начальный элемент меньше миллиона генерирует самую длинную последовательность?
Примечание: Следующие за первым элементы последовательности могут быть больше миллиона.*/

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int max=0;
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i=10000; i<1000000; i++){
            long t = i;
            int n=0;
            while (t !=1){
            if(t%2 == 0) t=t/2;
                else t=3*t+1;
             n++;
            }
            //System.out.println(i);
            if (n>max) {max=n;
            System.out.println("для " + i + " длинна последовательности " + n);}
        }
    }
}
//106239
