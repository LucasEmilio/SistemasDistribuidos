
public class cubo {

    public static void main(String[] args) {
        
        for(int i = 1 ; i < 5000 ; i++) {

           if(esCubo(i)) {
               System.out.println(i);
           }
        }
 
    }

    public static boolean esCubo(int numero) {
        
        int n = numero;
        int suma = 0;
        int digito = 0;
        while (n > 0) {
            
            digito = n % 10;
            suma += digito*digito*digito;
            n /= 10;
        }
        return suma == numero;
 
    }

}