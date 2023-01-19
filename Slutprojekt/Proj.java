import java.util.Scanner;
public class Proj {
    static int playerhp = 100; 
    static int opponenthp = 100;


    public static void main(String[] args) {
       mainmenu(); 
       
        

        
    }

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

        String Char = "";
        
        while (true) {
            System.out.println("What character do you want to play as?");
            Char = scan.nextLine(); 
            String numbersWord[] = {"first", "second", "third"}; 
            String numbers[] = {"1", "2", "3"}; 

            boolean found = false;

            for (String element : numbersWord) {
                if (element.toLowerCase().equals(Char.toLowerCase())) {
                    found = true;
                    break;
                }
            }
            for (String element : numbers) {
                if (element.toLowerCase().equals(Char.toLowerCase())) {
                    found = true;
                    break;
                };
            }
        
            if (found) break;
        }

        System.out.println("Exellent choice");
    }

    static void attackandblock() {
        Scanner attack = new Scanner(System.in);
        System.out.println("");

    }
}