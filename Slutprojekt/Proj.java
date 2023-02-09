import java.util.Scanner;
public class Proj {
    static int playerhp = 100; 
    static int opponenthp = 100;

    public static void main(String[] args) {
        mainmenu();
       while(playerhp>0 && opponenthp>0){
        attack(); 
        botattack(); 
       }  
    }
    //Det här är min start meny. 
    static void mainmenu(){
        Scanner scan = new Scanner(System.in);
        
        String message = """
            Hello and welcome to Game of champions! 

            This is a text-based fighting game. 
            You will have to earn respect by beating a series of different bosses. 
            Only the bravest, strongest and most intelligent ones succeed in winning against the final boss.
                                    
                                         CRAZY JOHAN!!!

            Do you think you have what it takes to become a true champion and beat Johan?

            You can choose between 3 different characters.
                                          1st character
                                          2 meter tall
                                               Male 
                                          Muay thai fighter 
                             Attacks with devastating kicks and punches
                                           Good blocking 
            
                                           2nd character 
                                           1.70 meter tall 
                                               Female 
                                           Big 50 kg sword
                                        Attacks with the sword 
                                               STRONG! 
                                            3rd characters
                                            2.30 meter tall 
                                             Rock monster 
                                      Goes crazy with rock attacks
                                 Attacks with punches and throws rocks
                                                Tank""";
        System.out.println(message);

        
        /*
        Här använder jag en while och for loop 
        för att göra att användaren skriver in rätt kommandon. 
        Sedan anvönder jag mig av en array för att kunna itterera över alla tillåtna värden 
        använderen ska kunna 
        skriva både 1, 2 eller 3 eller first, second eller third
        Jag typkonvertar även bara för att visa att jag kan göra det :) 
        Varsågod Jowhan 
         */
        char tecken = '0';
        while (true) {
            System.out.println("What character do you want to play as?");
            int tex_tal =(int) tecken ;
            String c = scan.nextLine(); 
            String numbersWord[] = {"first", "second", "third"}; 
            String numbers[] = {"1", "2", "3"}; 

            boolean found = false;
            

            for (String element : numbersWord) {
                if (element.toLowerCase().equals(c.toLowerCase())) {
                    found = true;
                    break;
                }
            }
            for (String element : numbers) {
                if (element.toLowerCase().equals(c.toLowerCase())) {
                    found = true;
                    break;
                };
            }
        
            if (found) break;
            System.out.println("That is not a valid input, Chose betwen 1, 2, 3 or First, second , third ");
        }

        System.out.println("Exellent choice");
    }
    /*
     Detta är en metod för spelarens attacker 
     */
    static void attack() {
        String attack = ""; 
        Scanner scan = new Scanner(System.in);
        System.out.println(" Chose between hig attack = Q (20 damage), Mid attack = W (15 damage) and Low attack = E (10 damage)");
        int attackhigh = 20; 
        int attackmid = 15; 
        int attacklow = 10; 
        attack = scan.nextLine(); 
        
        switch (attack.toLowerCase()) {
            case ("q"):
             botblock(1, attackhigh);
              break;
            case ("w"):
             botblock(2, attackmid);
              break;
            case ("e"):
            botblock(3, attacklow);
            break; 
            default: 
            System.out.println("You my friend have not yet learnd your potentail next time chose between q, w or e to unleash your true power ");
          }
    }

    static void botblock(int attack, int damage){
        int block = (int)(Math.random() * 3+1); 
        if(attack == block){
            System.out.println("Your opponent blocked!");
            System.out.println("opponent hp is "+opponenthp);
        }
        else{
            opponenthp -= damage; 
            System.out.println("you hit oponent for "+damage);
            System.out.println("opponent hp is "+opponenthp);
        }
    }
    static void botattack(){
        int attack = (int)(Math.random() * 3+1); 
        int damage = 0; 
        if(attack == 1){
            damage = 20; 
        }
        else if (attack == 2){
            damage = 15; 
        }
        else{
            damage = 10; 
        }
        System.out.println("Bot is attacking you you");
        System.out.println("You can chose to block Q = high, W = mid, E = low");
        Scanner scan = new Scanner(System.in);
        String block = scan.nextLine(); 
        if(block.equalsIgnoreCase("q")){
            if(attack == 1){
                System.out.println("You blocked!");
            }
            else{
                System.out.println("You got hit!");
                playerhp -= damage; 
            }
        }
        else if(block.equalsIgnoreCase("w")){
            if(attack == 2){
                System.out.println("You blocked!");
            }
            else{
                System.out.println("You got hit!");
                playerhp -= damage; 
            }
        }
        else if(block.equalsIgnoreCase("e")){
            if(attack == 3){
                System.out.println("You blocked!");
            }
            else{
                System.out.println("You got hit!");
                playerhp -= damage; 
            }
           
    }
    System.out.println("Your hp is "+playerhp); 
    }
}