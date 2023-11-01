// Clase que representa otro tipo de personaje específico
class Mago extends PersonajeGenerica<Personaje> {
    public Mago(String nombre, int puntosVida) {
        super(nombre, puntosVida);
    }

    public void atacar(Personaje objetivo) {
        System.out.println(this.obtenerNombre() + " lanza un hechizo a " + objetivo.obtenerNombre());
    }
}
