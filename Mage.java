
public class Mage extends Characters {

    Mage(String charactername , String name, int healt, int attackpower) {
        super(charactername , name, healt, attackpower);
    }

    

    @Override
    public int specialAttack(int attackpower) {
        System.out.println("Your Mage did a Fireball special move you will be damage 25 for this round");
        System.out.println("You damaged 25 to your enemy");
        return attackpower + 13;
    }

}
