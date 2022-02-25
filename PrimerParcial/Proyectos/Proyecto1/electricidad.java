import java.util.Scanner;

public class electricidad {
   
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        System.out.println("Si va a pagar un hogar ingrese (1), si va a pagar un negocio ingrese (2)");
        int hogNeg = lectura.nextInt();
        System.out.println("Ingrese su consumo en KW");
        double kw = lectura.nextDouble();

        lectura.close();
        if (hogNeg == 1) {
            System.out.println("El total a pagar es: " + hogar(kw));
        } else if (hogNeg == 2) {
            System.out.println("El total a pagar es: " + negocio(kw));
        }else System.out.println("Opcion no valida");

    }

    public static double negocio(double kw) {
        
        double total = kw * 5;
        return total; 

    }

    public static double hogar(double kw) {
        
        double aux, total;
        if(kw <= 250){
            return kw * 0.65;
        }else if (kw <= 500) {
            aux = kw - 250;
            total = aux * 0.85;
            total += (250 * 0.65);
            return total;
        }else if (kw <= 1200) {
            aux = kw - 500;
            total = aux * 1.5;
            total += (250 * 0.85);
            total += (250 * 0.65); 
            return total;
        }else if (kw <= 2100) {
            aux = kw - 1200;
            total = aux * 2.5;
            total += (700 * 1.5);
            total += (250 * 0.85);
            total += (250 * 0.65);
            return total;
        }else if(kw > 2100){
            aux = kw - 2100;
            total = aux * 3;
            total += (600 * 2.5);
            total += (700 * 1.5);
            total += (250 * 0.85);
            total += (250 * 0.65);
            return total;

        } else return 0;

    }
}
