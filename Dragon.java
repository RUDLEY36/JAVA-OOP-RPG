import java.util.Random;

public class Dragon extends Enemies {
    Random rand = new Random();

    Dragon(String name, int healt, int attackpower) {
        super(name, healt, attackpower);
    }

    @Override
    public int attack(Characters character) {
        System.out.println("The " + this.name + " attacked your " + character.charactername + " " + character.name
                + " new health : " + (character.health - attackpower));
        return attackpower;
    }

    @Override
    public int defend(Characters character) {
        health -= character.attackpower / 2;
        System.out.println("The " + this.name + " is defended");
        return 0;
    }

    @Override
    public int specialAttack(Characters character) {
        System.out.println("The " + this.name + " Attacked your " + character.charactername + " " + character.name
                + " with his special attack Fire Breath");
        System.out.println("Your " + character.charactername + " " + character.name + " taked 33 damage");
        return this.attackpower + 15;
    }

    @Override
    public int processofRound(Characters character) {
        switch (rand.nextInt(1, 4)) {
            case 1:
                return attack(character);

            case 2:
                return defend(character);

            case 3:
                return specialAttack(character);

        }
        return 0;
    }

}
