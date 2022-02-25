import java.nio.ByteBuffer;
import java.util.*;
public class nPalabras {

    public static void main(String[] args) {
        
        int n= Integer.parseInt(args[0]);
        byte[] cadenota = new byte[n*4];
        //int count = 0;
        ByteBuffer conc = ByteBuffer.allocate(n*4);
        for (int i = 0; i < n; i++) {
            String randPal = palabra();
            byte[] aux = randPal.getBytes();
            conc.put(cadenota);
            conc.put(aux);
            cadenota = conc.array();
            /*cadenota = aux;*/
            
            /*String ipn = "IPN";
            if(str.contains(ipn)){
                count++;
            }*/
            
        }
        String str = new String(cadenota);
        System.out.print(str);
        //System.out.println("\n\nVeces que se encontro IPN: " + count);
        
        System.out.println("\n" + "Tiempo de ejecucion:  " + System.nanoTime() + " ns");  
    }

        public static char caracterRandom() {
            Random random = new Random();
            char caracterRandom = (char) (random.nextInt(26) + 'A');
            return caracterRandom;
        }

        public static String palabra(){
            String word;
            word = String.format("%c", caracterRandom())  + String.format("%c", caracterRandom()) + String.format("%c", caracterRandom()) + " ";
            return word;
        }

}
