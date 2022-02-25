public class numeros {
   public static void main(String[] args) {
        int numeros[] = {1, 2, 3, 4, 5, 6, 7 ,8 ,9, 10, 11, 12, 13, 14, 15}; 
   
        for(int i = 0; i<= numeros.length-1; i++ ){

            System.out.printf("%d ",numeros[i]);

        }
        System.out.println(" ");

        for (int j = 14; j >= 0; j-=2) {
            System.out.printf("%d ",numeros[j]);
            
        }

        System.out.println(" ");
   }
}
