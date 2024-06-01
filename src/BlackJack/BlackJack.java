package BlackJack;

import java.util.Random;

public class BlackJack {

    private static final String SEP = System.lineSeparator();

     private static int[] jLapok=new int[10];
   private static int[] gLapok=new int[10];
   private static Random rnd=new Random();
   
    public static void main(String[] args) {
        jatek();
    }

    private static void jatek() {
        
        inicializalas();
        
    }

    private static void inicializalas() {
        kezdoAllapot();
        konzolraIr("Jatekos lapjai(%d, %d)".formatted(jLapok[0], jLapok[1]) + SEP);
        konzolraIr("Gep lapjai(%d, %d)".formatted(gLapok[0], gLapok[1])+ SEP);
        huzas();
    }

    private static int laphuzas() {
       int huzas=rnd.nextInt(2, 11);
       return huzas;
    }

    private static void kezdoAllapot() {
        for(int i=0; i<2; i++){
            jLapok[i]=laphuzas();
            gLapok[i]=laphuzas();
        }    
    }
    
    private static void huzas() {
        int kor=2;
        
        if(jatekosOsszeg()<15){
                jLapok[kor]=laphuzas();
        } else if (jatekosOsszeg()>21){
            konzolraIr("Jatekos vesztett");
        } else{
            konzolraIr("Ker?(I/N)");
        }
    
            
     }
     
    private static void konzolraIr(String kimenet) {
        System.out.print(kimenet);    
    }

    private static int jatekosOsszeg() {
        int osszeg = 0;
        for (int i = 0; i < jLapok.length; i++) {
            osszeg +=jLapok[i];
        }
        return osszeg;
    }

}