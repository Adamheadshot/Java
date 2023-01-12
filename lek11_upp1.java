
import java.util.Scanner;
public class lek11_upp1 {
    public static void main(String[]args){
        lek10_upp2.sayHello();
        Scanner scan = new Scanner(System.in);
        //a) 
         
        System.out.println("skriv in namn:");
        String namn = scan.nextLine(); 

        System.out.println("Srkiv in lösenord");
        String lös = scan.nextLine(); 

        if(namn.equals("root") && lös.equals("pass")){
           System.out.println("ditt bankonto har 0 kr");
        }
        else{
            System.out.println("fel namn eller lösenord");
        }
        
        //b) 
        System.out.println("skriv in ett tal");
        int num1 = scan.nextInt(); 

        if(num1>10){
            System.out.println( "Number is larger than 10" );
        }
        else if(num1<=10){
            System.out.println("Number is smaller or equal to 10");
             
        }


    }
        
    }

