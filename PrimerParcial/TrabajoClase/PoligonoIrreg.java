import java.util.*;

public class PoligonoIrreg {

    public Coordenada aux;

    List<Coordenada> vertices;

    public PoligonoIrreg() {
        vertices = new ArrayList<Coordenada>();
    }

    public void anadeVertice() {

        
        aux = new Coordenada(Math.random(), Math.random());
        vertices.add(aux);

    }

    public void ordenaVertice() {
        for (int i = 0; i < vertices.size(); i++) {
            
        }
    }

    @Override
    public String toString() {
        String rString = "";

        for (Coordenada coordenada : vertices) {
            rString = String.valueOf(coordenada);
            rString = rString + " ";
        }
        return rString;
    }
}
