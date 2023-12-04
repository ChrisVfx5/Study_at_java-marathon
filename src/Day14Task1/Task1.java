package Day14Task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException {
        File file = new File("txt1");
        printSumDigits(file);




    }

    public static void printSumDigits(File file){
        try {
            Scanner scan = new Scanner(file);
            String input = scan.nextLine();
            String[] inputLine = input.split(" ");

            if(inputLine.length != 10){
                throw new IOException();
            }

            int[] numbers = new int[inputLine.length];
            int counter = 0;
            for (String el: inputLine){
                numbers[counter++] = Integer.parseInt(el);
            }

            int summa = 0;
            for (Integer el: numbers){
                summa += el;
            }
            System.out.println("Сумма всех чисел: " + summa);





        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");;
        } catch (IOException e){
            System.out.println("Некорректный входной файл");
        }


    }


}
