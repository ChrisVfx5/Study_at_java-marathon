package Day7Task2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        int randomNumber = rand.nextInt(90, 100);


        Player pl1 = new Player(randomNumber);
        Player pl2 = new Player(randomNumber);
        Player pl3 = new Player(randomNumber);
        Player pl4 = new Player(randomNumber);
        Player pl5 = new Player(randomNumber);
        Player pl6 = new Player(randomNumber);

        Player.info();

        for (int i = 0; i < 100; i++){
            pl1.run();
        }

        Player.info();


    }
}
