import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Define la interfaz para los personajes del videojuego
interface Personaje {
    void atacar(Personaje objetivo);
    void recibirDanio(int cantidadDanio);
    String obtenerNombre();
    int obtenerPuntosVida();
}
