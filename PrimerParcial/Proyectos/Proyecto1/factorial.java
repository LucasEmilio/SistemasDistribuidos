import java.util.Scanner;

public class factorial {

    public static void main( String[] args ) {
        
        Scanner lectura = new Scanner(System.in);

        System.out.println( "Ingrese un numero: " );
        int numero = lectura.nextInt();

        lectura.close();
        System.out.println( "El factorial de " + numero + " es: " + fact( numero ) );      
   }
 
   public static int fact( int numero ) {
      int fact = 1;
      for( int i = 1; i <= numero; i++ ) {
         fact *= i;
      }
 
      return fact;
    }
 
}