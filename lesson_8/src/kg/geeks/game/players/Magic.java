package kg.geeks.game.players;

public class Magic extends Hero {
    private int roundsRemaining = 4;

    public Magic(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.BOOST);
    }


    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (roundsRemaining > 0) {
            System.out.println("Magician увеличил атаку всех героев на " + 10 + " единиц.");
            for (Hero hero : heroes) {
                hero.setDamage(hero.getDamage() + 10);
            }
            roundsRemaining--;
        }
    }
}
