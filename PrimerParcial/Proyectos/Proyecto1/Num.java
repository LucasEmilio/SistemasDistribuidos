import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Num {
    
    public static void main(String[] args) throws IOException {
        
        File f = new File("num.txt");

        try {
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);

        String linea = br.readLine();

        System.out.println();

        while(linea != null) {
            System.out.println(linea);
            linea = br.readLine();
        }

        br.close();
        } catch(IOException e) {
        e.printStackTrace();
        }FileReader num = new FileReader("num.tx");
                BufferedReader br = new BufferedReader(num);
                ArrayList<String[]> AUX = new ArrayList<>();
                String cadena = null;
                
                int lineas;
                lineas =0;

                while (cadena!=null) {
                    cadena= br.readLine();
                    if (cadena!=null) {
                        AUX.add(cadena.split(","));
                        lineas++;
                    }
                }
                
            }
}
