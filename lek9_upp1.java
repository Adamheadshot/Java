public class lek9_upp1 {

 public static void main(String[]args){
    System.out.println("starta program");
    säghej(); 
    säghejXggr(2); 
    sägngtantalggr("TE21C ", 3);
    int svar = ggr(3,6); 
    System.out.println("produkten är "+svar);

}

static void säghej( )
{
    System.out.println("hej från metod");
}

static void säghejXggr(int X)
{
    for (int i = 0; i < X; i++) {
        System.out.println("hej inifrån");
    }
}

static void sägngtantalggr(String ngt, int X)
{
    for (int i = 0; i < X; i++) {
        System.out.println(ngt+"hej inifrån");
}


}

static int ggr(int tal1, int tal2)
{
  int produkt = tal1*tal2; 
  return produkt; 
}


}


