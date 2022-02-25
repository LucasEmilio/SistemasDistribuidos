import java.util.Scanner;

public class Arreglo {
    
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        System.out.println("Vamos a hacer un arreglo de 10 elementos");
        int[] x = new int[10];
        for (int i = 0; i < 10; i++) {
            x[i] = lectura.nextInt();
        }

        System.out.println("Vamos a hacer otro arreglo de 10 elementos");
        int[] y = new int[10];
        for (int i = 0; i < 10; i++) {
            y[i] = lectura.nextInt();
        }

        lectura.close();

        System.out.println("Tu tercer arreglo es: ");
        int[] z = new int[20];
        for (int i = 0; i < 10; i++) {
            z[i] = x[i];
            z[i+1] = y[i];
            System.out.print(z[i] + " " + z[i+1] + " ");
        }
        
        System.out.println(" ");
    }
}
