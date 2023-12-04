package Day14Task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        File file = new File("people");
        System.out.println(parseFileToObjList(file));


    }

    public static List<Human> parseFileToObjList(File file){
        List<Human> person = new ArrayList<>();

        try {
            Scanner scan = new Scanner(file);
            String input;
            while (scan.hasNextLine()){
                input = scan.nextLine();


                String[] inputPerson = input.split(" ");
                if(Integer.parseInt(inputPerson[1]) < 0){
                    throw new IOException();
                }



                person.add(new Human(inputPerson[0],Integer.parseInt(inputPerson[1])));
            }

            return person;






        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");;
        }catch (IOException e){
            System.out.println("Некорректный входной файл");
        }

        return null;
    }


}
