



public class lek9_upp12 {
    public static void main(String[]args){ 
        double svar = omkretsCirkel(9.0);
        System.out.println("produkten "+svar);
        ritaLinje(23); 
        ritaRektangel(20, 8);
        char answer1 = tecken(-3);
        char answer2 = tecken(5);
        System.out.println(answer1);
        System.out.println(answer2);
        boolean svar3 = siffra('a');
        System.out.println(svar3);

    }
      
    static double omkretsCirkel( double radie )
    {
        double omkrets = radie*2*Math.PI; 
        return omkrets; 
    }

    static void ritaLinje(int längd)
    {
        for(int i=0; i<längd; i++){
            System.out.print("-");
        }
        System.out.println("");
    }


    static void ritaRektangel (int höjd, int bredd)
    {
       for(int i=0; i<höjd; i++){
        System.out.println("");
        for(int j=0; j<bredd; j++){
            System.out.print("*");
        }
       }
       System.out.println("");
    }

    static char tecken(double tal)
    {
       if(tal>0)
            return '+'; 
        else
            return '-';
     
    }

    static boolean siffra(char tecken2)
    {
        char[]falt = {'0','1','2','3','4','5','6','7','8','9'}; 
        for(char element: falt){
            if(tecken2==element)
            return true; 
        }
        return false; 
    }


    
}
