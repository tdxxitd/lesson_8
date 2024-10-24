package kg.geeks.game.players;

import kg.geeks.game.general.RPG_Game;

public class Ludaman extends Hero{

    public Ludaman(int health, int damage, String name) {
        super(name, health, damage,  SuperAbility.LUCK_OR_NOT);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int first = RPG_Game.random.nextInt(6) + 1;
        int second = RPG_Game.random.nextInt(6) + 1;

        for (int i = 0; i <heroes.length; i++) {
            if (first == second) {
                int a = first * second;
                boss.setHealth(boss.getHealth() - a);
                System.out.println(this.getName() + "is lucky and hit boss "
                        + this.getDamage());
                break;
            }
            else {
                int b = first + second;
                for (Hero hero : heroes) {
                    hero.setHealth(hero.getHealth() - (first + second));
                    System.out.println(this.getName() + " is not lucky and hit his teammate "
                            + this.getDamage());
                    break;
                }

            }


            break;
        }
    }
}