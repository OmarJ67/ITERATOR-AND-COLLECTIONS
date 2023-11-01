// Implementa las clases concretas para diferentes figuras geométricas
class Circulo implements FiguraGeometrica {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    public String obtenerNombre() {
        return "Círculo";
    }
}
