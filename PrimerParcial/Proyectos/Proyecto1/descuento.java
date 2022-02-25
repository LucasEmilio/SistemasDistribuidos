import java.util.Scanner;

public class descuento {

    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingresa tu edad: ");
        int edad = lectura.nextInt();
        System.out.println("Ingresa tu nombre: ");
        String nombre = lectura.next();
        System.out.println("Ingresa tu cuenta: ");
        double cuenta = lectura.nextDouble();

        lectura.close();

        if(name(nombre) == true || age(edad) == true){
            System.out.println("Tu cuenta es de " + promo(cuenta));
        } else System.out.println("No entras en la promocion");
       
    }

    public static boolean name(String nombre) {

        nombre.toLowerCase();
        if(nombre == "tere" || nombre == "teresa"  || nombre == "teresita" ){
            return true;
        }else return false;

    }

    public static boolean age(int edad) {
        if (edad >= 16 || edad <= 22) {
            return true;
        }else return false;
    }

    public static double promo(double cuenta) {
        double descuento, total;
        descuento = cuenta *  0.7;
        total = cuenta - descuento;
        return total;
    }
}
