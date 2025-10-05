public class Rogue extends Characters {
    Rogue(String charactername, String name, int healt, int attackpower) {
        super(charactername , name, healt, attackpower);
    }

    

    @Override
    public int specialAttack(int attackpower) {
        System.out.println("Your Rogue did a Quick Strike special move you will be attack twice this round");

        for (int i = 1; i <= 2; i++) {
            System.out.println("You damaged " + attackpower + " to your enemy");
        }

        return attackpower * 2;

    }

}
