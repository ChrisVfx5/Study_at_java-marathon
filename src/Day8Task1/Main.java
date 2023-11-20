package Day8Task1;

public class Main {

    public static void main(String[] args) {

        StringBuilder string = new StringBuilder(" ");
        long startTime1 = System.currentTimeMillis();
        for (int i =0; i <= 20000; i++){
            string.append(i).append(" ");
        }
       System.out.println(string);
        long stopTime1 = System.currentTimeMillis();


        System.out.println("\n\n\n");


        String strin2 = "";
        long startTime2 = System.currentTimeMillis();
        for (int i =0; i <= 20000; i++){
            strin2 += i + " ";
        }
       System.out.println(strin2);
       long stopTime2 = System.currentTimeMillis();





       long firstResult = stopTime1 - startTime1;
        System.out.println("Длительность работы первой программы, в мс.: " + firstResult);
        long secondResult = stopTime2 - startTime2;
        System.out.println("Длительность работы второй программы, в мс.: " + secondResult);




    }


}
