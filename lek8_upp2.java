import java.util.Arrays;
import java.util.Scanner;

public class lek8_upp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        // System.out.print("Skriv in ett heltal: ");
    
        // int num1 = scanner.nextInt(); 
        // int sum = 0; 
        // String output = "";

        // for(int i=1; i<=num1; i++){
        //     sum += i; 
            
        //     String suffux = i == num1 ? "" : " + ";
        //     output = output + i + suffux;
        // }
        // System.out.println(output + " = " + sum);

        int[] tal = new int[10]; 
        int counter = 0;

        System.out.println("Ange tal, sista ska vara minus; ");
        String str = scanner.nextLine().trim();
        String previousNumber = "";

        for (int i = 0; i < str.length(); i++) {
            String character = str.substring(i, i + 1);
            System.out.println("Char: " + character);
            previousNumber = previousNumber + character;

            if ((character.equals(" ") || i == 0 || i == str.length() - 1) && ! previousNumber.equals(" ")) {
                System.out.println("Previous: " + previousNumber);
                int number = Integer.parseInt(previousNumber.trim());
                tal[counter++] = number;
                previousNumber = "";
            }
        }

        System.out.println(Arrays.toString(tal));
        
    }


}