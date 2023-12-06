package Day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        File file = new File("Files/Numbers.txt");

        printResult(file);





    }

    public static void printResult(File file){
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()){
                String[] input = scan.nextLine().split(" ");
                int summa = 0;
                for (String el: input){
                    summa += Integer.parseInt(el);
                }
                double averageNum = (double) summa / input.length;
                DecimalFormat df = new DecimalFormat("#.###");
                String roundAverNum = df.format(averageNum);
                System.out.println(roundAverNum);
            }

            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");;
        }
    }



}
