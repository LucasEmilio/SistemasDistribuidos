public class Algebra {
   public static void main(String[] args) {

       int [][] matriz = {{1,2,3,4,5}, {2,3,4,5,6}, {3,4,5,6,7}, {4,5,6,7,8}, {5,6,7,8,9,0}};
       int x = 0;

        for (int i = 0; i < 5; i++) {
            x += matriz[i][i];
        }

        System.out.println(x);
   } 
}
