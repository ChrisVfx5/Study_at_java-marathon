package Day12Task1;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
        public static void main(String[] args) {

            List<String> carList = new ArrayList<>(5);
            carList.add("BMW");
            carList.add("Nissan");
            carList.add("Skoda");
            carList.add("Chewrolet");
            carList.add("Maserati");

            System.out.println(carList);

            carList.add(3, "Bugatti");
            //System.out.println(carList);
            carList.remove(0);
            System.out.println(carList);



        }
    }


