package Day4;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {




        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scan.nextInt();
        int min = 0;
        int max = 10;


        int[] arrey = new int[size];


        // Заполнение массива
        for (int i = 0; i < arrey.length; i++) {
            arrey[i] = ((int) (Math.floor(Math.random() * ((max - min)+1) + min )));
        }


        // Вывод массива на экран
        for (int el : arrey) {
            System.out.print(arrey[el] + ", ");
        }


        int lehgthArrey = 0;
        int countMoreEight = 0;
        int numEqualOne = 0;
        int countEvenNum = 0;
        int countNonEvenNum = 0;
        int summaAllEl = 0;


        System.out.println();


        for (int i = 0; i < arrey.length; i++) {
            lehgthArrey = i;
        }


        for (int el : arrey){
            if(arrey[el] > 8){
                countMoreEight += 1;
            }
            if(arrey[el] == 1){
                numEqualOne += 1;
            }
            if(arrey[el] % 2 == 0){
                countEvenNum += 1;
            }
            if(arrey[el] % 2 != 0){
                countNonEvenNum += 1;
            }


            summaAllEl += arrey[el];
        }




        System.out.println("Длина массива: " + lehgthArrey + " элементов");
        System.out.println("Количество чисел больше 8: " + countMoreEight + "\nКоличество чисел ранвых 1: " + numEqualOne +
                "\nКоличество четных чисел: " + countEvenNum + "\nКоличество нечетных чисел: " + countNonEvenNum +
                "\nСумма всех элементов массива: " + summaAllEl);





        }
    }



