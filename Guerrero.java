class Guerrero extends PersonajeGenerica<Personaje> {
    public Guerrero(String nombre, int puntosVida) {
        super(nombre, puntosVida);
    }

    public void atacar(Personaje objetivo) {
        System.out.println(this.obtenerNombre() + " golpea con su espada a " + objetivo.obtenerNombre());
    }
}




