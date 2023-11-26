package Day11Task2;

import Day11Task2.Hero;

public class Warrior extends Hero implements PhysAttack{
    public Warrior(){
        physDef = 0.8;
        magicDef = 0.0;
        physAtt = 30;

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
