import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class Main {
    public static void main(String[] args) {
        ArrayList<FiguraGeometrica> figuras = new ArrayList<FiguraGeometrica>();
        
        figuras.add(new Circulo(5));
        figuras.add(new Cuadrado(4));
        figuras.add(new Circulo(3));

        // Ordena las figuras por área utilizando la implementación de Comparable
        Collections.sort(figuras);

        // Usando un iterador para mostrar las características de las figuras
        Iterator<FiguraGeometrica> iterator = figuras.iterator();
        while (iterator.hasNext()) {
            FiguraGeometrica figura = iterator.next();
            System.out.println(figura.obtenerNombre());
            System.out.println("Área: " + figura.calcularArea());
            System.out.println("Perímetro: " + figura.calcularPerimetro());
            System.out.println();
        }
    }
}