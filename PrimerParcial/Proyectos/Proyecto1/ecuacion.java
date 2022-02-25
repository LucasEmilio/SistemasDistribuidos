import java.util.Scanner;

public class ecuacion {
 
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);

        System.out.println("Igrese a: ");
        int a = lectura.nextInt();
        System.out.println("Igrese b: ");
        int b = lectura.nextInt();
        System.out.println("Igrese c: ");
        int c = lectura.nextInt();

        lectura.close();

        double resultados[] =  ecuacion2doG(a, b, c);
        
        if (resultados == null) {
            System.out.println("La solucion de esta ecuacion no es un numero real");
        } else {
            for (int i = 0; i < resultados.length; i++) { 
                System.out.println("Resultado " + (i+1) + " es: " + resultados[i]);
            }
        }
 
    } 
    
    public static double[] ecuacion2doG(int a, int b, int c) { 

        double discriminante = (Math.pow(b, 2) - (4 * a * c)); 
        if (discriminante >= 0) {
 
            double soluciones[];
 
            // Una solucion
            if (discriminante == 0) {
 
                soluciones = new double[1];
                soluciones[0] = ((-b) - (4 * a * c)) / (2 * a);
 
            // Dos soluciones
            } else {
 
                soluciones = new double[2];
                soluciones[0] = ((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
                soluciones[1] = ((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
 
            }
 
            return soluciones;
        
        // Sin solucion
        } else {
            
            return null;

        }
 
    }
 
}