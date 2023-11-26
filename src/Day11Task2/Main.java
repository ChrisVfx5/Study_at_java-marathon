package Day11Task2;

public class Main {
    public static void main(String[] args) {


        Warrior warrior = new Warrior();
        Paladin paladin = new Paladin();
        Magician magician = new Magician();
        Shaman shaman = new Shaman();

        warrior.PhysicalAttack(paladin);
        System.out.println("paladin: " + paladin);

        paladin.PhysicalAttack(magician);
        System.out.println("magician: " + magician);

        shaman.healTimmate(magician);
        System.out.println("magician: " + magician);

        magician.magicalAttack(paladin);
        System.out.println("paladin: " + paladin);

        shaman.PhysicalAttack(warrior);
        System.out.println("warrior: " + warrior);

        paladin.healHimself();
        System.out.println("paladin: " + paladin);

        for (int i = 1; i <= 5; i++){
            warrior.PhysicalAttack(magician);
            System.out.println("magician: " + magician);
        }




    }
}
