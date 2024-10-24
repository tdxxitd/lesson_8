package kg.geeks.game.players;

public class Witcher extends Hero{
    public Witcher(int health, int damage, String name) {
        super(name, health, damage,  SuperAbility.RESURRECTION);
    }


    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (Hero hero : heroes) {
            if (this.getHealth() > 0 && hero.getHealth() == 0) {
                hero.setHealth(this.getHealth());
                this.setHealth(0);
                System.out.println(this.getName() + " пожертвовал собой!");
            }
        }
    }
}