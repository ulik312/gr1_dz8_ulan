package kg.geektech.game.players;

import kg.geektech.game.start.RPG_Game;

public class Boss extends GameEntity {
    private SuperAbility defence;

    public Boss(int health, int damage, String name) {
        super(health, damage, name);
    }

    public void chooseDefence(Hero[] heroes) {
        int randomIndex = RPG_Game.random.nextInt(heroes.length);
        this.defence = heroes[randomIndex].getAbility();
    }


    public SuperAbility getDefence() {

        return defence;
    }

    @Override
    public String toString() {
        return "BOSS " + super.toString() + " defence: "
                + (this.defence == null ? "No defence" : this.defence);
    }

    public void setDamage(int i) {
    }

    public void attack(Hero[] heroes) {


        if (this.getHealth() > 0) {
            for (int i = 0; i < heroes.length; i++) {
                if (heroes[i].getHealth() > 0) {
                    if (heroes[i] instanceof Berserk) {
                        heroes[i].setHealth(heroes[i].getHealth()
                                - this.getDamage() / 2);
                        ((Berserk) heroes[i]).setSavedDamage(this.getDamage() / 2);
                    } else {
                        heroes[i].setHealth(heroes[i].getHealth()
                                - this.getDamage());
                    }
                }
                if (heroes[i].getHealth() > 0) {
                    heroes[i].setHealth(heroes[i].getHealth() - this.getDamage());
                }
            }
        }
    }
}