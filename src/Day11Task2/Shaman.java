package Day11Task2;

public class Shaman extends Hero implements MagicalAttack, Healer{



    protected int magicAtt;
    public Shaman(){
        physDef = 0.2;
        magicDef = 0.2;
        physAtt = 10;
        magicAtt = 15;


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
    public void healHimself() {
        health += 50;
        if(health > MAX_HEALTH){
            health = MAX_HEALTH;
        }
    }

    @Override
    public void healTimmate(Hero hero) {
        hero.health += 30;

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
