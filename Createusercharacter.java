

public class Createusercharacter {

public Characters createCharacter(int number , String username){
switch(number){

    case 1 :
    return new Warrior("Warrior", username, 120, 15);
    

    case 2 :
    return new Mage("Mage", username, 90, 12); 
    

    case 3 :
    return new Rogue("Rogue", username, 100, 10);
    
} 

return new Warrior(username, username, number, number);
}

}
