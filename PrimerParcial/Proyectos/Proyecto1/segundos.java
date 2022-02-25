import java.util.Scanner;

public class segundos {
    
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingrese los segundos a convertir");
        int segundos = lectura.nextInt();

        lectura.close();

        //convirtiendo los segundos a minutos
        int minutos = segundos/60;
        int modSeg = (segundos%60);
        System.out.println("TIEMPO EN MINUTOS");
        System.out.println(segundos + " segundos son en total " + minutos + " minutos con " + modSeg + " segundos." );

        //convirtiendo de minutos a horas
        int horas = minutos/60;
        int modMin = minutos%60;
        System.out.println("TIEMPO EN HORAS");
        System.out.println(segundos + " segundos son en total " +  horas + "horas con " + modMin + " minutos y " + modSeg + "segundos");
    }
    
}
