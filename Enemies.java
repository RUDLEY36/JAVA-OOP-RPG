public abstract class Enemies implements ICombatActionForEnemies {
    String name;
    int attackpower;
    int health;

    Enemies(String name, int health, int attackpower) {
        this.name = name;
        this.health = health;
        this.attackpower = attackpower;

    }

    

}
