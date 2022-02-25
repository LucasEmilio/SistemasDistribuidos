import java.util.Random;
public class Azar {
    
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println("Vamos a hacer un arreglo de 10 elementos");
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt();
            System.out.print(arr[i] + " ");
        }

        burbuja(arr);

        System.out.println("\nEl numero mas bajo es: " + arr[0]);
        System.out.println("El numero mas alto es: " + arr[9]);
        
    }

    public static int[] burbuja(int[] arreglo)
    {
      int auxiliar;
      int[] arregloOrdenado;
      for(int i = 2; i < arreglo.length; i++)
      {
        for(int j = 0;j < arreglo.length-i;j++)
        {
          if(arreglo[j] > arreglo[j+1])
          {
            auxiliar = arreglo[j];
            arreglo[j] = arreglo[j+1];
            arreglo[j+1] = auxiliar;
          }   
        }
      }
      arregloOrdenado = arreglo;
      return arregloOrdenado;
    }
}
