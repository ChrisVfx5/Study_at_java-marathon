package Day11Task2;

import Day11Task2.Hero;

public class Magician extends Hero implements MagicalAttack{

    protected int magicAtt;
    public Magician(){
        physDef = 0.0;
        magicDef = 0.8;
        physAtt = 5;
        magicAtt = 20;
    }


    @Override
    public void magicalAttack(Hero hero) {
        double damage = magicAtt * (1 - hero.magicDef);
        if(hero.health - damage < MIN_HEALTH){
            hero.health = MIN_HEALTH;
        }else
            hero.health -= damage;
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
