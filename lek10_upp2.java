
import java.util.Scanner;
public class lek10_upp2 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        try{ 
            System.out.println("Ange vad 10 ska delas med");
            int var1 = 10; 
            int var2 = scan.nextInt(); 
            
        }
        catch(Exception e){
            System.out.println("Skriv in ett heltal!");
        }

          
        int nuvarande = 0;

        try{
            int[] array = {6,3,5,9}; 

            for(int i = 0; i<10; i++){
                nuvarande = i;
                System.out.println("element nr "+i+"har värdet"+array[i]);
            }
        }
        catch(Exception e){
            System.out.println("Din array har inget element på plats " + nuvarande);
           
        }

        
    } 
    
    public static void sayHello() {
        System.out.println("Hello");
    }
}
