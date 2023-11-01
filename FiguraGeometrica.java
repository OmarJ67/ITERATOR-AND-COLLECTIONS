import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Define una interfaz para figuras geométricas
interface FiguraGeometrica extends Comparable<FiguraGeometrica> {
    double calcularArea();
    double calcularPerimetro();
    String obtenerNombre();
    
    // Implementación de compareTo para ordenar por área
    @Override
    default int compareTo(FiguraGeometrica otraFigura) {
        double areaDiferencia = this.calcularArea() - otraFigura.calcularArea();
        if (areaDiferencia > 0) {
            return 1;
        } else if (areaDiferencia < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}