import java.util.Scanner;

public class volumen{
    public static void main(String[] args) {
    
        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingrese la altura: ");
        int altura = lectura.nextInt();
        System.out.println("Ingrese el radio: ");
        int radio = lectura.nextInt();

        lectura.close();

        double cilindroVolumen =  (Math.PI*Math.pow(radio, 2)*altura);
        double conoVolumen = ((Math.PI*Math.pow(radio, 2)*altura))/3;
        double diferencia = cilindroVolumen - conoVolumen;

        System.out.println("El volumen del cono es: " + conoVolumen);
        System.out.println("El volumen del cilindro es: " + cilindroVolumen);
        System.out.println("La diferencia entre los volumenes es: " + diferencia);
 

    }
}