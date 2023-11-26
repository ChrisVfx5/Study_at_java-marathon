package Day11Task2;

public abstract class Hero implements PhysAttack{

    protected int health;
    protected double physDef;
    protected double magicDef;
    protected int physAtt;
    protected final int MAX_HEALTH = 100;
    protected final int MIN_HEALTH = 0;

    public Hero(){
        health = 100;
    }

    @Override
    public void PhysicalAttack(Hero hero) {
        double damage = physAtt * (1 - hero.physDef);
        if(hero.health - damage < MIN_HEALTH){
            hero.health = MIN_HEALTH;
        }else
            hero.health -= damage;

    }

    @Override
    public String toString() {
        String info;
        if(health <= MIN_HEALTH){
            info = "Герой умер";
        }else {
            info = "health: " + String.valueOf(health);
        }
        return info;
    }



}

