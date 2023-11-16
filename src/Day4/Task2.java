package Day4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {


        int min = 0;
        int max = 10000;


        int[] arrey = new int[100];


        for (int i = 0; i < arrey.length; i++){
            arrey[i] = ((int) (Math.floor(Math.random() * ((max - min)+1) + min )));
        }
        System.out.println(Arrays.toString(arrey));


        int maxEl = arrey[0];
        int minEl = arrey[0];
        int countElWithZeroEnd = 0;
        int summaElWithZeroEnd = 0;


        for (int el : arrey){
            if(el > maxEl){
                maxEl = el;
            }
            if(el < minEl){
                minEl = el;
            }
            if(el % 10 == 0){
                countElWithZeroEnd += 1;
                summaElWithZeroEnd += el;
            }
        }


        System.out.println("Наибольший элемент массива: " + maxEl + "\nНаименьший элемент массива: " + minEl);
        System.out.println("Количество элементов массива оканчивающихся на 0: " + countElWithZeroEnd + "\nСумма элементов массива оканчивающихся на 0: " + summaElWithZeroEnd);








    }
}
