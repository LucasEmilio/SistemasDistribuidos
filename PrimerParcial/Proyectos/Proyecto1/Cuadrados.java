import java.util.ArrayList;
import java.util.Scanner;

public class Cuadrados {
    
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingresa un numero: ");
        int num = lectura.nextInt();
        ArrayList<Integer> aList = new ArrayList<>();
        int j = 0;
        while(num != 0){
            
            aList.add(num);
            num = lectura.nextInt();
            j++;
        }
        lectura.close();
        System.out.println("tu arreglos es: \n" + aList + "\n");
        System.out.println("Tu arreglo al cuadrado es: \n");
        System.out.print("[");
        int numb;
        for (int i = 0; i < j; i++) {
            numb = aList.get(i);
            numb = (int)Math.pow(numb, 2);
            System.out.print(numb + ", ");
        }

        System.out.print("]\n");
    }

}
