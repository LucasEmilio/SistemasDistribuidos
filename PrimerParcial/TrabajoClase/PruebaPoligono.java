public class PruebaPoligono {

    public static void main(String[] args) {

        int n = 10;
        PoligonoIrreg pol1 = new PoligonoIrreg();
        for (int i = 0; i < n; i++) {
            pol1.anadeVertice();
            pol1.ordenaVertice();
            System.out.println(pol1.toString());
        }
        

    }
    
}
