import java.util.Scanner;

public class Enteros {
    
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        int[] num = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingresa un numero: ");
            num[i] = lectura.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(num[i] + " ");
        }

        lectura.close();

        System.out.println(" ");
    }
}
