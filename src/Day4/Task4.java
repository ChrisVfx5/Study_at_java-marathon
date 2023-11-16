package Day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int[] arrey = new int[100];
        Random rand = new Random();

// Заполнение массива
        for (int i = 0; i < arrey.length; i++){
            arrey[i] = rand.nextInt(10000);
        }
        System.out.println(Arrays.toString(arrey));


        int maxSumma = 0;
        int indexOfFirstEl = 0;
        int range = 3;


        for (int i = 0; i < arrey.length - range; i++){
            int sum = 0;
            for (int j = i; j < i + range; j++){
                sum += arrey[j];
            }
            if(sum > maxSumma){
                maxSumma = sum;
                indexOfFirstEl = i;
            }
        }
        System.out.println("Максимальная сумма 3-ух элементов: " + maxSumma);
        System.out.println("Индекс первого элемента тройки: " + indexOfFirstEl);


    }
}
