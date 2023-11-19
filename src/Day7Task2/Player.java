package Day7Task2;

public class Player {

    private int stamina;
    private final int MAX_STAMINA = 100;
    private final int MIN_STAMINA = 0;
    protected static int countPlayer = 0;

    public Player(int stamina){
        this.stamina = stamina;
        countPlayer++;
    }

    protected int getStamina(){
        return stamina;
    }
    protected int getCountPlayer(){
        return countPlayer;
    }

    protected int run(){
        stamina--;
        if(stamina == MIN_STAMINA){
            countPlayer--;
        }
        return stamina;
    }
    protected static void info(){
        int needsPlayer = 6 - countPlayer;
        String rightEnding = "";
        switch (needsPlayer){
            case 1:
                rightEnding = " свободное место";
                break;
            case 2:
            case 3:
            case 4:
                rightEnding = " свободных места";
                break;
            case 5:
            case 6:
                rightEnding = " свободных мест";
        }
        if(countPlayer != 6){
            System.out.println("Команды не полные. На поле еще есть " + needsPlayer + rightEnding);
        }else {
            System.out.println("На поле нет свободных мест");
        }
    }


}
