import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Clase genérica para representar una paleta
class Paleta<T> {
    private String sabor;
    private double precio;
    private T tipoEspecifico;

    public Paleta(String sabor, double precio, T tipoEspecifico) {
        this.sabor = sabor;
        this.precio = precio;
        this.tipoEspecifico = tipoEspecifico;
    }

    public String getSabor() {
        return sabor;
    }

    public double getPrecio() {
        return precio;
    }

    public T getTipoEspecifico() {
        return tipoEspecifico;
    }

    public void mostrarInformacion() {
        System.out.println("Sabor: " + sabor);
        System.out.println("Precio: $" + precio);
        System.out.println("Tipo Específico: " + tipoEspecifico);
    }
}


