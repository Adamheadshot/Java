
public class lek12_uppg1 {

    public static void main(String[]args){
        int[]heltals_fält = {8,2,4,5,3,7,1,9,10,6};
        skriv_ut_fält(heltals_fält);
        int sum = beräkna_summa(heltals_fält); 
       System.out.println(sum);
       double medel = beräkna_medelvärdet(heltals_fält); 
       System.out.println(medel);

    }

    static void skriv_ut_fält(int[] ett_fält){
        for( int i = 0; i < ett_fält.length; i++ ){
            System.out.println(ett_fält[i]);
        }

    }

    static int beräkna_summa(int[] ett_fält){
        int summa = 0; 
        for(int i = 0; i < ett_fält.length; i ++){
            summa += ett_fält[i]; 
        }
         return summa; 

        


    }

    static double beräkna_medelvärdet(int ett_fält[]){
        int summa =beräkna_summa(ett_fält);
        double medelvärde = (double)summa/ ett_fält.length;
         return medelvärde;

    }

    static int hitta_tal(int ett_fält[], int talet){
        for(int i = 0; i<ett_fält.length; i++){
            if(int i = talet )
        }
        
    }
}
