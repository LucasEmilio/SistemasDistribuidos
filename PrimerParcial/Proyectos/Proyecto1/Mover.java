import java.util.Scanner;

public class Mover {
    
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        System.out.println("Vamos a hacer un arreglo de 10 elementos");
        int[] x = new int[10];
        for (int i = 0; i < 10; i++) {
            x[i] = lectura.nextInt();
        }

        lectura.close();

        int[] z = new int[10];
        z[0] = x[9];
        System.out.print("Tu arreglo recorrido es: \n" + z[0] + " ");
        for (int i = 1; i < z.length; i++) {
            z[i] = x[i-1];
            System.out.print(z[i] + " ");
        }
        System.out.println(" ");
    }
}
