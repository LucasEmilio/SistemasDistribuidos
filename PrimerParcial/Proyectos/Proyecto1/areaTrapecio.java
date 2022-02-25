import java.util.Scanner;

public class areaTrapecio {
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingrese a: ");
        int a = lectura.nextInt();
        System.out.println("Ingrese b: ");
        int b = lectura.nextInt();
        System.out.println("Ingrese la altura: ");
        int altura = lectura.nextInt();
        
        lectura.close();

        int areaT = ((a + b)/2)*altura;

        System.out.println("El area del trapecio es de: " + areaT);
    }
}
