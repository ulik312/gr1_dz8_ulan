package kg.geektech.game.players;

public class Hacker extends Hero{
    public Hacker(int health, int damage, String name, SuperAbility ability) {
        super(health, damage, name, ability);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {

    }
}