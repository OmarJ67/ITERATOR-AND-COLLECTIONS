import java.util.ArrayList;
import java.util.Iterator;
public class Main2 {
    public static void main(String[] args) {
        ArrayList<Personaje> personajes = new ArrayList<>();
        
        // Agregar personajes a la colección
        personajes.add(new Guerrero("Omar", 100));
        personajes.add(new Mago("Gandalf", 80));
        personajes.add(new Guerrero("Aragorn", 120));

        // Usar un iterador para recorrer y operar con los personajes
        Iterator<Personaje> iterator = personajes.iterator();
        while (iterator.hasNext()) {
            Personaje personaje = iterator.next();
            personaje.atacar(personajes.get(0)); // Todos atacan al primer personaje en la colección
            personaje.recibirDanio(20);
        }
    }
}
