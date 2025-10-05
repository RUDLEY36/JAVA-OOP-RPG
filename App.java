
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        String Username;
        int choice = 0;
        int characterchoicecounter = 0;
        String continueornot = " ";
        int userhealthholder = 0;
        String enemyname = "Undead";
        int specialcounter = 0;

        System.out.println("Welcome to our rpg game !!!");
        while (choice != 1 && choice != 2 && choice != 3) {
            if (characterchoicecounter > 0)
                System.out.println("\nUndefined character");
            System.out.println("Please choice a character\n1-Warrior\n2-Mage\n3-Rogue");
            System.out.print(":");
            choice = scan.nextInt();
            characterchoicecounter++;
        }
        scan.nextLine();
        System.out.print("Please enter your character name : ");
        Username = scan.nextLine();
        System.out.println();

        Createusercharacter create = new Createusercharacter();
        Characters user = create.createCharacter(choice, Username);
        userhealthholder = user.health;

        Enemies enemy = new Goblin("Goblin", 60, 8);

        while (user.isAlive(user)) {

            int move = 0;
            System.out.println("A " + enemy.name + " approached you");
            System.out.println("Please select your move\n1-Attack\n2-Defend\n3-Special Attack");
            System.out.print(":");

            move = scan.nextInt();
            scan.nextLine();
            System.out.println();

            switch (move) {
                case 1:
                    enemy.health -= user.attack(enemy);
                    break;
                case 2:
                    user.health = user.defend(enemy);
                    break;
                case 3:
                    specialcounter++;
                    if (specialcounter <= 2) {
                        enemy.health -= user.specialAttack(user.attackpower);
                        break;
                    } else {
                        System.out
                                .println("You already used your special attack 2 times you will pass free this round");
                    }
            }

            System.out.println();
            user.health -= enemy.processofRound(user);
            System.out.println();
            System.out.println("Your current health : " + user.health);
            System.out.println("Enemies current health : " + enemy.health);
            System.out.println();

            if (enemy.health <= 0) {

                System.out.println("Congratulations you beat " + enemy.name);
                System.out.printf("Do you want to continue with %s or do you gonna exit\n", enemyname);
                continueornot = scan.nextLine().replace("i", "ı").toUpperCase();

                if (continueornot.equals("CONTINUE") && enemyname.equals("Dragon")) {
                    enemy = new Dragon("Dragon", 150, 18); 
                    System.out.println("Your health and special attack are restarted");
                    user.health = userhealthholder;
                    specialcounter = 0;
                }

                else if (continueornot.equals("CONTINUE")) {
                    System.out.println("Your health and special attack are restarted");
                    specialcounter = 0;
                    user.health = userhealthholder;
                    enemy = new Undead("Undead", 100, 12);
                    enemyname = "Dragon";
                }

                else if (continueornot.equals("EXIT")) {
                    System.out.println("Have a nice day");
                    break;
                }
            }

        }

        if (user.health <= 0) {
            System.out.println("You lost what kind of a hero are you ?");
        } else {
            System.out.println("Congratulations you beat the game you are the hero of ARC village");
        }

        scan.close();

    }
}
