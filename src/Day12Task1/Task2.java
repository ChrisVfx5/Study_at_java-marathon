package Day12Task1;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        List<Integer> numberList = new ArrayList<>();
        addNumbers(numberList, 0, 30);
        System.out.println(numberList);
        addNumbers2(numberList, 300, 350);
        System.out.println(numberList);


    }

    public static void addNumbers(List<Integer> list, int from, int to) {
        for (int i = from; i < to; i++) {
            if(i % 2 == 0) {
                list.add(i);
            }
        }
    }


    public static void addNumbers2(List<Integer> list, int from, int to) {
        for (int i = from; i < to; i++) {
            if(i % 2 == 0) {
                list.add(i);
            }
        }
    }



}
