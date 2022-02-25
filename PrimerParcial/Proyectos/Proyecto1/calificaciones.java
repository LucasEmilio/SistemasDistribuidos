/*(A - Muy bien) = 90-100, 
(B = Bien) 80 - 89, 
(C - Suficiente) = 60 -79, 
(F - No suficiente) = 0 - 59.*/
import java.util.Scanner;

public class calificaciones {
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        System.out.println("Si quiere el sistema de letras ingrese 1");
        System.out.println("Si quiere la descripcion ingrese 2");
        int ingreso = lectura.nextInt();

        if (ingreso == 1 || ingreso == 2) {
            System.out.println("Ingrese su puntaje: ");
            int puntaje = lectura.nextInt();

            lectura.close();

            if(puntaje >= 0 && puntaje <= 100){
                String calificacion = calif(ingreso, puntaje);
                System.out.println(calificacion);
            }else{
                System.out.println("Puntaje no valido");
            }
        }else{
            System.out.println("Opcion no valida");
        }
            
    }

    public static String calif(int ingreso, int puntaje) {

        if (ingreso == 1) {
            if(ingreso >= 90 || ingreso <= 100){
                return "Su puntaje es A";
            }else if (ingreso >= 80 || ingreso <= 89) {
                return "Su puntaje es B";
            }else if (ingreso >= 70 || ingreso <= 79){
                return "Su puntaje es C";
            }else{
                return "Tu puntaje es F";
            }
        } else if (ingreso == 2) {
            if(ingreso >= 90 && ingreso <= 100){
                return "Muy bien";
            }else if (ingreso >= 80 && ingreso <= 89) {
                return "Bien";
            }else if (ingreso >= 70 && ingreso <= 79){
                return "Suficiente";
            }else{
                return "No Suficiente";
            }            
        } else {
            return null;
        }   
    }
}
