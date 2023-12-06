package Day15Task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        File shoes = new File("Files/shoes.csv");
        File missingShoes = new File("Files/Missing_Shoes.txt");

        try {
            Scanner scan = new Scanner(shoes);
            PrintWriter printWriter = new PrintWriter(missingShoes);
            while (scan.hasNextLine()){
                String[] inputList = scan.nextLine().split(";");
                if(Integer.parseInt(inputList[2]) == 0){
                    printWriter.println(inputList[0] + " , " + inputList[1] + " , " + inputList[2]);
                }
            }

            printWriter.close();
            scan.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }


        }



    }





