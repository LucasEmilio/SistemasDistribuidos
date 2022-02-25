import java.util.Scanner;

public class multiplo {

    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingresa el primer numero: ");
        int x = lectura.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        int y = lectura.nextInt();

        lectura.close();
        
        System.out.println(isMult(x, y));

    }

    public static String isMult(int x, int y) {
        double multiplo;
        if(x < y){
            multiplo = y%x;
            if(multiplo == 0){
                return y + " es multiplo de " + x;
            }else return "no es multiplo";
        }else if (x > y ) {
            multiplo = x%y;
            if(multiplo == 0){
                return x + " es multiplo de " + y;
            }else return "no es multiplo";
       }else return "los numeros son iguales";
    }
}
