package Day11Task2;

import Day11Task2.Hero;

public class Paladin extends Hero implements Healer{


    public Paladin(){
        physDef = 0.5;
        magicDef = 0.2;
        physAtt = 15;

    }


    @Override
    public void healHimself() {
        health += 25;
        if(health > MAX_HEALTH){
            health = MAX_HEALTH;
        }

    }

    @Override
    public void healTimmate(Hero hero) {
        hero.health += 10;

        if(hero.health > MAX_HEALTH){
            hero.health = MAX_HEALTH;
        }
    }

    @Override
    public void PhysicalAttack(Hero hero) {
        super.PhysicalAttack(hero);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

