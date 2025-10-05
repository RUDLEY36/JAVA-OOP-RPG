public class Warrior extends Characters {

    Warrior(String charactername , String name, int healt, int attackpower) {
        super(charactername , name, healt, attackpower);
    }

    
    

    @Override
    public int specialAttack(int attackpower) {
        System.out.println("Your Warrior did a Heavy slash special move your attack increase 10 for this round");
        System.out.println("You damaged 25 to your enemy");
        return attackpower + 10;

    }

}
