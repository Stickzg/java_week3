import com.flowacademy.vonat.Ellenőr;
import com.flowacademy.vonat.Utas;



public class UtasMain {
    public static void main(String[] args) {

        int numberOfPassengers = args.length/5;
        Utas[] utasok = new Utas[numberOfPassengers];
        int n = 0;

        for (int i = 0; i < args.length; i+=5) {
            if( n < numberOfPassengers) {
                utasok[n] = new Utas(args[i] + args[i+1], Integer.parseInt(args[i + 2]),
                        Integer.parseInt(args[i+3]), Boolean.getBoolean(args[i + 4]));
                n++;
            }
        }

        Ellenőr pista = new Ellenőr("Pista", 43);


        for (Utas utas:utasok) {
            utas.felszall();
        }
        for (Utas utas:utasok) {
            pista.ellenoriz(utas);
        }
    }
}
