package kg.geektech.game.players;

import kg.geektech.game.start.RPG_Game;

public class Thor extends Hero{
    public Thor(int health, int damage, String name) {
        super(health, damage, name,SuperAbility.STUN);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boolean playerThor = RPG_Game.random.nextBoolean();
        if(playerThor) {
            boss.setDamage(0);
            System.out.println("boss oglushen");

        }else {
            boss.setDamage(50);
        }
    }
}