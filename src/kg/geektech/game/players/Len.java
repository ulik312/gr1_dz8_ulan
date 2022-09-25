package kg.geektech.game.players;

public class Len extends Hero{
    public Len(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.LENGOO);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        System.out.println("Мне лень сражатся");
    }
}