public class PruebaRectangulo {

    public static void main (String[] args) {

        

       // Rectangulo rect1 = new Rectangulo(2,3,5,1);

        double ancho, alto;
        
        Coordenada c1 = new Coordenada(2, 3);
        Coordenada c2 = new Coordenada(5, 1);

        Rectangulo rect2 = new Rectangulo(c1, c2);

        System.out.println("Calculando el área de un rectángulo utilizando el constructor con objetos coordenadas:");

        System.out.println(rect2);

        alto = rect2.superiorIzquierda().ordenada() - rect2.inferiorDerecha().ordenada();

        ancho = rect2.inferiorDerecha().abcisa() - rect2.superiorIzquierda().abcisa();

        System.out.println("El área del rectángulo es = " + ancho*alto);

    }

}