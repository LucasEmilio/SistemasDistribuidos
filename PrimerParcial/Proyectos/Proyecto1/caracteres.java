import java.util.Scanner;

public class caracteres {
    
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        System.out.println("Cuantos numeros quieres ingresar: ");
        int cant = lectura.nextInt();
        int num[] =new int[cant];

        System.out.println("Ingresa los numeros a continuacion: ");
        for (int i = 0; i < cant ; i++) {
            int aux =lectura.nextInt();
            num[i] = aux;
        }

        lectura.close();

        System.out.println("Tu cadena es: ");

        for (int i = 0; i < cant ; i++) {
            System.out.print(num[i] + " ");
        }

        System.out.println("\nTu cadena a la inversa es: ");

        for (int i = cant-1; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }

        System.out.println(" ");
    }
}
