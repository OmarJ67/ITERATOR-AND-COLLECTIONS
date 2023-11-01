import java.util.ArrayList;
import java.util.Iterator;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<Paleta<PaletaFresa>> paletas = new ArrayList<>();

        // Agregar paletas a la colección
        paletas.add(new Paleta<>("Fresa", 1.5, new PaletaFresa()));
        paletas.add(new Paleta<>("Fresa con Crema", 2.0, new PaletaFresa()));

        // Usar un iterador para recorrer y mostrar la información de las paletas
        Iterator<Paleta<PaletaFresa>> iterator = paletas.iterator();
        while (iterator.hasNext()) {
            Paleta<PaletaFresa> paleta = iterator.next();
            paleta.mostrarInformacion();
        }
    }
}
