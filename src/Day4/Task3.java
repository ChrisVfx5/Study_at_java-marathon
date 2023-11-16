package Day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);


        Random rand = new Random();
        int[][] arrey = new int[12][8];
        for (int i = 0;  i < arrey.length;i++){
            for (int j = 0; j < arrey[i].length; j++){
                arrey[i][j] = rand.nextInt(50);
            }
        }


        for (int i = 0;  i < arrey.length;i++){
            for (int j = 0; j < arrey[i].length; j++) {
                System.out.print(arrey[i][j] + " ");
            }
            System.out.println();
        }


        int maxSumma = 0;
        int index = 0;
        for (int i = 0; i < arrey.length; i++){
            int sum = 0;
            for (int j = 0; j < arrey[i].length; j++){
                sum += arrey[i][j];
            }
            System.out.println("Index: " + i + " Сумма: " + sum);
            if (sum >= maxSumma){
                maxSumma = sum;
                index = i;
            }
        }


        System.out.println();
        System.out.println("Индекс строки с максимальной суммой: " + index);



    }
}
