public abstract class Characters {
    String charactername;
    String name;
    int health;
    int attackpower;

    Characters(String charactername , String name, int health, int attackpower) {
        this.charactername = charactername;
        this.name = name;
        this.health = health;
        this.attackpower = attackpower;

    }

    public int takedamage(Characters character, Enemies enemy) {
        return character.health - enemy.attackpower;
    }

    public boolean isAlive(Characters character) {
        if(character.health>0){
        return true;
        }
        else{
        return false;
        }
    }

    public abstract int specialAttack(int attackpower);

    public int attack(Enemies enemy) {
        System.out.println("You damaged " + attackpower);
        return attackpower;
    }

    
    public int defend(Enemies enemy) {
        System.out.println("You defended for this round");
        System.out.println("You taked " + (enemy.attackpower / 2) + " damage");
        return health - enemy.attackpower / 2;
    }

}
