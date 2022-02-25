import java.util.Scanner;

public class Cinco {
   
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        System.out.println("Dame un numero:  ");
        int num = lectura.nextInt();

        lectura.close();
        int i = num;
        while (i <= 150){
            num = i;
            System.out.print(num + " ");    
            i+=5;        
        }
        
        System.out.println("");
    }
}
