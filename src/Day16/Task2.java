package Day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        File file1 = new File("Files2/file1.txt");
        File file2 = new File("Files2/file2.txt");

        try {
            PrintWriter printWriter = new PrintWriter(file1);
            PrintWriter printWriter1 = new PrintWriter(file2);
            Random rand = new Random();
            for (int i = 0; i < 50; i++){
                for (int j = 0; j < 20; j++){
                    printWriter.print(rand.nextInt(100) + " ");
                }
                printWriter.println();
            }

            printWriter.close();

            Scanner scan = new Scanner(file1);
            double summa = 0;
            double averageNum = 0;
            while (scan.hasNextLine()){
                String[] input = scan.nextLine().split(" ");
                for(String el: input){
                    summa += Double.parseDouble(el);
                }
                averageNum = summa / input.length;
                printWriter1.print(averageNum + " ");
            }

            printWriter1.close();
            scan.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");;
        }

        printResult(file2);


    }

    public static void printResult(File file) {
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String[] input = scan.nextLine().split(" ");
                double summa = 0;
                for (String el : input) {
                    summa += Double.parseDouble(el);
                }
                double averageNum = summa / input.length;
                String averageNumber = String.valueOf((int)averageNum);
                System.out.println(averageNumber);
            }

            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }




}
