import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class datos {
      
    public static void main(String[] args) throws FileNotFoundException {

        File datos = new File("datos.txt");
        PrintWriter pw = new PrintWriter(datos);
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingresa tu edad: ");
        int edad = lectura.nextInt();
        System.out.println("Ingresa tu estatura: ");
        float estatura = lectura.nextFloat();
        
        while(edad != 0){
            if(datos.exists()){
                pw.println(edad + ", " + estatura + "\n");
                System.out.println("Ingresa tu edad: ");
                edad = lectura.nextInt();
                System.out.println("Ingresa tu estatura: ");
                estatura = lectura.nextFloat();
            }else{
                datos.mkdirs();
                pw.append(edad + ", " + estatura + "\n");
                System.out.println("Ingresa tu edad: ");
                edad = lectura.nextInt();
                System.out.println("Ingresa tu estatura: ");
                estatura = lectura.nextFloat();
            }
        }

        pw.close();
        lectura.close();
    }
    
}
