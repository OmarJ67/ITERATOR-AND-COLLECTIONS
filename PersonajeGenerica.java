// Implementación de una clase genérica para personajes del videojuego
class PersonajeGenerica<T> implements Personaje {
    private String nombre;
    private int puntosVida;

    public PersonajeGenerica(String nombre, int puntosVida) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
    }

    public void atacar(Personaje objetivo) {
        System.out.println(this.obtenerNombre() + " ataca a " + objetivo.obtenerNombre());
    }

    public void recibirDanio(int cantidadDanio) {
        puntosVida -= cantidadDanio;
        if (puntosVida <= 0) {
            System.out.println(this.obtenerNombre() + " ha sido derrotado.");
        }
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerPuntosVida() {
        return puntosVida;
    }
}
